package com.offcn.controller;

import com.offcn.pojo.Car;
import com.offcn.pojo.TestUser;
import com.offcn.pojo.UserBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/hello")
@EnableConfigurationProperties({UserBody.class, TestUser.class})
public class HelloController {
    /**
     * 获得用户名
     * @return
     */
    @Value("${offcn.ip}")
    private String ip;

    @Value("${offcn.port}")
    private String port;


    @Autowired
    UserBody userbody;// 此处有可能会报红，但是不影响程序的运行
    @Autowired
    TestUser testUser;

    @GetMapping("/gettestuser")
    public String gettestuser(){
        return testUser.toString();
    }

    @GetMapping("/getUser")
    public String getUser(){
        return userbody.toString();
    }

    @GetMapping("/getvalue")
    public String getValue() {
        return "ip:"+ip+" port:"+port;
    }
    @RequestMapping(value = "/name")
    public String sayHello(){
        return "hello spring Boot!";
    }

    /**
     *  获得一辆车
     */
    @RequestMapping("/findOne")
    public Car findOneCar(){
        return new Car(1,"大奔",30000000,new Date());
    }

    /**
     *  获得车
     */
    @RequestMapping("/findAll")
    public List<Car> findAllCar(){
        List<Car> list=new ArrayList<>();
        list.add(new Car(1,"大奔1",300000001,new Date()));
        list.add(new Car(2,"大奔2",300000002,new Date()));
        list.add(new Car(3,"大奔3",300000003,new Date()));
        list.add(new Car(4,"大奔4",300000004,new Date()));

        return list;
    }
    public void demo(){
        System.out.println("hahahahahahsa");
    }
}
