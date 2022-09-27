package kr.co.ezenac.config;

import kr.co.ezenac.beans.TestBean1;
import kr.co.ezenac.beans.TestBean2;
import kr.co.ezenac.beans.TestBean3;
import kr.co.ezenac.beans.TestBean4;
import org.springframework.context.annotation.*;

@Configuration
public class BeanConfigClass {

    @Bean
    public TestBean1 java1(){
        TestBean1 t1 = new TestBean1();
        return t1;
    }

    @Bean
    public TestBean1 java600(){
        TestBean1 t1 = new TestBean1();
        return t1;
    }

    @Bean
    @Lazy
    public TestBean2 java2(){
        TestBean2 t2 = new TestBean2();
        return t2;
    }

    @Bean
    @Scope("prototype")
    public TestBean3 java3(){
        TestBean3 t3 = new TestBean3();
        return t3;
    }

    @Bean
    @Primary
    public TestBean4 java4(){
        TestBean4 t4 = new TestBean4();
        return t4;
    }

}