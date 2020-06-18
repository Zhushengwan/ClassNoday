public class Car extends Autoumobile{
    private String model;
    public Car() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String ID, String brand, int perPrice, String model) {
        super(ID,brand,perPrice);
        this.model=model;

    }

    @Override
    public double clecRent(int days) {
        double price = this.getPerPrice()*days;
        if(days>15&&days<=30) {
            price*=0.9;

        }else if(days>30&&days<=60) {
            price*=0.8;
        }else if (days>60&&days<=100) {
            price*=0.7;

        }else if (days>100) {
            price*=0.5;
        }
        return price;
    }
}
