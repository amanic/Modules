package cht.test.test.testBeanFactory;

import cht.test.model.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chenhaitao on 2018/5/31.
 */
@Configuration
public class Beans {

    @Bean(name = "car")
    public Car getCar(){
        Car car = new Car();
        car.setMaxSpeed(100);
        car.setBrand("阿波罗");
        car.setColor("黑红");
        return car;
    }
}
