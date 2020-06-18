package args.Meiju;

import java.util.Arrays;
import java.util.Scanner;

public class Text {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        Week[] values = Week.values();

        Week w = null;

        for (Week value : values) {

            if(value.getIndex()== num) {

                w = value;

                break;
            }



        }
        if(w!=null) {

            System.out.println(Weeks.getWeek(w));
        }

    }

}
