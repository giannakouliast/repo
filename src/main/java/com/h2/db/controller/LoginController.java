//package com.h2.db.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class LoginController {
//
//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }
//}

//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import com.h2.db.model.LoginForm;
//
//@RestController
//public class LoginController {
//
//    private final AuthenticationManager authenticationManager;
//
//    public LoginController(AuthenticationManager authenticationManager) {
//        this.authenticationManager = authenticationManager;
//    }
//
//    @GetMapping("/login")
//    public ResponseEntity<?> login(@RequestBody LoginForm loginForm) {
//        try {
//            Authentication authentication = authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(loginForm.getSsn(), loginForm.getPassword()));
//
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
//            return "user"; // Return username upon successful login
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid SSN or password");
//        }
//    }
//}