package cht.test.test.testAop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by chenhaitao on 2017/8/31.
 */
public class GreetingInterceptor implements MethodInterceptor{
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object[] args = methodInvocation.getArguments();
        String clientName = (String)args[0];
        System.out.println("How are you Mr."+clientName+".");
        Object obj = methodInvocation.proceed();
        System.out.println("Bye~ Mr."+clientName+". enjoy yourself!");
        return obj;
    }
}
