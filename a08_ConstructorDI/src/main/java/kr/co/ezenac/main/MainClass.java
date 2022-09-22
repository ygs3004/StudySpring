package kr.co.ezenac.main;

import kr.co.ezenac.beans.DataBean;
import kr.co.ezenac.beans.TestBean1;
import kr.co.ezenac.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        TestBean1 t1 = new TestBean1();
        t1.printData();
        System.out.println("------------------------");

        TestBean1 t2 = new TestBean1(100);
        t2.printData();
        System.out.println("------------------------");

        TestBean1 t3 = new TestBean1(11.11);
        t3.printData();
        System.out.println("------------------------");

        TestBean1 t4 = new TestBean1("문자열");
        t4.printData();
        System.out.println("------------------------");

        TestBean1 t5 = new TestBean1(200, 22.22, "Spring");
        t5.printData();
        System.out.println("------------------------");

        /* 매개변수 에러
        TestBean1 t6 = new TestBean1("Spring", 200, 22.22);
        t6.printData();
        System.out.println("------------------------");
        */

        TestBean1 obj1 = ctx.getBean("obj1",TestBean1.class);
        obj1.printData();
        System.out.println("------------------------");

        TestBean1 obj2 = ctx.getBean("obj2",TestBean1.class);
        obj2.printData();
        System.out.println("------------------------");

        TestBean1 obj3 = ctx.getBean("obj3",TestBean1.class);
        obj3.printData();
        System.out.println("------------------------");

        TestBean1 obj4 = ctx.getBean("obj4",TestBean1.class);
        obj4.printData();
        System.out.println("------------------------");

        TestBean1 obj5 = ctx.getBean("obj5",TestBean1.class);
        obj5.printData();
        System.out.println("------------------------");

        TestBean1 obj6 = ctx.getBean("obj6",TestBean1.class); // xml에서 매개변수의 순서가 틀려도 잘 작동함
        obj6.printData();
        System.out.println("------------------------");

        TestBean1 obj7 = ctx.getBean("obj7",TestBean1.class);
        obj7.printData();
        System.out.println("------------------------");

        DataBean d1 = new DataBean();
        DataBean d2 = new DataBean();
        TestBean2 t200 = new TestBean2(d1, d2);
        t200.printData();
        System.out.println("------------------------");

        TestBean2 obj8 = ctx.getBean("obj8",TestBean2.class);
        obj8.printData();
        System.out.println("------------------------");

        TestBean2 obj9 = ctx.getBean("obj9",TestBean2.class);
        obj9.printData();
        System.out.println("------------------------");
    }

}