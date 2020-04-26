package dd.设计模式.单列模式;

import java.util.ArrayList;
import java.util.Random;

/**
 * @program: test
 * @description: 皇帝类
 * @author: 胡凯铭
 * @create: 2020-04-12 15:07
 **/

public class Emperor {

    private static final int maxNumOfEmperor = 2;
    private static final Emperor emperor = new Emperor();

    private static  int countNumOfEmperor;

    //皇帝的名字
    private static ArrayList<String>nameList = new ArrayList<>();
//    用来村粗皇帝的对象
    private static ArrayList<Emperor>emperorList = new ArrayList<Emperor>();

      private Emperor(String name){
          nameList.add(name);
      }

    static{
        for (int i = 0;i < maxNumOfEmperor;i++){
            emperorList.add(new Emperor(i + "号皇帝"));
        }
    }

    private Emperor(){

    }

    public static Emperor getEmperor(){
        return emperor;
    }

    public void say(){
        System.out.println("我是皇帝"  + nameList.get(countNumOfEmperor));
    }


    public static Emperor getInstance(){
        Random random = new Random();

          countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }

}

