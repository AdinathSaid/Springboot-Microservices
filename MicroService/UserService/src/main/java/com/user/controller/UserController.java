package com.user.controller;

import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userid}")
    public User getuser(@PathVariable Long userid){
        User user=userService.getUser(userid);
        List contacts=this.restTemplate.getForObject("http://ContactService/contact/user/"+userid, List.class);
        user.setContacts(contacts);
        return user;
    }
}
