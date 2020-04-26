package dd.javase.正则表达式;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.jsf.el.SpringBeanFacesELResolver;

import java.util.Arrays;

/**
 * @program: test
 * @description: 正则表达
 * @author: 胡凯铭
 * @create: 2020-04-24 20:14
 **/

public class Splitting {

    public static String knights = "THen .when you have found the shrubbery,you must" +
            "cut down the mightiest tree in the forest.,." +
            "with... a herring!";

    public static void split(String regex){
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("");
//        split(" ");
//        split("TH");
//        split("\\W+");
//        split("n\\W+");
          split("THe?|you?");

        //首字母大写 。结尾

        System.out.println("TG.".matches("[A-Z]{1}.*.[.]$"));
    }
}

