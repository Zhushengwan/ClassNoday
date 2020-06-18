package Damo;

public class Student extends Human {
    private String school;
    private int id;
    public Student() {

    }

    public Student(String school, int id) {
        this.school = school;
        this.id = id;
    }

    public Student(String name, String sex, int age, String nationality, String work, String school, int id) {
        super(name, sex, age, nationality, work);
        this.school = school;
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
