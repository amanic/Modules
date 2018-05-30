package cht.test.dal.annotation;

import java.lang.annotation.*;

/**
 * Created by chenhaitao on 2017/8/22.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface MybatisMapper {

    public String name() default "";
}
