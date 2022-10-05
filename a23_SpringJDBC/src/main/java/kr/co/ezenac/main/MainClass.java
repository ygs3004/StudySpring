package kr.co.ezenac.main;

import kr.co.ezenac.beans.JdbcBean;
import kr.co.ezenac.config.BeanConfigClass;
import kr.co.ezenac.db.JdbcDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.beans.beancontext.BeanContext;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        //JdbcDAO를 가져온다
        JdbcDAO dao = ctx.getBean(JdbcDAO.class);

        //insert
        JdbcBean bean1 = ctx.getBean(JdbcBean.class);
        bean1.setInt_data(1);
        bean1.setStr_data("문자열");
        dao.insert_data(bean1);

        JdbcBean bean2 = ctx.getBean(JdbcBean.class);
        bean2.setInt_data(2);
        bean2.setStr_data("문자열2");
        dao.insert_data(bean2);

        System.out.println("저장 완료");

        // update 1 문자열 3
        JdbcBean bean4 = ctx.getBean(JdbcBean.class);
        bean4.setInt_data(1);
        bean4.setStr_data("문자열3");
        dao.update_data(bean4);

        JdbcBean bean5 = ctx.getBean(JdbcBean.class);
        bean5.setInt_data(2);
        dao.delete_data(bean5);

        List<JdbcBean> list = dao.select_data();
        for(JdbcBean bean3 : list){
            System.out.printf("int_data:%d\n", bean3.getInt_data());
            System.out.printf("str_data:%s\n", bean3.getStr_data());
        }

        ctx.close();
    }
}