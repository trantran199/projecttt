package com.example.project.practical.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.project.practical.model.MessageSent;
import com.example.project.practical.pojo.MessageSentData;
@Repository

public interface MessageSentRepo extends JpaRepository<MessageSent, Integer> {
	@Query(nativeQuery = true)
	List<MessageSentData> getAllMessageSents();
}
