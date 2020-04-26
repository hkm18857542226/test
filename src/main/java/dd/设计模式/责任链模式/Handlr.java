package dd.设计模式.责任链模式;

/**
 * @program: test
 * @description: 抽象父类
 * @author: 胡凯铭
 * @create: 2020-04-22 15:10
 **/

public abstract class Handlr {

    /**
     *  根据类别来分谁是爹谁是丈夫 谁是儿子
     */

    //父亲的id
    public static final Integer FATHER_INT = 1;
    //丈夫类
    public static final Integer  HUSBAND_ID = 2;
    // 儿子的id
    public  static final Integer SON_ID = 3;

    private Handlr handlr = null;


    public abstract int getType();
    /**
     *  设置责任链的下一个负责人
     * @param handlr
     */
    public void setNext(Handlr handlr){
        this.handlr = handlr;
    }

    public Handlr getHandlr() {
        return handlr;
    }

    public void hankderMessage(String name, int type)   {
        Handlr handlr =this;

        while(true){

         if(handlr.getType() == type){
             handlr.response(name);
            return;
         }
         handlr = handlr.getHandlr();
        }
    }

    public abstract void response(String name);




}

