package dd.设计模式.单列模式;

/**
 * @program: test
 * @description: 臣子类
 * @author: 胡凯铭
 * @create: 2020-04-12 15:15
 **/

public class Minister {
    public static void main(String[] args) {
      int ministerNum = 5;
      for(int i = 0;i < ministerNum;i++){
          Emperor emperor = Emperor.getInstance();
          System.out.println("第"  + (i + 1) + "个大臣参拜的是");
          emperor.say();
      }
    }
}

