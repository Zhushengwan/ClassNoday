package args;

public class Baozhuang {
    public static void main(String[] args) {
        //通过直接new对象
        Integer a = new Integer(10);
        Integer b = new Integer("10");
        Integer c = new Integer(01);
        System.out.println(a+b+c);
        Integer e = Integer.valueOf(10);
        Double f = Double.valueOf(10);
        System.out.println(e+"\n"+f);
        Integer g = 10;
        Double h  =10.0;
        System.out.println(g+"\n"+h);
        Integer m = 10;
        int i = m.intValue();
        System.out.println(i);
//生成随机数
//        double v = Math.random();
//        System.out.println(v);
        double k = 3.045;
        long j = Math.round(k);
        System.out.println(j);


    }
}
