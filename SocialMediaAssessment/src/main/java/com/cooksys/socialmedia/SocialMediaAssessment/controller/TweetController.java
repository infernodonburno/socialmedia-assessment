package com.cooksys.socialmedia.SocialMediaAssessment.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.socialmedia.SocialMediaAssessment.dto.CredentialsDto;
import com.cooksys.socialmedia.SocialMediaAssessment.dto.TweetRequestDto;
import com.cooksys.socialmedia.SocialMediaAssessment.dto.TweetResponseDto;
import com.cooksys.socialmedia.SocialMediaAssessment.dto.UserRequestDto;
import com.cooksys.socialmedia.SocialMediaAssessment.dto.UserResponseDto;
import com.cooksys.socialmedia.SocialMediaAssessment.service.TweetService;

@RestController
public class TweetController {
	
	private TweetService tweetService;

	public TweetController(TweetService tweetService) {
		super();
		this.tweetService = tweetService;
	}
	
	//Lemme see a tweet creation
	@PostMapping("tweets")
	public ResponseEntity<TweetResponseDto> saveTweet(@RequestBody TweetRequestDto tweetRequest) {
		return tweetService.saveTweet(tweetRequest);
	}
	
	//Get all them tweets mmmm
	@GetMapping("tweets")
	public List<TweetResponseDto> getAllTweets(){
		return this.tweetService.getAllTweets();
	}
	
	//Get by id
	@GetMapping("tweets/{id}")
	public TweetResponseDto getTweet(@PathVariable("id") Integer id) {
		return this.tweetService.getTweet(id);
	}
	
	@DeleteMapping("tweets/{id}")
	public TweetResponseDto deleteTweet(Integer id, CredentialsDto credentialsDto) {
		return this.tweetService.deleteTweet(id, credentialsDto);
	}

}
