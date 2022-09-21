package kr.co.ezenac.main;

import kr.co.ezenac.beans.TestBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import sun.management.FileSystem;

public class MainClass {

    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        test4();
    }

    // BeanFactory(더 이상 사용 안함, 3점대 버젼에서 사용) - 패키지 내부(beans, xml)
    public static void test1() {
        ClassPathResource res = new ClassPathResource("beans.xml");

        //bean.xml에서 설정한 TestBean 객체를 바로 생성하지 않는다.
        XmlBeanFactory factory = new XmlBeanFactory(res);

        // getBean() 메서드로 객체를 가져올 때 생성
        TestBean t1 = factory.getBean("t1", TestBean.class);
        System.out.printf("t1 : %s\n", t1);

        TestBean t2 = factory.getBean("t1", TestBean.class);
        System.out.printf("t2 : %s\n", t2);
    }

    // BeanFactory-패키지 외부(beans.xml)
    public static void test2() {
        FileSystemResource res = new FileSystemResource("beans.xml");

        XmlBeanFactory factory = new XmlBeanFactory(res);

        TestBean t1 = factory.getBean("t2", TestBean.class);
        System.out.printf("t2 : %s\n", t1);

        TestBean t2 = factory.getBean("t2", TestBean.class);
        System.out.printf("t2 : %s\n", t2);
    }

    // ApplicationContext - 패키지 내부
    public static void test3() {
        // bean.xml을 로딩할 떄 객체 생성된다.
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        System.out.printf("ctx : %s\n", ctx);

        TestBean t1 = ctx.getBean("t1", TestBean.class);
        System.out.printf("t1 : %s:\n", t1);

        //id가 같으면 같은 객체
        TestBean t2 = ctx.getBean("t1", TestBean.class);
        System.out.printf("t2 : %s:\n", t2);

        ctx.close();
    }
    
    // ApplicationContext - 패키지 외부
    public static void test4() {
        // beans.xml을 로딩할 때 객체 생성된다
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");

        // 이미 만들어진 객체 주소값을 가져온다.
        TestBean t1 = ctx.getBean("t2", TestBean.class);
        System.out.printf("t1 : %s:\n", t1);

        //같은 객체 주소값을 가져온다.
        TestBean t2 = ctx.getBean("t2", TestBean.class);
        System.out.printf("t2 : %s:\n", t2);

        ctx.close();
    }

}