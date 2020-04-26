package dd;

import dd.service.OIne;
import dd.service.web;
import dd.基本算法.ForName;
import dd.基本算法.快速排序;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.binding.MapperProxy;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.regex.Pattern;

/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-02-03 11:24
 **/


public class Mq {
    public static String reverse1(String s){
        if(s.length() <= 1){
            return s;
        }
        String left = s.substring(0,s.length() / 2);
        String reight = s.substring(s.length() / 2,s.length());
        return    reverse1(reight)  + reverse1(left);
    }

    public static void upString(char[] a){
        char[] b = {'a','n'};
        a[0] = 'd';
    }
    static int a = 10;

    public static void main(String[] args) throws Exception, UnsupportedEncodingException {
//        // 初始化服务器的名称
//        DefaultMQProducer producer = new DefaultMQProducer("hukaiming");
//        // Specify name server addresses.  指定服务器的IP地址和端口号
//        producer.setNamesrvAddr("localhost:9876");
//        //启动服务器  start 线程启动
//        producer.start();
//        for (int i = 0;i < 100;i++){
//            //创建一个消息实例，指定主题，标签和消息正文。
//            Message msg = new Message("TopicTest","TagA",("reHello RocketMQ" + i).getBytes(RemotingHelper.DEFAULT_CHARSET));
//            //调用发送消息以将消息传递给其中一个代理。
//            SendResult sendResult =  producer.send(msg);
//            System.out.println(sendResult);;
//        }
//        //一旦不再使用生产者实例，则关闭。
//        producer.shutdown();

        String sdfsdf = "hkmsdfer";
         Annotation[]annotations =  web.class.getAnnotations();

         if(annotations.length > 0){
             System.out.println(annotations[0].toString());
         }
        String pattern = "(.*hkm.*)";
        System.out.println(Pattern.matches(pattern,sdfsdf));


//        Hkm hkm = (Hkm) Proxy.newProxyInstance(H.class.getClassLoader(),new Class[]{Hkm.class},new hkmmmm());
//        hkm.ShuChu();

    }





@ForName
    static class hkmmmm implements InvocationHandler {


        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("OK");
            method.invoke(new H(), args);
            System.out.println();
            System.out.println(method.getName());
            return null;

        }
    }

    public static void getArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;
                }
            }
        }

        for (int a : array
        ) {
            System.out.println(a);
        }


    }
}


