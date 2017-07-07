package cn.sample.common.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by victorrrr
 * Date : 2017/7/5 19:32
 */
@Configuration
@MapperScan(basePackages = {"cn.sample.domain.config.mapper"}, sqlSessionTemplateRef = "configSqlSessionTemplate")
public class CommDataConfigConfig {
    @Bean(name = "configDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.config")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "configSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("configDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:cn/sample/domain/config/mapper/**/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "configTransactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("configDataSource") DataSource dataSource) {
        DataSourceTransactionManager manager = new DataSourceTransactionManager(dataSource);
        manager.setDefaultTimeout(300);
        return manager;
    }

    @Bean(name = "configSqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("configSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
