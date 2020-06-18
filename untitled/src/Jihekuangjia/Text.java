package Jihekuangjia;

import java.util.ArrayList;

public class Text {
    public static void main(String[] args) {
        Arraylist a1 = new Arraylist("京A45545",03,"崇阳大道234号");
        Arraylist a2 = new Arraylist("京A45433",03,"崇阳大道234号");
        Arraylist a3 = new Arraylist("京A453235",03,"崇阳大道234号");
        Arraylist a4 = new Arraylist("京A452245",03,"崇阳大道234号");
        Arraylist a5 = new Arraylist("京A45225",03,"崇阳大道234号");
        Arraylist a6 = new Arraylist("京A45225",03,"崇阳大道234号");
        ArrayList list = new ArrayList();


        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        System.out.println("一共有"+list.size()+"条");
        System.out.println("*********************");
        for (Object obj:list
        ) {
            Arraylist a = (Arraylist)obj;
            System.out.println(a.getID()+","+a.getAge()+","+a.getAdd());

        }
        System.out.println("************************");
        for (int i = 0;i<list.size();i++) {
            Arraylist a = (Arraylist)list.get(i);
            System.out.println(a.getID()+","+a.getAge()+","+a.getAdd());
        }



    }
}
