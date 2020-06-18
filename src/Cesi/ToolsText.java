package Cesi;

public class ToolsText {
    public static void main(String[] args) {
        EletricCar e = new EletricCar();
        e.setWheel(4);
        e.setColor("白色");
        e.setElectricity(true);
        e.Behavor();
        System.out.println("*******************");
        e.setWheel(4);
        e.setColor("黑色");
        e.setElectricity(false);
        e.Behavor();

    }
}
