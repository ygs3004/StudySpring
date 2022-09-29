package kr.co.ezenac.config;

import kr.co.ezenac.beans.*;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigClass {

    @Bean
    public TestBean1 java1(){
        return new TestBean1();
    }

    @Bean
    public DataBean1 data_bean1(){
        return new DataBean1();
    }

    @Bean
    public DataBean2 obj4(){
        return new DataBean2();
    }

    @Bean
    public DataBean2 obj5(){
        return new DataBean2();
    }

    @Bean
    public TestBean2 java2(){

        return new TestBean2();
    }


}