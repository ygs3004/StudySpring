package kr.co.ezenac.main;

import kr.co.ezenac.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        // 로딩시 객체를 생성, 싱글톤
        TestBean t1= (TestBean) ctx.getBean("test1",TestBean.class);
        System.out.printf("t1:%s\n",t1);
        TestBean t2= (TestBean) ctx.getBean("test1",TestBean.class);
        System.out.printf("t2:%s\n",t2);

        // lazy-init = "true" , 객체를 부를때 뒤늦게 생성, 싱글톤
        TestBean t3= (TestBean) ctx.getBean("test2",TestBean.class);
        System.out.printf("t3:%s\n",t3);
        TestBean t4= (TestBean) ctx.getBean("test2",TestBean.class);
        System.out.printf("t4:%s\n",t4);

        //scope = "prototype", 매번 새로운 객체를 생성 (x)싱글톤(x)
        TestBean t5= (TestBean) ctx.getBean("test3",TestBean.class);
        System.out.printf("t5:%s\n",t5);
        TestBean t6= (TestBean) ctx.getBean("test3",TestBean.class);
        System.out.printf("t6:%s\n",t6);

        ctx.close();
        // tr3 == t4 , t1 != t3, t1 != t4

    }

}