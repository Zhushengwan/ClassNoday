package args.Stringbao;

public class Stringdame {
    public static void main(String[] args) {
        //常规
        String s1="abc";//在字符串常量池中创建
        //构造方法
        String s2=new String("abc");//
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        String s3 = "ABCd";
        String s4= "abcd";
        System.out.println(s3.equalsIgnoreCase(s4));
        System.out.println(s3.equals(s4));
        String s5 = s3.toLowerCase();
        System.out.println(s5==s4);
        System.out.println(s5);
        String s6 = s3.toUpperCase();
        System.out.println(s6);

    }
}
