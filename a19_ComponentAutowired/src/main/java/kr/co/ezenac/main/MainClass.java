package kr.co.ezenac.main;

import kr.co.ezenac.beans.TestBean1;
import kr.co.ezenac.beans.TestBean2;
import kr.co.ezenac.beans.TestBean3;
import kr.co.ezenac.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
        TestBean1 t1 = ctx.getBean(TestBean1.class);
        System.out.printf("t1.data1 : %s\n", t1.getData1());
        System.out.printf("t1.data2 : %s\n", t1.getData2());
        System.out.printf("t1.data3 : %s\n", t1.getData3());
        System.out.printf("t1.data4 : %s\n", t1.getData4());
        System.out.printf("t1.data5 : %s\n", t1.getData5());
        System.out.println("=====================================================");
        TestBean2 t2 = ctx.getBean(TestBean2.class);
        System.out.printf("t2.data1 : %d\n", t2.getData1());
        System.out.printf("t2.data2 : %s\n", t2.getData2());
        System.out.printf("t2.data3 : %s\n", t2.getData3());
        System.out.printf("t2.data4 : %s\n", t2.getData4());
        System.out.println("=====================================================");
        TestBean3 t3 = ctx.getBean("java2", TestBean3.class);
        System.out.printf("t3.data1 : %d\n", t3.getData1());
        System.out.printf("t3.data2 : %s\n", t3.getData2());
        System.out.printf("t3.data3 : %s\n", t3.getData3());
        System.out.printf("t3.data4 : %s\n", t3.getData4());
        System.out.println("=====================================================");
        ctx.close();
    }

}