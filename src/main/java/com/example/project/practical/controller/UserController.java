package com.example.project.practical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.UserDetailsRepositoryReactiveAuthenticationManager;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.practical.model.User;
import com.example.project.practical.pojo.UserLoginRequest;
import com.example.project.practical.service.UserService;




@RestController
@RequestMapping("/user")
@CrossOrigin(origins ="http://localhost:4200")

public class UserController {
	
	
	@Autowired
    private UserService service;
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User userData){
        return ResponseEntity.ok(service.findByUsername(userData));
    }
    
	
	
	@GetMapping("/test")
	String testFunction() {
		return "Hello this is";
		}
			
}

