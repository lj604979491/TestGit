package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloWorld {

    @Autowired
    private UserService userService;

    @ResponseBody

    @RequestMapping("/hello")
    public Map hello(String id){
        Map paramMap = new HashMap();
        paramMap.put("id",id);
        return  paramMap;
    }

    @RequestMapping("/getUser")
    public List<User> getUser(String id){
        List userList = new ArrayList();

        User user= new User();
        user.setId(Integer.parseInt(id));
        user.setName("孙笑川");
        user.setDesc("带恶人");

        User user2= new User();
        user2.setId(Integer.parseInt(id));
        user2.setName("柠檬人");
        user2.setDesc("60E");

        User user3= new User();
        user3.setId(Integer.parseInt(id));
        user3.setName("TheShy");
        user3.setDesc("姜东根");


        User userById = userService.findUserById(Integer.parseInt(id));

        userList.add(user);
        userList.add(user2);
        userList.add(userById);
        return userList;
    }

    @RequestMapping("/getUserMap")
    public Map getUserMap(){
        Map userMap = new HashMap();
        userMap.put("id","1");
        userMap.put("name","李相赫");
        userMap.put("desc","faker");
        return userMap;
    }
}
