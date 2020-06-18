package Dayfama;

import java.util.Scanner;

public class ClcaText {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入被除数：");
        int num1=input.nextInt();
        System.out.println("请输入除数：");
        int num2=0;
        if (input.hasNextInt()){
            num2=input.nextInt();
            if(num2==0) {
                System.err.println("除数不能为零，程序退出");
                System.exit(1);
            }else {
                System.out.println(num1/num2);
                System.out.println("感谢使用本程序");
            }

        }else {
            System.out.println("输入的除数不是整数，程序退出");
            System.exit(1);
        }

    }
}
