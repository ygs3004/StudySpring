package kr.co.ezenac.main;

import kr.co.ezenac.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        TestBean obj1 = new TestBean();
        obj1.setData1(100);

        System.out.printf("obj1.data : %d\n", obj1.getData1());

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        TestBean t1 = ctx.getBean("t1",TestBean.class);

        System.out.printf("t1.data1 : %d\n", t1.getData1());;
        System.out.printf("t1.data2 : %f\n", t1.getData2());;
        System.out.printf("t1.data3 : %s\n", t1.isData3());;
        System.out.printf("t1.data4 : %s\n", t1.getData4());;
        System.out.printf("t1.data5 : %s\n", t1.getData5());;
        System.out.printf("t1.data6 : %s\n", t1.getData6());;

        ctx.close();
    }

}
