package dd.设计模式.享元模式;

/**
 * @program: test
 * @description: 抽象享元角色
 * @author: 胡凯铭
 * @create: 2020-04-09 15:17
 **/

public abstract class Flyweight {
//    内部状态
    private String intrinsic;
//    外部状态
    protected final String Extrinsic;
//    要求享元脚色必须有一个外部状态
    //外部状态是指不可以共享的数据
    public Flyweight(String extrinsic) {
        Extrinsic = extrinsic;
    }
    //定义业务的操作
    public abstract void operate();

    public String getExtrinsic() {
        return Extrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}

