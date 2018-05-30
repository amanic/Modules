package cht.test.beanFactory;

import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

/**
 * 在使用ApplicationContext初始化时好像没有用到，ApplicationContext怎么getBean？
 *
 * Created by chenhaitao on 2017/8/28.
 */
public class MyInstanceAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter{

    //接口方法，在实例化Bean之前被调用。
    public Object postProcessBeforeInstantiation(Class beanClass, String beanName){
        //仅对容器中的car类进行处理
        if("car".equals(beanName)){
            System.out.println("接口方法，在实例化Bean之前被调用。");
        }
        return null;
    }

    //接口方法，在实例化Bean之后被调用。
    public boolean postProcessAfterInstantiation(Object bean, String beanName){
        if("car".equals(beanName)){
            System.out.println("接口方法，在实例化Bean之后被调用。");
        }
        return true;
    }

    //接口方法，在设置属性值时调用
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName){
        if("car".equals(beanName)){
            System.out.println("接口方法，在设置属性值时调用");
        }
        return pvs;
    }
}
