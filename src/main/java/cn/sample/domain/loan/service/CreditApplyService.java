package cn.sample.domain.loan.service;


import cn.itht.exception.ServiceOperationException;
import cn.sample.common.Enum.CreditApplyStateEnum;
import cn.sample.common.Enum.CreditApplyStepEnum;
import cn.sample.common.FacePPUtil;
import cn.sample.common.IDCardUtil;
import cn.sample.domain.loan.entity.CreditApply;
import cn.sample.domain.loan.entity.CreditApplyExample;
import cn.sample.domain.loan.mapper.CreditApplyMapper;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;

import cn.sample.webapi.loan.CreditApplyAction;
import cn.sample.webapi.loan.bo.CreditApplyIdCardDto;
import cn.sample.webapi.loan.bo.CreditApplyDrivingDto;
import cn.sample.webapi.loan.bo.CreditApplyPersonalDto;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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

	/**
	 * 将身份证上的个人信息存入数据库
	 * @param data
	 * @return
	 */
	public CreditApply insertIdCardInfo(CreditApplyIdCardDto data) {
		try {
			idCardInfo = FacePPUtil.getIDCard(data.getFront());
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new ServiceOperationException("身份证识别失败");
		}
		if (StringUtils.isEmpty(idCardInfo.getName())) {
			throw new ServiceOperationException("身份证识别信息不全");
		}
		CreditApplyExample example = new CreditApplyExample();
		example.createCriteria().andMemberIdEqualTo(data.getMemberId());
		List<CreditApply> creditApplyList = creditApplyMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(creditApplyList)) {
			throw new ServiceOperationException("该身份证已授信");
		}
		CreditApply creditApply = new CreditApply();
		creditApply.setApplyState((byte) CreditApplyStateEnum.APPLYING.getIndex());
		creditApply.setApplyStep((byte) CreditApplyStepEnum.FACE.getStep());
		creditApply.setApplyTime(new Date());
		Calendar calendar = Calendar.getInstance();
		calendar.set(Integer.parseInt(idCardInfo.getBirthday().get("year").asText()),
				Integer.parseInt(idCardInfo.getBirthday().get("month").asText())-1,
				Integer.parseInt(idCardInfo.getBirthday().get("day").asText()));
		creditApply.setBirthday(calendar.getTime());
		creditApply.setIdCard(idCardInfo.getId_card_number());
		creditApply.setName(idCardInfo.getName());
		creditApply.setAddress(idCardInfo.getAddress());
		creditApply.setSex((byte)("男".equals(idCardInfo.getGender()) ? 0 : 1));
		creditApply.setNation(idCardInfo.getRace());
		creditApply.setMemberId(data.getMemberId());
		creditApply.setNativePlace(IDCardUtil.nativePlace(idCardInfo.getId_card_number()));
		creditApplyMapper.insertSelective(creditApply);
		return creditApply;
	}

	/**
	 * 将车辆信息存入数据库
	 * @param data
	 * @return
	 */
	public void updateDrivingInfo(CreditApplyDrivingDto data) {
		CreditApplyExample example = new CreditApplyExample();
		example.createCriteria().andMemberIdEqualTo(data.getMemId());
		List<CreditApply> creditApplyList = creditApplyMapper.selectByExample(example);
		if (CollectionUtils.isEmpty(creditApplyList)) {
			throw new ServiceOperationException("请先上传身份证");
		}
		CreditApply creditApply = creditApplyList.get(0);
		if (creditApply.getApplyStep() != CreditApplyStepEnum.CAR.getStep()) {
			throw new ServiceOperationException("当前不在上传驾驶证步骤");
		}
		BeanUtils.copyProperties(data, creditApply);
		creditApply.setApplyStep((byte) CreditApplyStepEnum.PERSONAL_INFO.getStep());
		creditApplyMapper.updateByPrimaryKeySelective(creditApply);
	}

	/**
	 * 将个人信息存入数据库
	 * @param data
	 * @return
	 */
	public void updatePersonalInfo(CreditApplyPersonalDto data) {
		CreditApplyExample example = new CreditApplyExample();
		example.createCriteria().andMemberIdEqualTo(data.getMemberId());
		List<CreditApply> creditApplyList = creditApplyMapper.selectByExample(example);
		if (CollectionUtils.isEmpty(creditApplyList)) {
			throw new ServiceOperationException("请先上传身份证");
		}
		CreditApply creditApply = creditApplyList.get(0);
		if (creditApply.getApplyStep() != CreditApplyStepEnum.PERSONAL_INFO.getStep()) {
			throw new ServiceOperationException("当前不在填写个人信息步骤");
		}
		BeanUtils.copyProperties(data, creditApply);
		creditApply.setApplyStep((byte) CreditApplyStepEnum.AUTHORISE.getStep());
		creditApplyMapper.updateByPrimaryKeySelective(creditApply);
	}

	public List<CreditApply> findAll(Integer memberId) {
		CreditApplyExample example = new CreditApplyExample();
		example.createCriteria().andMemberIdEqualTo(memberId);
		List<CreditApply> creditApplyList = creditApplyMapper.selectByExample(example);
		return creditApplyList;
	}


}