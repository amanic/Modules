package cht.test.beanFactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * 在使用applicationContext初始化容器时才会用到
 *
 * Created by chenhaitao on 2017/8/28.
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition("carBean");
        beanDefinition.getPropertyValues().addPropertyValue("brand","benz");
        System.out.println("调用BeanFactoryPostProcessor的postProcessorBeanFactory");
    }
}
