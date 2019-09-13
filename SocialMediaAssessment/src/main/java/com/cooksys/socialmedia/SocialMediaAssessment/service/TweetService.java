package com.cooksys.socialmedia.SocialMediaAssessment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cooksys.socialmedia.SocialMediaAssessment.dto.CredentialsDto;
import com.cooksys.socialmedia.SocialMediaAssessment.dto.TweetRequestDto;
import com.cooksys.socialmedia.SocialMediaAssessment.dto.TweetResponseDto;
import com.cooksys.socialmedia.SocialMediaAssessment.dto.UserResponseDto;
import com.cooksys.socialmedia.SocialMediaAssessment.entity.Tweet;
import com.cooksys.socialmedia.SocialMediaAssessment.entity.User;
import com.cooksys.socialmedia.SocialMediaAssessment.mapper.TweetMapper;
import com.cooksys.socialmedia.SocialMediaAssessment.repository.TweetRepository;
import com.cooksys.socialmedia.SocialMediaAssessment.repository.UserRepository;

@Service
public class TweetService {
	
	private TweetRepository tweetRepository;
	private TweetMapper tweetMapper;
	
	
	
	public TweetService(TweetRepository tweetRepository, TweetMapper tweetMapper) {
		super();
		this.tweetRepository = tweetRepository;
		this.tweetMapper = tweetMapper;
	}
	
	public ResponseEntity<TweetResponseDto> saveTweet(TweetRequestDto tweetRequestDto) {
		//User user = this.userRepository.userByCredentials(tweetRequestDto.getCredentials());
		Tweet tweetToMake = tweetMapper.createRequestDtoToEntity(tweetRequestDto);
		return new ResponseEntity<TweetResponseDto>(tweetMapper.entityToResponseDto(tweetRepository.saveAndFlush(tweetToMake)), HttpStatus.CREATED);
	}
	
	
	public List<TweetResponseDto> getAllTweets(){
		return this.tweetMapper.entityToResponseDto(this.tweetRepository.findAll());
	}
	
	public TweetResponseDto getTweet(Integer id) {
		return this.tweetMapper.entityToResponseDto(this.tweetRepository.findTweetById(id));
	}
	
	public TweetResponseDto deleteTweet(Integer id, CredentialsDto credentialsDto) {
		Tweet tweet = this.tweetRepository.findTweetById(id);
		if(tweet.getAuthor().getCredentials().equals(credentialsDto.getCredentials()))
		{
			this.tweetRepository.delete(tweet);
			return this.tweetMapper.entityToResponseDto(tweet);
		}
		
		return null;
	}

}
