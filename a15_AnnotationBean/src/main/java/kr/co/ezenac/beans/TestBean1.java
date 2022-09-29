package kr.co.ezenac.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;

public class TestBean1 {

    private int data1;
    private DataBean1 data2;

    // 자동 주입을 변수에 설정한다.
    // 자동으로 setter 메서드가 추가되어 setter 메서드를 통해 주입받게 된다.
    // 그러므로 getter 메서드만 만들면 된다.
    @Autowired
    private DataBean1 data3;

    @Autowired
    @Qualifier("obj4")
    private DataBean2 data4;

    @Autowired
    @Qualifier("obj5")
    private DataBean2 data5;

    @Autowired(required = false) // 해당하는 빈이 존재하면 주입하고 존재하지 않으면 무시
    @Qualifier("obj6")
    private DataBean2 data6;

    public int getData1() {
        return data1;
    }

    @Required // 필수 주입 프로퍼티(스프링 5.1부터 자바 파일로 bean을 등록할 경우 무시됨)
    public void setData1(int data1) {
        this.data1 = data1;
    }

    public DataBean1 getData2() {
        return data2;
    }

    // 자동 주입(객체 타입을 통해 bean 객체를 자동으로 주입한다.)
    @Autowired
    public void setData2(DataBean1 data2) {
        this.data2 = data2;
    }

    public DataBean1 getData3() {
        return data3;
    }

    public DataBean2 getData4() {
        return data4;
    }

    public DataBean2 getData5() {
        return data5;
    }

    public DataBean2 getData6() {
        return data6;
    }
}
