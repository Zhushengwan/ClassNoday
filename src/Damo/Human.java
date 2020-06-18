package Damo;

public  class Human {
    /*定义一个人类，包括属性：姓名、性别、年龄、国籍；包括方法：吃饭、睡觉，工作。
（1）根据人类，派生一个学生类，增加属性：学校、学号；重写工作方法（学生的工作是学习）。
（2）根据人类，派生一个工人类，增加属性：单位、工龄；重写工作方法（工人的工作是……自己想吧）。
（3）根据学生类，派生一个学生干部类，增加属性：职务；增加方法：开会。
（4）编写主函数分别对上述3类具体人物进行测试。

	 *
	 * */
    private String name;
    private String sex;
    private int age;
    private String nationality;
    private String work;
    public Human() {

    }
    public Human(String name,String sex,int age,String nationality,String work) {
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.nationality=nationality;
        this.work=work;


    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }



    public void show() {
        System.out.println("我叫"+this.name+"，性别"+this.sex+"，今年"+this.age+"岁,国籍是"+this.nationality+",我的工作是"+this.work);
    }



}
