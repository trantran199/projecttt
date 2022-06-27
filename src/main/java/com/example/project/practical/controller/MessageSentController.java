package com.example.project.practical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.practical.pojo.MessageSentData;
import com.example.project.practical.repo.MessageSentRepo;

@RestController
@RequestMapping
public class MessageSentController {
	@Autowired
	private MessageSentRepo repository;
	
	@GetMapping("/messagesents")
	public ResponseEntity<List<MessageSentData>> getAllMessageSents(){
		return ResponseEntity.ok(repository.getAllMessageSents());
	};
	
	

}