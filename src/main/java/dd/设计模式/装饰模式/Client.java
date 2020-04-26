package dd.设计模式.装饰模式;

/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-04-24 15:06
 **/

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreateDecoratorl(component);
        component = new ConcreateDecoratorl2(component);
        component.operate();
    }
}

