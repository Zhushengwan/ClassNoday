package args.Stringbao;

public class StrMthods {
    public static void main(String[] args) {
        String  str = "hello  world!";
        //字符串下标从0开始
        int index = str.indexOf("o");
        System.out.println(index);
        int A1 = str.indexOf("p");
        System.out.println(A1);
        int A2 = str.lastIndexOf("o");
        System.out.println(A2);
        String a = "183849839@qq.com";
        int i = a.indexOf("@", 4);
        System.out.println(i);
        String b = "中华人民共和国.com";
        boolean b1 = b.endsWith(".com");
        System.out.println(b1);

    }
}
