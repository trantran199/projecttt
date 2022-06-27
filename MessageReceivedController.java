package com.example.project.practical.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.practical.pojo.MessageReceivedData;

import com.example.project.practical.repo.MessageReceivedRepo;


@RestController
@RequestMapping

public class MessageReceivedController {
	@Autowired
	private MessageReceivedRepo repository;
	
	@GetMapping("messageReceives")
	public ResponseEntity<List<MessageReceivedData>> getAllMessageReceives(){
		return ResponseEntity.ok(repository.getAllMessageReceives());
	};
	

}
