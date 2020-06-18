package Cesi;

import java.util.Scanner;
//判断
public class Text03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个年份：");
        int year = input.nextInt();
        boolean b =false;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            b = true;
            System.out.println(b);

        } else {
            b=false;
            System.out.println(b);



        }

    }
}