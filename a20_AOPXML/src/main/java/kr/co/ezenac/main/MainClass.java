package kr.co.ezenac.main;

import kr.co.ezenac.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        TestBean bean1 = ctx.getBean("xml1", TestBean.class);

        int a1= bean1.method1();
        System.out.printf("a1 : %d\n", a1);

        ctx.close();
    }
}