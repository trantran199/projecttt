package com.example.project.practical.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.project.practical.model.User;
import com.example.project.practical.pojo.UserLoginRequest;
import com.example.project.practical.repo.UserRepo;
@Service
@Repository
public class UserService {

    final String CONST_PAGEABLE_TYPE = "page";

    @Autowired
    private UserRepo userRepository;
    
    public User findByUsername(User userData) {
        User user = userRepository.findByUsername(userData.getUsername());
        try {
        if(user.getPassword().equals(userData.getPassword())) {
            return user;
        }} catch ( NullPointerException e) {
			System.out.println("Khong tim thay user");
			
		}
        return null;
    }
               
   }
    
    
