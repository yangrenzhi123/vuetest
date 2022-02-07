package com.example.demo.controller;
 
import com.example.demo.common.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by 大帅哥张
 * 2022/01/26
 */
@RestController
@RequestMapping("/rest")
public class LoginController {
 
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Boolean Login(@RequestBody User user) {
        System.out.printf("用户名" + user.getUserName());
        System.out.printf("用户密码" + user.getPassword());
        return Boolean.TRUE;
    }
 
}
 