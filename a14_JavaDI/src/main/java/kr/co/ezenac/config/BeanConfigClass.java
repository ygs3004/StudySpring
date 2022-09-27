package kr.co.ezenac.config;

import kr.co.ezenac.beans.DataBean1;
import kr.co.ezenac.beans.TestBean1;
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

}