package dd.设计模式.装饰模式;

/**
 * @program: test
 * @description: 具体的装饰类
 * @author: 胡凯铭
 * @create: 2020-04-24 15:02
 **/

public class ConcreateDecoratorl extends Decorator {
    public ConcreateDecoratorl(Component component) {
        super(component);
    }


    private void method1(){
        System.out.println("装饰开始");
    }


    @Override
    public void operate() {
        this.method1();
        super.operate();

    }


}
  class ConcreateDecoratorl2 extends Decorator{
      public ConcreateDecoratorl2(Component component) {
          super(component);
      }


      private void method1(){
          System.out.println("装饰开始 其二");
      }


      @Override
      public void operate() {

          super.operate();
          this.method1();


      }
  }

