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
        return new TestBean1(200,"문자열",new DataBean1());
    }

    @Bean
    public TestBean1 java2(){
        TestBean1 t2 = new TestBean1();
        t2.setData1(200);
        t2.setData2("문자열");
        t2.setData3(new DataBean1());
        return t2;
    }

    @Bean
    public DataBean2 data1() {
        return new DataBean2();
    }
    @Bean
    public DataBean2 data2() {
        return new DataBean2();
    }

    @Bean(autowire = Autowire.BY_NAME)
    public TestBean2 java3(){
        return new TestBean2();
    }

    @Bean
    public DataBean3 data3(){
        return new DataBean3();
    }

    @Bean(autowire = Autowire.BY_TYPE)
    public TestBean3 java4(){
        return new TestBean3();
    }

}