package dd.设计模式.装饰模式;

/**
 * @program: test
 * @description: 抽象装饰者
 * @author: 胡凯铭
 * @create: 2020-04-24 15:00
 **/

public abstract class Decorator extends Component {

    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}

