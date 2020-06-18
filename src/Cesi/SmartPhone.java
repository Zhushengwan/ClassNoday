package Cesi;

public class SmartPhone extends Phone implements Network,TakePhoto,PlaySth{
    public SmartPhone() {

    }

    public SmartPhone(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void netWork() {
        System.out.println("连接上网络......");



    }

    @Override
    public void call() {
        System.out.println("正在视频通话......");

    }

    @Override
    public void sendMesg() {
        System.out.println("正在发送图片和文字........");

    }

    @Override
    public void play(String count) {
        System.out.println("正在播放视频《"+count+"》 ......");

    }

    @Override
    public void takephoto() {
        System.out.println("咔嚓，拍了一张美图.......");

    }
}
