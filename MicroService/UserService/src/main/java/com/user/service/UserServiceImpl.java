package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    List<User> list=List.of(
            new User(1001l,"Rahul","76465464684"),
            new User(1002l,"Rohit","97641646146"),
            new User(1004l,"Akshay","9789879187")

    );

    @Override
    public User getUser(Long id) {

        return list.stream().filter(user -> user.getUserid().equals(id)).findAny().orElse(null);
    }
}
