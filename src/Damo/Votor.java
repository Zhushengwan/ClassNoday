package Damo;

public class Votor {
    static int count;
    static final int MAX_COUNT=100;



    private String name;
    public Votor() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Votor(String name) {
        this.name=name;
    }
    public void votor() {
        if(count ==MAX_COUNT) {
            System.out.println("投票已是最大值，不能投票");
        }else {
            count++;
            System.out.println(this.name+"投票成功，票数为"+count);
        }
    }

}
