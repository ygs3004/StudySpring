package kr.co.ezenac.beans;

public class TestBean2 {

    public TestBean2(){
        System.out.println("TestBean2의 생성자입니다.");
    }

    public void default_init(){
        System.out.println("TestBean2의 Default_init 메서드");
    }

    public void default_destroy() {
        System.out.println("TestBean2의 Default_destroy 메서드");
    }

}