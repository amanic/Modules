package cht.test.test.testBeanFactory;

import cht.test.model.Car;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * Created by chenhaitao on 2018/5/31.
 */
public class BeanFactoryTest {
    public static void getBean() throws Exception{
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource resource = resolver.getResource("classpath:META-INF/spring/modules-context.xml");
        System.out.println(resource.getURL());
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);
        System.out.println("initial...");
        Car car = factory.getBean("car",Car.class);
        System.out.println("finish...");
        System.out.println(car.toString());
    }

    public static void main(String[] args) {
        try {
//            getBean();
//            getBeanByApplicationContext();
            getBeanByAnnotationApplicationContext();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getBeanByApplicationContext(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/modules-context.xml");
        Car car = context.getBean("car",Car.class);
        car.introduce();
    }

    public static void getBeanByAnnotationApplicationContext(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Beans.class);
        Car car = context.getBean("car",Car.class);
        System.out.println(car.toString());
    }
}
