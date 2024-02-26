package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;


public interface UserService {
    public User getUser(Long id);
}
