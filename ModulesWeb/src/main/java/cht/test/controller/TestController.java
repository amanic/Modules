package cht.test.controller;

import cht.test.dal.entity.User;
import cht.test.model.Car;
import cht.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;


/**
 * Created by chenhaitao on 2017/8/21.
 */

@RequestMapping("/test")
@Controller
public class TestController {
    //Autowired的required属性代表是否一定要有需要被注入的bean，若required=false，在没有bean时也不会报错。
    @Autowired(required = false)
    private TestService testService;

    @Autowired
    private Car car;



    @ResponseBody
    @RequestMapping(value = "t00",produces = "text/html;charset=utf-8")
    public String test00(@RequestParam Integer id, HttpServletResponse response){
        response.setContentType("text/html;charset=utf-8");
        User user = testService.test00(id);
        car.introduce();
        return user.toString();
    }

}
