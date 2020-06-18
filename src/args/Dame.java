package args;

import java.text.SimpleDateFormat;
import java.util.*;

public class Dame {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();

        SimpleDateFormat df =  new SimpleDateFormat("YYYY年MM月dd日 HH:mm:ss E");
        String format = df.format(date);
        System.out.println(format);


    }
}
