package kr.co.ezenac.main;

import kr.co.ezenac.beans.HelloWorld;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        // beans.xml 파일을 로딩한다.
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "beans.xml"
        );

        //beans.xml에 정의한 bean 객체의 주소값을 가져온다.
        HelloWorld hello = (HelloWorld)ctx.getBean("hello");
        callMethhod(hello);

        HelloWorld hello2 = ctx.getBean("hello", HelloWorld.class);
        callMethhod(hello2);
        ctx.close();
    }


    public static void callMethhod(HelloWorld hello) {
        hello.sayHello();
    }

}