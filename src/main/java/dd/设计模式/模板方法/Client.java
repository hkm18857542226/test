package dd.设计模式.模板方法;

/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-04-13 16:14
 **/

public class Client {
    public static void main(String[] args) {
        HummerModel h1 = new HummerH1Model();
        h1.run();
    }
}

