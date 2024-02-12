//package com.h2.db.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.h2.db.model.User;
//import com.h2.db.service.UserService;
//
//@RestController
//public class SubscriptionController {
//
//    private final UserService userService;
//
//    @Autowired
//    public SubscriptionController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("/register")
//    public String register(@RequestBody User user) {
//        userService.saveUser(user);
//        return "Registration successful!";
//    }
//
//}
