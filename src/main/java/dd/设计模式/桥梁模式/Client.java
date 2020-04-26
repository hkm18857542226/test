package dd.设计模式.桥梁模式;

/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-04-10 15:09
 **/

public class Client {
    public static void main(String[] args) {
//    第一版
//    System.out.println("房地产公司开始运行了");
//        HouseCorp houseCorp = new HouseCorp();
//        houseCorp.makeMondy();
//        System.out.println("\n");
//        System.out.println("---山楂公司是这样运行的");
//        IpodCorp clothesCorp = new IpodCorp();
//        clothesCorp.makeMondy();

        //第二版

        House house = new House();
        System.out.println("房地产公司开始运行了");
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMondy();
        System.out.println("\n");
        ShangZhaiCorp shangZhaiCorp = new ShangZhaiCorp(new IPod());
        shangZhaiCorp.makeMoney();

        System.out.println("------山楂公司是这样运行的");
        ShangZhaiCorp shangZhaiCorp1 = new ShangZhaiCorp(new Clothes());
        shangZhaiCorp1.makeMoney();

    }
}

