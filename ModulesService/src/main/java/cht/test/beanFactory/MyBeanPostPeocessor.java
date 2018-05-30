package cht.test.beanFactory;

import cht.test.model.Car;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 无论是用的是BeanFactory还是ApplicationContext都会使用到
 *
 * Created by chenhaitao on 2017/8/28.
 */
public class MyBeanPostPeocessor implements BeanPostProcessor{
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if("car".equals(beanName)){
            Car car = (Car)bean;
            if(car.getColor()==null){
                System.out.println("通过postProcessBeforeInitialization设置颜色");
                car.setColor("黑色");
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if("car".equals(beanName)){
            Car car = (Car)bean;
            if(car.getMaxSpeed() > 200){
                System.out.println("超速了，降低到200码。");
                car.setMaxSpeed(200);
            }
        }
        return bean;
    }
}
