package Cesi;

public class EletricCar extends Tools {
    private boolean electricity;

    public EletricCar(int wheel, String color, boolean electricity) {
        super(wheel, color);
        this.electricity = electricity;
    }

    public EletricCar(boolean electricity) {
        this.electricity = electricity;
    }

    public EletricCar() {


    }

    public boolean isElectricity() {
        return electricity;
    }

    public void setElectricity(boolean electricity) {
        this.electricity = electricity;
    }

    @Override
    public void Behavor() {
        if(electricity==true) {
            System.out.println("骑着"+this.getWheel()+"轮子的"+this.getColor()+"的车电池有电");

        }else {
            System.out.println("踩着"+this.getWheel()+"个轮子的"+this.getColor()+"车电池没电");
        }

    }


}
