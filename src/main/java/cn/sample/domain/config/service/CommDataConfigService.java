package cn.sample.domain.config.service;

import cn.sample.domain.config.entity.CommDataConfig;
import cn.sample.domain.config.entity.CommDataConfigExample;
import cn.sample.domain.config.mapper.CommDataConfigMapper;
import java.io.Serializable;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * 业务实现层 - 表：comm_data_config
 * @since 2017-06-29 15:30:53
 */
@Service("commDataConfigService")
public class CommDataConfigService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Resource
	private CommDataConfigMapper commDataConfigMapper;

	public String getEduType(Short data) {
		CommDataConfigExample example = new CommDataConfigExample();
		example.createCriteria().andValueEqualTo(data);
		List<CommDataConfig> commDataConfigList = commDataConfigMapper.selectByExample(example);
		return commDataConfigList.get(0).getMenuItem();
	}

}