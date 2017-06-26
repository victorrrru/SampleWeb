package cn.sample.loan.service;


import cn.itht.dto.ResultDto;
import cn.itht.exception.ServiceOperationException;
import cn.itht.mybatis.criteria.Criteria;
import cn.itht.mybatis.criteria.ExpressionFactory;
import cn.sample.common.AliTools;
import cn.sample.common.FacePPUtil;
import cn.sample.common.IDCardUtil;
import cn.sample.loan.entity.CreditApply;
import cn.sample.loan.mapper.CreditApplyMapper;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.annotation.Resource;

import cn.sample.loan.web.CreditApplyAction;
import cn.sample.loan.web.bo.CreditApplyDto;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 业务实现层 - 表：credit_apply
 * @since 2017-06-23 10:44:54
 */
@Service("creditApplyService")
public class CreditApplyService implements Serializable {
	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(CreditApplyAction.class);
	@Resource
	private CreditApplyMapper creditApplyMapper;
	private FacePPUtil.FacePPIDCardInfo idCardInfo;

	public ResultDto creditIdCard(CreditApplyDto applyDto) {
		ResultDto result = new ResultDto();

		applyDto.setFront(AliTools.ossPrefix + applyDto.getFront());
		applyDto.setBack(AliTools.ossPrefix + applyDto.getBack());
		applyDto.setFace(AliTools.ossPrefix + applyDto.getFace());

		try {
			idCardInfo = FacePPUtil.getIDCard(applyDto.getFront());
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new ServiceOperationException("身份证识别失败");
		}
		if (StringUtils.isEmpty(idCardInfo.getName())) {
			throw new ServiceOperationException("身份证识别信息不全");
		}
		List<CreditApply> creditApplies = creditApplyMapper.selectByCriteria(Criteria.create(CreditApply.class)
				.add(ExpressionFactory.eq("memberId", applyDto.getMemId())));
		if (CollectionUtils.isNotEmpty(creditApplies)) {
			throw new ServiceOperationException("该身份证已授信");
		}
		CreditApply creditApply = new CreditApply();
		Calendar calendar = Calendar.getInstance();
		calendar.set(Integer.parseInt(idCardInfo.getBirthday().getString("year")),
				Integer.parseInt(idCardInfo.getBirthday().getString("month"))-1,
				Integer.parseInt(idCardInfo.getBirthday().getString("day")));
		creditApply.setBirthday(calendar.getTime());
		creditApply.setIdCard(idCardInfo.getId_card_number());
		creditApply.setName(idCardInfo.getName());
		creditApply.setAddress(idCardInfo.getAddress());
		creditApply.setSex((byte)("男".equals(idCardInfo.getGender()) ? 0 : 1));
		creditApply.setNation(idCardInfo.getRace());
		creditApply.setMemberId(applyDto.getMemId());
		creditApply.setNativePlace(IDCardUtil.nativePlace(idCardInfo.getId_card_number()));
		creditApplyMapper.insertSelective(creditApply);
		result.setData(creditApply);
		return result;
	}
}