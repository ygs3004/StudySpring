package kr.co.ezenac.config;

import kr.co.ezenac.beans.DataBean3;
import kr.co.ezenac.beans.DataBean4;
import kr.co.ezenac.beans.DataBean5;
import kr.co.ezenac.beans.TestBean3;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "kr.co.ezenac.beans")
public class BeanConfigClass {

    @Bean
    public DataBean3 obj4(){
        return new DataBean3();
    }

    @Bean
    public DataBean3 obj5(){
        return new DataBean3();
    }

    @Bean
    public TestBean3 java2(){
        TestBean3 t2 = new TestBean3(200, "문자열", new DataBean4(), new DataBean5());
        return t2;
    }

}