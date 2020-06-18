package args;

import java.util.Random;
//Random类的随机数；
public class RandomText {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0;i<100;i++) {
            int a = r.nextInt(50)+50;
            System.out.println(a);
        }

    }

}
