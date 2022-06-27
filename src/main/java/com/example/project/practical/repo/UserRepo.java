package com.example.project.practical.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.project.practical.model.User;



/**
 *
 * @author Thanhtm
 */
@Repository
public interface UserRepo  extends JpaRepository<User, Integer>{

    public User findByUsername(String username);
    @Query("select a from User a")
    List<User> users();

    @Query(value = "select * from taikhoan a", nativeQuery = true)
    List<User> users2();


}
