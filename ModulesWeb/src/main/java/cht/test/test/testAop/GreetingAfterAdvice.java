package cht.test.test.testAop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by chenhaitao on 2017/8/31.
 */
public class GreetingAfterAdvice implements AfterReturningAdvice{
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        String clientName = (String)objects[0];
        System.out.println("Bye~ Mr."+clientName+". enjoy yourself!");
    }
}
