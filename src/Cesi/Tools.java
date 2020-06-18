package Cesi;

public abstract class Tools {
    /**
     a) 自行车类：
     属性：轮子个数，轮子颜色
     行为：跑(输出语句模拟：“蹬着xx只轮子的x色的车”，输出语句中使用自行车的属性。
     b) 电动车类：
     属性：轮子个数，轮子颜色，电池（布尔类型：真代表有电，假代表没电）
     行为：跑（如果电池有电就输出：骑着xx只轮子的x色的车，如果电池没电需要调用自行车类的跑方法）
     测试类：
     创建一个电动车对象，为电动车各项属性赋值，电动车电池有电，调用跑方法。
     修改电池属性的值，使电动车电池没电，再次调用跑方法




     */
    private int wheel;
    private String color;


    public Tools(int wheel, String color) {
        this.wheel = wheel;
        this.color = color;

    }

    public Tools() {

    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public abstract void Behavor();
}
