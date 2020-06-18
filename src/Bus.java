public class Bus extends Autoumobile {
    private int seat;
    public Bus() {

    }
    public Bus(String ID, String brand, int perPrice,int seat) {
        super(ID,brand,perPrice);
        this.seat=seat;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public double clecRent(int days) {
        double price = this.getPerPrice()*days;
        if(days>10&&days<=40) {
            price*=0.92;

        }else if(days>400&&days<=80) {
            price*=0.75;
        }else if (days>80&&days<=160) {
            price*=0.63;

        }else if (days>160) {
            price*=0.53;
        }
        return price;

    }
}
