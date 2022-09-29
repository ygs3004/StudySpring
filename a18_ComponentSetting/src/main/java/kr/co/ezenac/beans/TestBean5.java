package kr.co.ezenac.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Lazy
public class TestBean5 {

    public TestBean5() {
        System.out.println("TestBean5의 생성자");
    }

    @PostConstruct
    public void init(){
        System.out.println("TestBean5의 init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("TestBean5의 destroy");
    }

}