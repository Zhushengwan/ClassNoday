package Cesi;

public class Mobike extends Tools {
    public Mobike(int wheel, String color) {
        super(wheel, color);
    }

    public Mobike() {

    }

    public void Behavor() {
        System.out.println("踩着"+this.getWheel()+"个轮子的"+this.getColor()+"车");

    }
}
