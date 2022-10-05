package kr.co.ezenac.main;

import kr.co.ezenac.beans.TestBean1;
import kr.co.ezenac.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        TestBean1 xml1 = ctx.getBean("xml1", TestBean1.class);
        TestBean2 xml2 = ctx.getBean("xml2", TestBean2.class);
        kr.co.ezenac.beans2.TestBean1 xml3 = ctx.getBean("xml3", kr.co.ezenac.beans2.TestBean1.class);

        xml1.method1();
        System.out.println("------------------------------------------------");
        xml1.method1(100);
        System.out.println("------------------------------------------------");
        xml1.method1("문자열");
        System.out.println("------------------------------------------------");
        xml1.method1(100,200);
        System.out.println("------------------------------------------------");
        xml1.method1(100,"문자열");
        System.out.println("------------------------------------------------");
        xml1.method2();
        System.out.println("------------------------------------------------");
        xml1.method3();
        System.out.println("------------------------------------------------");

        xml2.method1();
        System.out.println("------------------------------------------------");

        xml3.method1();
        System.out.println("------------------------------------------------");

        ctx.close();
    }
}
