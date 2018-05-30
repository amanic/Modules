package cht.test.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * Created by chenhaitao on 2017/8/26.
 */
public class Car implements BeanFactoryAware,BeanNameAware,InitializingBean,DisposableBean{
    private String brand;

    private String Color;

    private int maxSpeed;

    private BeanFactory beanFactory;

    private String beanName;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public String getBeanName() {
        return beanName;
    }

    public Car (){
        System.out.println("构造函数");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("setBrand");
        this.brand = brand;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        System.out.println("setColor");
        Color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", Color='" + Color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", beanFactory=" + beanFactory +
                ", beanName='" + beanName + '\'' +
                '}';
    }

    public void introduce(){
        System.out.println(this.toString());
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory");
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName");
        this.beanName = s;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    public void myInit(){
        System.out.println("myInit");
        this.maxSpeed = 240;
    }

    public void myDestroy(){
        System.out.println("myDestroy");
    }
}
