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
 * Created by Administrator on 2017/7/5.
 */
@Configuration
@MapperScan(basePackages = {"cn.sample.domain.loan.mapper"}, sqlSessionTemplateRef = "loanSqlSessionTemplate")
public class LoanConfig {
    @Bean(name = "loanDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.loan")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "loanSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("loanDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:cn/sample/domain/loan/mapper/**/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "loanTransactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("loanDataSource") DataSource dataSource) {
        DataSourceTransactionManager manager = new DataSourceTransactionManager(dataSource);
        manager.setDefaultTimeout(300);
        return manager;
    }

    @Bean(name = "loanSqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("loanSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}