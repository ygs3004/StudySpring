package kr.co.ezenac.config;

import kr.co.ezenac.mapper.MapperInterface;
import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.co.ezenac.beans")
public class BeanConfigClass {

    @Bean
    public BasicDataSource source(){
        BasicDataSource source = new BasicDataSource();
        source.setDriverClassName("oracle.jdbc.OracleDriver");
        source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        source.setUsername("scott");
        source.setPassword("tiger");

        return source;
    }

    //jdbc
    @Bean
    public SqlSessionFactory factory(BasicDataSource source) throws Exception{
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(source);
        SqlSessionFactory factory = factoryBean.getObject();

        return factory;
    }

    // Mapper
    @Bean
    public MapperFactoryBean<MapperInterface> test_mapper(SqlSessionFactory factory) throws Exception{
        MapperFactoryBean<MapperInterface> facotryBean = new MapperFactoryBean<>(MapperInterface.class);
        facotryBean.setSqlSessionFactory(factory);

        return facotryBean;
    }


}