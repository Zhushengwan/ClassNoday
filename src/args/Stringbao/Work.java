package args.Stringbao;

import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        System.out.println("****欢迎进入作业提交系统****");
        Scanner input = new Scanner(System.in);
        System.out.print("请输入java文件名：");
        String s = input.next();
        if(s.endsWith(".java")==true) {
            System.out.print("请输入你的邮箱：");
            String s2 = input.next();
            int i = s2.indexOf("@");
            int i1 = s2.indexOf(".");
            if(i!=-1&&i1!=-1&&i<i1) {
                System.out.println("登录成功");

        }else {
                System.out.println("E-mail无效");
            }
        }else{
            System.out.println("提交作业失败");
        }
    }
}
