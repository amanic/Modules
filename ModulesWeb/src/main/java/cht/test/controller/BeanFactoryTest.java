package cht.test.controller;

import cht.test.beanFactory.MyBeanPostPeocessor;
import cht.test.beanFactory.MyInstanceAwareBeanPostProcessor;
import cht.test.model.Car;
import cht.test.model.Trunk;
import cht.test.test.testDI.Knight;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * 学习bean工厂，这里是xmlbeanfactory
 * Created by chenhaitao on 2017/8/26.
 */
public class BeanFactoryTest {
    public static void main(String[] args) {
//        test01();
//        test02();
        //test03()测试BeanFactory的生命周期。
//        test03();
        test04();

    }

    public static void test01() {
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        Resource resource = resourcePatternResolver.getResource("classpath:META-INF/spring/modules-context.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        System.out.println("初始化BeanFactory");
        Car car = beanFactory.getBean("carBean",Car.class);
        System.out.println(car.getBrand()+"------>"+car.getColor());
        car.setColor("黑色的也可以啊");
        Car anOtherCar = beanFactory.getBean("carBean",Car.class);
        System.out.println(anOtherCar.getBrand()+"------>"+car.getColor());
        Car theThirdCar = beanFactory.getBean("carBean",Car.class);
        System.out.println(theThirdCar.getBrand()+"------>"+car.getColor());
    }

    public static void test02() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Trunk.class);
        Car car = applicationContext.getBean("configCar",Car.class);
        System.out.println("------>"+car.getBrand());
    }

    public static void test03() {
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        Resource resource = resourcePatternResolver.getResource("classpath:META-INF/spring/modules-context.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        ((ConfigurableBeanFactory)beanFactory).addBeanPostProcessor(new MyBeanPostPeocessor());
        ((ConfigurableBeanFactory)beanFactory).addBeanPostProcessor(new MyInstanceAwareBeanPostProcessor());
        Car car = beanFactory.getBean("car",Car.class);
        car.introduce();
        car.setColor("红色");
        ((XmlBeanFactory)beanFactory).destroySingletons();
    }

    public static void test04(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/DragonAndMusic.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }



}
