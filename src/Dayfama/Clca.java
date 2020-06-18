package Dayfama;

import java.util.Scanner;

public class Clca {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入被除数：");
            int num1=input.nextInt();
            System.out.println("请输入除数：");
            int num2 = input.nextInt();
            System.out.println(num1/num2);
        }catch (Exception e) {
            System.out.println(e.getMessage());



        }finally {
            System.out.println("程序结束");
        }
    }
}
