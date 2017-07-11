package cn.sample.common.config;

import cn.sample.common.dataSource.CommDataSourceConfig;
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
 * Created by victorrrr
 * Date : 2017/7/5 19:32
 */
@Configuration
@MapperScan(basePackages = {"cn.sample.domain.config.mapper"}, sqlSessionTemplateRef = "commSqlSessionTemplate")
public class CommConfig {
    // 配置数据源
    @Bean(name = "commSource")
    public DataSource commDataSource(CommDataSourceConfig dataSource) throws SQLException {
        MysqlXADataSource mysqlXaDataSource = new MysqlXADataSource();
        mysqlXaDataSource.setUrl(dataSource.getUrl());
        mysqlXaDataSource.setUser(dataSource.getUsername());
        mysqlXaDataSource.setPassword(dataSource.getPassword());
        mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);
        AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
        xaDataSource.setXaDataSource(mysqlXaDataSource);
        xaDataSource.setUniqueResourceName("commSource");
        return xaDataSource;
    }

    @Bean(name = "commSqlSessionFactory")
    public SqlSessionFactory commSqlSessionFactory(@Qualifier("commSource") DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath*:cn/sample/domain/config/**/*Mapper.xml"));
        return bean.getObject();
    }

    @Bean(name = "commSqlSessionTemplate")
    public SqlSessionTemplate commSqlSessionTemplate(
            @Qualifier("commSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
