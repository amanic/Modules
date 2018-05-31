package cht.test.test.testBeanFactory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
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
        System.out.println(car.introduce());
    }

    public static void main(String[] args) {
        try {
            getBean();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
