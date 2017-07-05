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
@MapperScan(basePackages = {"cn.sample.loan.mapper"}, sqlSessionTemplateRef = "loanSqlSessionTemplate")
public class LoanConfig {
    @Bean(name = "loan")
    @ConfigurationProperties(prefix = "spring.datasource.loan")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "loanSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("loan") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:cn/sample/loan/mapper/sql/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "loanTransactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("loan") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "loanSqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("loanSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}