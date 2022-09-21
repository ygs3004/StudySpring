package kr.co.ezenac.main;

import kr.co.ezenac.beans.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        TestBean1 t1 = ctx.getBean("t1",TestBean1.class);
        System.out.printf("t1 : %s\n",t1);

        System.out.println("--------------------------------");

        ctx.close();
        // close 이후 destroy 메서드 작동
    }
}