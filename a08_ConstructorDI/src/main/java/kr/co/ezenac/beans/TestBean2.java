package kr.co.ezenac.beans;

public class TestBean2 {

    private DataBean dataBean1;
    private DataBean dataBean2;

    public TestBean2(DataBean dataBean1, DataBean dataBean2) {
        this.dataBean1 = dataBean1;
        this.dataBean2 = dataBean2;
    }

    public void printData(){
        System.out.printf("data1 : %s\n", dataBean1);
        System.out.printf("data2 : %s\n", dataBean2);
    }

}