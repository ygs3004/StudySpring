package kr.co.ezenac.main;

import kr.co.ezenac.beans.TestBean1;
import kr.co.ezenac.beans.TestBean2;
import kr.co.ezenac.beans.TestBean3;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        TestBean1 obj1 = ctx.getBean("obj1", TestBean1.class);
        System.out.printf("obj1.data1 : %s\n",obj1.getData1());
        System.out.printf("obj1.data2 : %s\n",obj1.getData2());
        System.out.println("------------------------------------------------");

        TestBean1 obj2 = ctx.getBean("obj2", TestBean1.class);
        System.out.printf("obj2.data1 : %s\n",obj2.getData1());
        System.out.printf("obj2.data2 : %s\n",obj2.getData2());
        System.out.println("------------------------------------------------");

        TestBean2 obj3 = ctx.getBean("obj3", TestBean2.class);
        System.out.printf("obj3.data1 : %s\n",obj3.getData1());
        System.out.printf("obj3.data2 : %s\n",obj3.getData2());
        System.out.println("------------------------------------------------");

        TestBean3 obj4 = ctx.getBean("obj4", TestBean3.class);
        System.out.printf("obj4.data1 : %s\n",obj4.getData1());
        System.out.printf("obj4.data2 : %s\n",obj4.getData2());
        System.out.printf("obj4.data3 : %s\n",obj4.getData3());
        System.out.printf("obj4.data4 : %s\n",obj4.getData4());

    }
}