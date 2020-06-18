public abstract class  Autoumobile {
     /*
    * 汽车类:车牌号，品牌，日租金，座位数，型号
客车类：车牌号，品牌，日租金，座位数，型号，
轿车类：车牌号，品牌，日租金，座位数，型号，
    *
    * */
     private  String ID;
     private String brand;
     private int perPrice;
     public Autoumobile() {

     }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPerPrice() {
        return perPrice;
    }

    public void setPerPrice(int perPrice) {
        this.perPrice = perPrice;
    }

    public Autoumobile(String ID, String brand, int perPrice) {
         this.ID=ID;
         this.brand=brand;
         this.perPrice=perPrice;
     }
     public abstract double clecRent(int days);
}
