package args.Meiju;

public enum Week {
    //枚举星期一到星期天
    MON("星期一",1),

    TUE("星期二",2),

    WEN("星期三",3),

    THUS("星期四",4),

    FRI("星期五",5),

    SAN("星期六",6),

    SUN("星期天",7);

    //定义
    private String XingQi;

    private int index;


    private Week() {

    }
    private Week(String XingQi,int index ) {

        this.XingQi=XingQi;

        this.index=index;

    }
    public String getXingqi() {

        return this.XingQi;
    }

    public int getIndex() {

        return this.index;
    }


}

