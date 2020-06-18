package Dayfama;

public class Person01 {
    private String name;
    private int age;
    private String sex;
    public Person01() {

    }
    public Person01(String name,int age,String sex) {
        this.name=name;
        this.age=age;
        this.sex=sex;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)throws MyException {
        if (age>=1&&age<=100) {
            this.age = age;
        }else {
            throw new MyException("年龄只能在1~100之间");
        }

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) throws MyException {
        if (sex.equals("男")||sex.equals("女")) {
            this.sex = sex;
        }else {
            throw new MyException("性别只能是男女");

        }


    }
    public void print() {
        System.out.println((this.getName()+"-"+this.getSex()+"-"+this.getAge()));
    }

}
