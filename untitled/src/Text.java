import java.util.*;
public class Text {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        YeWu yewu = new YeWu();
        System.out.println("****欢迎来到莱莱汽车租赁公司****");
        System.out.println("请选择你要租的车型：1，客车  2，轿车");
        int type = input.nextInt();
        String brand = " ";
        int seat = 0;
        String model = " ";
        switch (type) {
            case 2:
                System.out.println("请选择你要租车的品牌：1，别克  2，宝马");
                int choose = input.nextInt();
                if(choose==1) {
                    brand = "别克";
                    System.out.println("请选择你要租的车型：1，林荫大道  2，GL8");
                    model=(input.nextInt()==1)?"林荫大道":"GL8";
                }else {
                    brand ="宝马";
                    System.out.println("请选择你要租的车型：1，M1  2，X5");
                    model=(input.nextInt()==1)?"M1":"X5";
                }
                break;
            case 1:
                System.out.println("请选择你要租车的品牌：1，金杯  2，金龙");
                brand=(input.nextInt()==1)?"金杯":"金龙";
                System.out.println("请选择你要租的座位：1，24座  2，36座");
                seat=(input.nextInt()==1)?24:36;
                break;

        }
        yewu.inti();
        Autoumobile a = yewu.getAutoumobile(brand,model,seat);
        System.out.println("请输入你要租的天数：");
        int days = input.nextInt();
        double price =  a.clecRent(days);
        System.out.println("您租车的车牌号为"+a.getID());
        System.out.println("你租车的费用为："+price+"元");
    }
}
