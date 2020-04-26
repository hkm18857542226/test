package dd.设计模式.策略模式;

/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-04-24 16:04
 **/

public   class Context {
     private IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public   void operate(){
        this.iStrategy.operate();

    }
}

