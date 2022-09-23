package kr.co.ezenac.main;

import kr.co.ezenac.beans.DataBean;
import kr.co.ezenac.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MainClass {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        TestBean t1 = ctx.getBean("t1",TestBean.class);

        List<String> list1 = t1.getList1();
        for(String str : list1){
            System.out.printf("list1 : %s\n", str);
        }

        List<Integer> list2 = t1.getList2();
        for(Integer value : list2){
            System.out.printf("list2 : %s\n", value);
        }

        List<DataBean> list3 = t1.getList3();
        for(DataBean obj : list3){
            System.out.printf("list3 : %s\n", obj);
        }

        System.out.println("-------------------------------");
        System.out.println("------------ Set --------------");
        System.out.println("-------------------------------");

        Set<String> set1 = t1.getSet1();
        Set<Integer> set2 = t1.getSet2();
        Set<DataBean> set3 = t1.getSet3();

        for(String str : set1){
            System.out.printf("set1 : %s\n", str);
        }

        for(Integer value : set2){
            System.out.printf("set2 : %s\n", value);
        }

        for(DataBean obj : set3){
            System.out.printf("set3 : %s\n", obj); // set 타입은 prototype도 동일 id이면 객체 저장 x
        }

        System.out.println("-------------------------------");
        System.out.println("------------ Map --------------");
        System.out.println("-------------------------------");

        Map<String, Object> map1 = t1.getMap1();
        String a1 = (String)map1.get("a1");

        int a2=(Integer) map1.get("a2");
        DataBean a3=(DataBean) map1.get("a3");
        DataBean a4=(DataBean) map1.get("a4");

        List<String> a5 = (List<String>) map1.get("a5");

        System.out.printf("a1 : %s\n", a1);
        System.out.printf("a2 : %d\n", a2);
        System.out.printf("a3 : %s\n", a3);
        System.out.printf("a4 : %s\n", a4);
        for(String str : a5){
            System.out.printf("a5 : %s\n", str);
        }

        Properties prop1 = t1.getProp1();

        String p1 = prop1.getProperty("p1");
        String p2 = prop1.getProperty("p2");
        String p3 = prop1.getProperty("p3");

        System.out.printf("p1 : %s\n", p1);
        System.out.printf("p2 : %s\n", p2);
        System.out.printf("p3 : %s\n", p3);

        ctx.close();

    }

}

