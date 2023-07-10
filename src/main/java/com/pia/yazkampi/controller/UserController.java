package com.pia.yazkampi.controller;

import com.pia.yazkampi.dto.UserResponse;
import com.pia.yazkampi.dto.UserSaveRequest;
import com.pia.yazkampi.entity.User;
import com.pia.yazkampi.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/save")
    @ApiOperation(value="Create User method", notes="Something happen!!!")
    public UserResponse save(@RequestBody UserSaveRequest user) {
        return userService.save(user);
    }

    @GetMapping(value = "/getAll")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping(value = "/getById/{id}")
    public User getById(@PathVariable String id) {
        return userService.getById(id);
    }

    @PutMapping(value = "/update/{username}")
    public UserResponse update(@RequestBody UserSaveRequest request, @PathVariable String username) {
        return userService.update(request, username);
    }
}
