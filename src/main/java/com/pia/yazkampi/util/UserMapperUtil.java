package com.pia.yazkampi.util;

import com.pia.yazkampi.dto.UserResponse;
import com.pia.yazkampi.dto.UserSaveRequest;
import com.pia.yazkampi.entity.User;

import java.time.LocalDateTime;

public class UserMapperUtil {

    public static User toUser(UserSaveRequest userSaveRequest) {
        User user = new User();

        user.setName(userSaveRequest.getName());
        user.setAge(userSaveRequest.getAge());
        user.setUsername(userSaveRequest.getUsername());
        user.setAdresses(userSaveRequest.getAddresses());
        user.setCreatedDate(LocalDateTime.now());

        return user;
    }

    public static UserResponse toUserResponse(User user) {
        UserResponse userResponse = new UserResponse();
        userResponse.setAge(String.valueOf(user.getAge()));
        userResponse.setName(user.getName());
        userResponse.setUsername(user.getUsername());
        userResponse.setAddresses(user.getAdresses());

        return userResponse;
    }

    public static User forUpdate(UserSaveRequest saveRequest, User existUser) {
        existUser.setAge(saveRequest.getAge());
        existUser.setName(saveRequest.getName());
        existUser.setAdresses(saveRequest.getAddresses());

        return existUser;
    }

}


