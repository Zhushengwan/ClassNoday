package Jihekuangjia;

public class Arraylist {
    private String ID;
    private int age;
    private String add;
    public Arraylist() {

    }

    public Arraylist(String ID, int age, String add) {
        this.ID = ID;
        this.age = age;
        this.add = add;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}
