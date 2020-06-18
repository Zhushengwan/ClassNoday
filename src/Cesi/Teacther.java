package Cesi;

public class Teacther extends Human {
    public Teacther() {

    }

    public Teacther(String name, int age) {
        super(name, age);
    }
    public void Teach() {
        System.out.println(this.getAge()+"的"+this.getName()+"在教Java");
    }
}
