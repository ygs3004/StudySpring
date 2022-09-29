package kr.co.ezenac.main;

import kr.co.ezenac.beans.TestBean1;
import kr.co.ezenac.beans.TestBean2;
import kr.co.ezenac.beans.TestBean3;
import kr.co.ezenac.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("beans.xml");

        TestBean1 xml1 = ctx1.getBean("xml1", TestBean1.class);
        System.out.printf("xml1.data1 : %d\n", xml1.getData1());
        System.out.printf("xml1.data2 : %s\n", xml1.getData2());
        System.out.printf("xml1.data3 : %s\n", xml1.getData3());
        System.out.println("--------------------------------------------------");

        TestBean1 xml2 = ctx1.getBean("xml2", TestBean1.class);
        System.out.printf("xml2.data1 : %d\n", xml2.getData1());
        System.out.printf("xml2.data2 : %s\n", xml2.getData2());
        System.out.printf("xml2.data3 : %s\n", xml2.getData3());
        System.out.println("--------------------------------------------------");

        TestBean2 xml3 = ctx1.getBean("xml3", TestBean2.class);
        System.out.printf("xml3.data1 : %s\n", xml3.getData1());
        System.out.printf("xml3.data2 : %s\n", xml3.getData2());
        System.out.println("--------------------------------------------------");

        TestBean3 xml4 = ctx1.getBean("xml4", TestBean3.class);
        System.out.printf("xml4.data1 : %s\n", xml4.getData1());
        System.out.printf("xml4.data2 : %s\n", xml4.getData2());
        System.out.println("--------------------------------------------------");

        ctx1.close();

        System.out.println("===============================================================================================================================================");

        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        TestBean1 java1 = ctx2.getBean("java1",TestBean1.class);
        System.out.printf("java1.data1 : %d\n", java1.getData1());
        System.out.printf("java1.data2 : %s\n", java1.getData2());
        System.out.printf("java1.data3 : %s\n", java1.getData3());
        System.out.println("--------------------------------------------------");

        TestBean1 java2 = ctx2.getBean("java2",TestBean1.class);
        System.out.printf("java2.data1 : %d\n", java2.getData1());
        System.out.printf("java2.data2 : %s\n", java2.getData2());
        System.out.printf("java2.data3 : %s\n", java2.getData3());
        System.out.println("--------------------------------------------------");

        TestBean2 java3 = ctx2.getBean("java3", TestBean2.class);
        System.out.printf("java3.data3 : %s\n", java3.getData1());
        System.out.printf("java3.data3 : %s\n", java3.getData2());
        System.out.println("--------------------------------------------------");

        TestBean3 java4 = ctx2.getBean("java4", TestBean3.class);
        System.out.printf("java4.data4 : %s\n", java4.getData1());
        System.out.printf("java4.data4 : %s\n", java4.getData2());

        ctx2.close();

    }

}