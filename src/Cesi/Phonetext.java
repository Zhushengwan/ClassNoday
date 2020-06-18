package Cesi;

public class Phonetext {
    public static void main(String[] args) {


        CommonPhone phone01 = new CommonPhone("G502c", "索尼");

        phone01.play("热雪");
        phone01.sendMesg();
        phone01.call();
        System.out.println("*****************");
        SmartPhone phone02=new SmartPhone("HTC","I9100");
        phone02.netWork();
        phone02.play("小时代");
        phone02.takephoto();
        phone02.sendMesg();


    }
}
