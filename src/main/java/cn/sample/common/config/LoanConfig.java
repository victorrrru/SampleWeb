package cn.sample.common.config;

import cn.sample.common.dataSource.LoanDataSourceConfig;
import com.atomikos.jdbc.AtomikosDataSourceBean;
import com.mysql.jdbc.jdbc2.optional.MysqlXADataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/7/5.
 */
@Configuration
@MapperScan(basePackages = {"cn.sample.domain.loan.mapper"}, sqlSessionTemplateRef = "loanSqlSessionTemplate")
public class LoanConfig {
    // 配置数据源
    @Bean(name = "loanSource")
    public DataSource loanDataSource(LoanDataSourceConfig dataSource) throws SQLException {
        MysqlXADataSource mysqlXaDataSource = new MysqlXADataSource();
        mysqlXaDataSource.setUrl(dataSource.getUrl());
        mysqlXaDataSource.setUser(dataSource.getUsername());
        mysqlXaDataSource.setPassword(dataSource.getPassword());
        mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);
        AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
        xaDataSource.setXaDataSource(mysqlXaDataSource);
        xaDataSource.setUniqueResourceName("loanSource");
        return xaDataSource;
    }

    @Bean(name = "loanSqlSessionFactory")
    public SqlSessionFactory loanSqlSessionFactory(@Qualifier("loanSource") DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath*:cn/sample/domain/loan/**/*Mapper.xml"));
        return bean.getObject();
    }

    @Bean(name = "loanSqlSessionTemplate")
    public SqlSessionTemplate loanSqlSessionTemplate(
            @Qualifier("loanSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}