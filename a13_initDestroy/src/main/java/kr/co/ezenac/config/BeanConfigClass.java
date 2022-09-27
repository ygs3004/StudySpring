package kr.co.ezenac.config;

import kr.co.ezenac.beans.TestBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class BeanConfigClass {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Lazy
    public TestBean1 java1(){
        return new TestBean1();
    }

}