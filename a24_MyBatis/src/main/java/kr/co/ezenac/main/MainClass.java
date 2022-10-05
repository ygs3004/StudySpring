package kr.co.ezenac.main;

import kr.co.ezenac.beans.JdbcBean;
import kr.co.ezenac.config.BeanConfigClass;
import kr.co.ezenac.mapper.MapperInterface;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        MapperInterface mapper = ctx.getBean("test_mapper", MapperInterface.class);

        //insert
        //JdbcBean bean2 = ctx.getBean(JdbcBean.class);
        JdbcBean bean2 = new JdbcBean();
        bean2.setInt_data(100);
        bean2.setStr_data("문자열100");
        mapper.insert_data(bean2);

        //update
        JdbcBean bean4 = ctx.getBean(JdbcBean.class);
        bean4.setInt_data(100);
        bean4.setStr_data("문자열300");
        mapper.update_data(bean4);

        //delete
        JdbcBean bean5 = ctx.getBean(JdbcBean.class);
        bean5.setInt_data(1);
        mapper.delete_data(bean5);

        List<JdbcBean> list1 = mapper.select_data();
        list1.forEach(bean -> System.out.println("int_data : "+bean.getInt_data()+", str_data : "+bean.getStr_data()));
        /*
        for(JdbcBean bean3 : list1){
            System.out.printf("int_data:%d\n", bean3.getInt_data());
            System.out.printf("str_data:%s\n", bean3.getStr_data());
        }
        */

        ctx.close();
    }

}