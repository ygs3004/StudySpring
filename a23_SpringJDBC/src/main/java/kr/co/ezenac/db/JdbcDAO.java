package kr.co.ezenac.db;

import kr.co.ezenac.beans.JdbcBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcDAO {

    @Autowired
    private JdbcTemplate db;

    @Autowired
    private MapperClass mapper;

    //저장
    public void insert_data(JdbcBean bean){
        String sql = "INSERT INTO jdbc_table(int_data, str_data) VALUES(?,?)";
        db.update(sql, bean.getInt_data(), bean.getStr_data());
    }

    //가져오기
    public List<JdbcBean> select_data(){
        String sql = "SELECT int_data,str_data FROM jdbc_table";
        List<JdbcBean> list = db.query(sql, mapper);
        return list;
    }

    //수정
    public void update_data(JdbcBean bean){
        String sql = "UPDATE jdbc_table SET str_data=? WHERE int_data=?";
        db.update(sql, bean.getStr_data(), bean.getInt_data());
    }

    //삭제
    public void delete_data(JdbcBean bean){
        String sql = "DELETE FROM jdbc_table WHERE int_data=?";
        db.update(sql, bean.getInt_data());
    }

}