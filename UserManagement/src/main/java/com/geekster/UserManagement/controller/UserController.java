package com.geekster.UserManagement.controller;

import com.geekster.UserManagement.model.User;
import com.geekster.UserManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("user")
    public String addUser(@RequestBody User newUser) {
       return userService.addUser(newUser);
    }

    @PostMapping("users")
    public List<User> addUsers(@RequestBody User newUser) {
        return userService.addUsers(newUser);
    }

    @GetMapping("user/{userId}")
    public User getUserById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }

    @GetMapping("users")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @PutMapping("user/{userId}")
    public String updateUserById(@PathVariable Integer userId, @RequestBody User myUser) {
        return userService.updateUserById(userId, myUser);
    }

    @DeleteMapping("user")
    public String deleteUserById(@PathVariable Integer userId) {
        return userService.deleteUserById(userId);
    }
}
