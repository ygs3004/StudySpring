package kr.co.ezenac.beans;

import org.springframework.stereotype.Component;

//싱글톤
@Component
public class TestBean1 {
    
    public TestBean1() {
        System.out.println("TestBean1의 생성자");
    }
}
