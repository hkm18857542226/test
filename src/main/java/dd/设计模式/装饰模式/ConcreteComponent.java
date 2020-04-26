package dd.设计模式.装饰模式;

/**
 * @program: test
 * @description: 具体的构建
 * @author: 胡凯铭
 * @create: 2020-04-24 15:00
 **/

public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("do Something");
    }
}

