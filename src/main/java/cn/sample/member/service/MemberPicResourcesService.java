package cn.sample.member.service;

import cn.itht.dto.ResultDto;
import cn.sample.loan.web.bo.CreditApplyDto;
import cn.sample.member.entity.MemberPicResources;
import cn.sample.member.mapper.MemberPicResourcesMapper;
import java.io.Serializable;
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
	 * @param applyDto
	 * @param creditId
	 */
	public void insertIdCard(CreditApplyDto applyDto,Integer creditId) {
		insertMemberPic(applyDto.getMemId(), (byte)1, creditId, (byte)2, applyDto.getFront());
		insertMemberPic(applyDto.getMemId(), (byte)2, creditId, (byte)2, applyDto.getBack());
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