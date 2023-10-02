package com.geekster.UserManagement.service;

import com.geekster.UserManagement.model.User;
import com.geekster.UserManagement.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;

    public String addUser(User newUser) {
        userRepo.save(newUser);
        return "added";
    }

    public User getUserById(Integer userId) {
        return userRepo.findById(userId).orElseThrow();
    }

    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    public String updateUserById(Integer userId, User myUser) {
        User user = userRepo.findById(userId).get();
        user.setUserName(myUser.getUserName());
        user.setName(myUser.getName());
        user.setAddress(myUser.getAddress());
        user.setPhoneNumber(myUser.getPhoneNumber());
        userRepo.save(user);
        return "user updated";
    }

    public String deleteUserById(Integer userId) {
        userRepo.deleteById(userId);
        return "user deleted";
    }

    public List<User> addUsers(User newUser) {
        User savedUser = userRepo.save(newUser);
        List<User> userList = new ArrayList<>();
        userList.add(savedUser);
        return userList;
    }

}
