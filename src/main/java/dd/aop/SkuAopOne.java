package dd.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import javax.ejb.BeforeCompletion;

/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-03-07 14:30
 **/
@Configuration
 @Aspect
public class SkuAopOne {

    public SkuAopOne() {
        System.out.println("aop的类被创建了");
    }

    @Before("execution(* dd.dao.*.*(..))")
    public void asDao(){
        System.out.println("在摸个方法之气前吖");
    }

}

