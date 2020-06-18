public class YeWu {
    Autoumobile[] autoumobile=new Autoumobile[8];
    public void inti() {
        autoumobile[0]=new Car("鄂AJ3732","宝马",350,"M1");
        autoumobile[1]=new Car("鄂AJ3734","宝马",450,"X5");
        autoumobile[2] =new Car("鄂AJ3745","别克",200,"林荫大道");
        autoumobile[3]=new Car("鄂AJ3744","别克",380,"GL8");
        autoumobile[4] =new Bus("鄂AJ3732","金龙",1000,24);
        autoumobile[5] =new Bus("鄂AJ3732","金龙",1300,36);
        autoumobile[6] =new Bus("鄂AJ3732","金杯",1370,36);
        autoumobile[7]=new Bus("鄂AJ3732","金杯",1050,24);
    }
    public Autoumobile getAutoumobile(String brand,String model,int seat) {
        Autoumobile a = null;
        for(Autoumobile autoumobile:autoumobile) {
            if (autoumobile instanceof Car) {
                Car car = (Car)autoumobile;
                if(car.getBrand().equals(brand)&&car.getModel().equals(model)) {
                    a=car;
                    break;
                }

            }else if (autoumobile instanceof Bus) {
                Bus bus = (Bus)autoumobile;
                if(bus.getBrand().equals(brand)&&bus.getSeat()==seat) {
                    a=bus;
                    break;
                }
            }
        }
        return a;


    }
}
