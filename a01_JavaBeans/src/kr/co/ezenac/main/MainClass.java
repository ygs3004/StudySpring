package kr.co.ezenac.main;

import kr.co.ezenac.beans.HelloWorldEn;
import kr.co.ezenac.beans.HelloWorldKo;

public class MainClass {

    public static void main(String[] args) {
    	// HelloWorldEn hello1 = new HelloWorldEn();
    	HelloWorldKo hello1 = new HelloWorldKo();

        callMethod(hello1);

        // HelloWorldEn hello2 = new HelloWorldEn();
        HelloWorldKo hello2 = new HelloWorldKo();
        
        callMethod(hello2);
    }

    public static void callMethod(HelloWorldKo hello){

        hello.sayHello();
    }
    
}