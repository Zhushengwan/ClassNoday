package Dayfama;

public class Text {
    public static void main(String[] args) {
        Person01 person01 = new Person01();
        try {
            person01.setAge(1000);
            person01.setSex("byg");
            person01.print();
        }catch (MyException m) {
            m.printStackTrace();
            m.printStackTrace();
        }finally {
            System.out.println("程序结束");
        }


    }
}
