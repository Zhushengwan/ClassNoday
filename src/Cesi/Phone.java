package Cesi;

public abstract class Phone {
    private String brand;
    private String type;
    public Phone() {}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Phone(String brand, String type) {
        this.brand=brand;
        this.type=type;

    }
    public void show() {
        System.out.println("这是一台"+brand+type+"手机");

    }
    public abstract void  call();
    public abstract void sendMesg();


}
