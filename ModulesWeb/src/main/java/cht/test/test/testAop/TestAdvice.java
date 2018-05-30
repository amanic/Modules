package cht.test.test.testAop;

import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by chenhaitao on 2017/8/31.
 */
public class TestAdvice {
    public static void main(String[] args) {
//        testBefore();
//        testAfter();
//        testInterceptor();
        testThrows();
    }

    public static void testBefore(){
        Waiter waiter = new NaiveWaiter();
        //前置增强
        BeforeAdvice advice = new GreetingBeforeAdvice();

        //spring提供的代理工厂
        ProxyFactory proxyFactory = new ProxyFactory();

        //设置代理目标
        proxyFactory.setTarget(waiter);

        //为代理目标添加增强
        proxyFactory.addAdvice(advice);

        //生成代理实例
        Waiter proxy = (Waiter)proxyFactory.getProxy();
        proxy.greetTo("陈海涛");
        proxy.serveTo("陈海涛");


    }
    public static void testAfter(){
        Waiter waiter = new NaiveWaiter();
        //后置增强
        AfterReturningAdvice advice = new GreetingAfterAdvice();

        //spring提供的代理工厂
        ProxyFactory proxyFactory = new ProxyFactory();

        //设置代理目标
        proxyFactory.setTarget(waiter);

        //为代理目标添加增强
        proxyFactory.addAdvice(advice);

        //生成代理实例
        Waiter proxy = (Waiter)proxyFactory.getProxy();
        proxy.greetTo("陈海涛");
        proxy.serveTo("陈海涛");


    }
    public static void testInterceptor(){
        Waiter waiter = new NaiveWaiter();
        //环绕增强
        MethodInterceptor advice = new GreetingInterceptor();

        //spring提供的代理工厂
        ProxyFactory proxyFactory = new ProxyFactory();

        //设置代理目标
        proxyFactory.setTarget(waiter);

        //为代理目标添加增强
        proxyFactory.addAdvice(advice);

        //生成代理实例
        Waiter proxy = (Waiter)proxyFactory.getProxy();

        proxy.greetTo("郭振源");
        proxy.serveTo("臭傻逼");
    }
    public static void testThrows(){
        ForunService forunService = new ForunService();
        //异常处理增强
        ThrowsAdvice advice = new TransactionManagerAdvice();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(forunService);
        proxyFactory.addAdvice(advice);
        proxyFactory.setProxyTargetClass(true);
        ForunService proxy = (ForunService)proxyFactory.getProxy();
        proxy.removeForum();
//        proxy.updateForum();
    }
}
