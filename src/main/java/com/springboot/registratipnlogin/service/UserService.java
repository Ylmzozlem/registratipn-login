package com.springboot.registratipnlogin.service;

import com.springboot.registratipnlogin.dto.UserDto;
import com.springboot.registratipnlogin.entity.User;

import java.util.List;

public interface UserService {
    User findUserByEmail(String email);

    void saveUser(UserDto userDto);

    List<UserDto> findAllUsers();
}
