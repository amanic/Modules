package cht.test.test.testAop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by chenhaitao on 2017/8/31.
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice{
    @Override
    public void before(Method method, Object[] args, Object obj) throws Throwable {
        String clientName = (String)args[0];
        System.out.println("How are you Mr."+clientName+".");
    }
}
