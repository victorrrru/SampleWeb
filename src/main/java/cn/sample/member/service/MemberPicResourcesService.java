package cn.sample.member.service;

import cn.itht.mybatis.criteria.Criteria;
import cn.itht.mybatis.criteria.ExpressionFactory;
import cn.sample.loan.web.bo.CreditApplyDrivingDto;
import cn.sample.loan.web.bo.CreditApplyIdCardDto;
import cn.sample.member.entity.MemberPicResources;
import cn.sample.member.mapper.MemberPicResourcesMapper;
import java.io.Serializable;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/**
 * 业务实现层 - 表：member_pic_resources
 * @since 2017-06-26 16:05:50
 */
@Service("memberPicResourcesService")
public class MemberPicResourcesService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Resource
	private MemberPicResourcesMapper memberPicResourcesMapper;

	/**
	 * 将身份证图片url存入数据库
	 * @param data
	 * @param creditId
	 */
	public void insertIdCard(CreditApplyIdCardDto data, Integer creditId) {
		insertMemberPic(data.getMemId(), (byte)1, creditId, (byte)2, data.getFront());
		insertMemberPic(data.getMemId(), (byte)2, creditId, (byte)2, data.getBack());
	}

	/**
	 * 将驾驶证图片url存入数据库
	 * @param data
	 */
	public void insertDrivingLisence(CreditApplyDrivingDto data) {
		insertMemberPic(data.getMemId(), (byte)5, data.getCreditApplyId(), (byte)2, data.getDfront());
		insertMemberPic(data.getMemId(), (byte)6, data.getCreditApplyId(), (byte)2, data.getCfront());
		insertMemberPic(data.getMemId(), (byte)7, data.getCreditApplyId(), (byte)2, data.getDback());
		insertMemberPic(data.getMemId(), (byte)8, data.getCreditApplyId(), (byte)2, data.getCback());
	}

	public void getIdCard(Integer memberId) {
		List<MemberPicResources> memberPicResourcesList = memberPicResourcesMapper.selectByCriteria(Criteria.create(MemberPicResources.class)
				.add(ExpressionFactory.eq("memberId", memberId)));
	}

	private void insertMemberPic(Integer memberId, byte pictype, Integer objectId, byte objectType,String url) {
		MemberPicResources memberPicResources = new MemberPicResources();
		memberPicResources.setMemberId(memberId);
		memberPicResources.setPictype(pictype);
		memberPicResources.setObjectId(objectId);
		memberPicResources.setObjectType(objectType);
		memberPicResources.setUrl(url);
		memberPicResourcesMapper.insertSelective(memberPicResources);
	}
}