package com.cooksys.socialmedia.SocialMediaAssessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cooksys.socialmedia.SocialMediaAssessment.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	
	User findUserByCredentialsUsername(String username);
}
