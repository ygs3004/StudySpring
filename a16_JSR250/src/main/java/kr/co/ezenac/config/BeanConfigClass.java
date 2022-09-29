package kr.co.ezenac.config;

import kr.co.ezenac.beans.*;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfigClass {

    @Bean(initMethod = "init1", destroyMethod = "destroy1")
    @Lazy
    public TestBean1 obj1(){
        return new TestBean1();
    }

    @Bean
    @Lazy
    public TestBean2 obj2(){
        return new TestBean2();
    }

    @Bean
    public DataBean1 data1(){
        return new DataBean1();
    }

    @Bean
    public DataBean2 data2(){
        return new DataBean2();
    }

    @Bean(autowire = Autowire.BY_NAME)
    public TestBean3 obj3(){
        return new TestBean3();
    }

    @Bean
    public TestBean4 obj4(){
        return new TestBean4();
    }

    @Bean
    public TestBean5 obj5(){
        return new TestBean5();
    }

    @Bean
    public TestBean6 obj6(){
        return new TestBean6();
    }
}