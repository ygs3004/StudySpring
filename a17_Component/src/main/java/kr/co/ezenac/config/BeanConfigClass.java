package kr.co.ezenac.config;

import kr.co.ezenac.beans.TestBean1;
import kr.co.ezenac.beans.TestBean2;
import kr.co.ezenac.beans2.TestBean4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = {"kr.co.ezenac.beans2", "kr.co.ezenac.beans3"})
@ComponentScan(basePackages = "kr.co.ezenac.beans2")
@ComponentScan(basePackages = "kr.co.ezenac.beans3")
public class BeanConfigClass {

    @Bean
    TestBean1 java1(){
        return new TestBean1();
    }

    @Bean
    TestBean2 java2(){
        return new TestBean2();
    }

    @Bean
    TestBean2 java3(){
        return new TestBean2();
    }

    @Bean
    TestBean4 java100(){
        return new TestBean4();
    }

    @Bean
    TestBean4 java200(){
        return new TestBean4();
    }

}