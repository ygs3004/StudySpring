package kr.co.ezenac.mapper;

import kr.co.ezenac.beans.JdbcBean;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface MapperInterface {

    //데이터 컬럼의 값을 빈에 어디에 넣을 것인가 저장
    @Results({ // column 명과 property 명이 같으면 생략 가능
        @Result(column = "int_data", property = "int_data"),
        @Result(column = "str_data", property = "str_data")
    })
    @Select("SELECT int_data, str_data FROM jdbc_table")
    List<JdbcBean> select_data();

    @Insert("INSERT INTO jdbc_table(int_data, str_data) VALUES(#{int_data},#{str_data})")
    void insert_data(JdbcBean bean);

    @Update("UPDATE jdbc_table SET str_data=#{str_data} WHERE int_data=#{int_data}")
    void update_data(JdbcBean bean);

    @Delete("DELETE FROM jdbc_table WHERE int_data = #{int_data}")
    void delete_data(JdbcBean bean);
}