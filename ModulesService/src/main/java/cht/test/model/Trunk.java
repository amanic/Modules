package cht.test.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chenhaitao on 2017/8/28.
 */
@Configuration
public class Trunk {

    @Bean(name = "configCar")
    public Car buildCar(){
        Car car = new Car();
        car.setColor("red");
        car.setBrand("brand");
        System.out.println("initial");
        return car;
    }

}
