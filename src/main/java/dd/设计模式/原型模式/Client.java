package dd.设计模式.原型模式;

import java.util.Random;

//原型模式的意义在于对象（多个相同的对象）的 创建是根据clone 来实现的
/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-04-19 16:49
 **/

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        int MAX_COUNT = 6;
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("xx 银行版权所有");


       Mail mail12 = mail.clone();
       mail.getList().add(0);
        System.out.println(mail12.getList().size());
        System.out.println(mail.getList().size());
;
    }


    public static void sendMail(Mail mail){
        System.out.println("标题"  + mail.getSubject() + "\ts收i安人" + mail.getReceiver() + "\t 。。。发送成功");
    }

    public static String getRandString(int maxLength){
        String source = "abcdefghijlmnopqrstuvwxyz";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0;i < maxLength;i++){
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}

