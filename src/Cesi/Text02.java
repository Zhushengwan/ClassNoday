package Cesi;

public class Text02 {
    public static void main(String[] args) {
        Teacther teacther = new Teacther();
        teacther.setAge(33);
        teacther.setName("老王");
        teacther.Eat();
        teacther.Teach();
        System.out.println("************");
        Student s = new Student();
        s.setAge(18);
        s.setName("小王");
        s.Eat();
        s.Study();
    }

}
