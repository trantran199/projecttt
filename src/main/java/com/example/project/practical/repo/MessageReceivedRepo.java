package com.example.project.practical.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.project.practical.model.MessageReceived;
import com.example.project.practical.pojo.MessageReceivedData;


@Repository

public interface MessageReceivedRepo extends JpaRepository<MessageReceived, Integer> {
	@Query(nativeQuery = true)
	List<MessageReceivedData> getAllMessageReceives();

}
