package kr.co.ezenac.config;

import kr.co.ezenac.beans.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "kr.co.ezenac.beans")
public class BeanConfigClass {

    @Bean
    public TestBean2 t5(){
        return new TestBean2();
    }

    @Bean
    public TestBean2 t6(){
        return new TestBean2();
    }

}