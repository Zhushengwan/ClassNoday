package args.Stringbao;

import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String name = input.next();
        System.out.print("请输入密码:");
        String password = input.next();
//        if(password.length()<6) {
//            System.out.println("密码为数至少为6位....");
//        }else {
//            System.out.println("密码输入正确");
//        }
        if (name.equals("zswwavc")&&password.equals("zsw19930810")) {
            System.out.println("登陆成功");
        }else {
            System.out.println("用户名和密码输入错误，登录失败");
        }
    }
}
