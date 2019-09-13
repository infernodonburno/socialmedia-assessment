package com.cooksys.socialmedia.SocialMediaAssessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cooksys.socialmedia.SocialMediaAssessment.entity.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Integer> {
	
	Tweet findTweetById(Integer id);

}
