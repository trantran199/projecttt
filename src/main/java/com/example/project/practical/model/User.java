package com.example.project.practical.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "taikhoan")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class User {
	@Id
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	 public String getPassword() {
		 return password;
	 }


}
