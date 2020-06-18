package Dayfama;

public class ThrowText {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setSex("MCf");
            person.print();

        }catch(Exception e) {
            e.printStackTrace();


        }finally {
            System.out.println("程序结束");
        }

    }
}
