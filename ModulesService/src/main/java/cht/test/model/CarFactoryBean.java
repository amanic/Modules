package cht.test.model;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by chenhaitao on 2017/8/29.
 */
public class CarFactoryBean implements FactoryBean<Car>{

    private String carInfo;

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }

    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        car.setColor("红色");
        car.setBrand("benz");
        car.setMaxSpeed(1000);
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
