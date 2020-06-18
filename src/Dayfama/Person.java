package Dayfama;

 public class Person{
   private String name = " ";
   private String sex = "男";
   private int age= 0;
   public  void setSex(String sex) throws Exception{
       if (sex.equals("男")||sex.equals("女")) {
           this.sex=sex;

       }else {
           throw new Exception("性别必须是\"男\"或者\"女\"!");
       }


    }
    public void print() {
        System.out.println("我叫"+this.name+",性别"+this.sex+"，年龄"+this.age);
    }


}
