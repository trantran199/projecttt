package com.example.project.practical.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Thanhtm
 */
@Data
@Getter
@Setter
public class UserLoginRequest {
    
   
    private String username;
    
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

}
