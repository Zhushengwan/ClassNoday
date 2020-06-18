package Cesi;

public class CommonPhone extends Phone implements PlaySth {
    public CommonPhone() {

    }

    public CommonPhone(String brand, String type) {
        super(brand, type);
    }

    public void call() {
        System.out.println("正在语音通话.......");

    }

    @Override
    public void sendMesg() {
        System.out.println("正在发送文字信息......");

    }

    @Override
    public void play(String count) {
        System.out.println("正在播放音频《"+count+"》");

    }
}
