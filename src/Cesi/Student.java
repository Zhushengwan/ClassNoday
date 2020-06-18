package Cesi;

public class Student extends Human {
    public Student() {

    }

    public Student(String name, int age) {
        super(name, age);
    }
    public void Study() {
        System.out.println(this.getAge()+"的"+this.getName()+"在努力敲代码");
    }
}
