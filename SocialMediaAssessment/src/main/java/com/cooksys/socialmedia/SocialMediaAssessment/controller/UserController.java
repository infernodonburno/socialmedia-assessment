package com.cooksys.socialmedia.SocialMediaAssessment.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.socialmedia.SocialMediaAssessment.dto.*;
import com.cooksys.socialmedia.SocialMediaAssessment.entity.User;
import com.cooksys.socialmedia.SocialMediaAssessment.mapper.UserMapper;
import com.cooksys.socialmedia.SocialMediaAssessment.repository.UserRepository;
import com.cooksys.socialmedia.SocialMediaAssessment.service.UserService;

@RestController
public class UserController {
	
	private UserService userService;
	private UserRepository userRepository;
	private UserMapper userMapper;
	
	
	
	public UserController(UserService userService, UserRepository userRepository, UserMapper userMapper) {
		super();
		this.userService = userService;
		this.userRepository = userRepository;
		this.userMapper = userMapper;
	}
	
	//CREATE
	@PostMapping("user")
	public ResponseEntity<UserResponseDto> createUser(@RequestBody UserRequestDto userCreateDto) {
		return userService.createDto(userCreateDto);
	}
	
	//Get all the users
	@GetMapping("users")
	public List<UserResponseDto> getAllUsers(){
		return this.userService.getAllUsers();
	}
	
	//UPDATE
	@PatchMapping("user/@{username}")
	public UserResponseDto updateUser(@PathVariable("username") String username, @RequestBody UserRequestDto user) {
		return this.userService.updateUser(username, user);
	}
	
	//Delete 
	public UserResponseDto deleteUser(String username, CredentialsDto credentialsDto) {
		User user = this.userRepository.findUserByCredentialsUsername(username);
		
		if(user.getCredentials().equals(credentialsDto.getCredentials()))
		{
			this.userRepository.delete(user);
			return this.userMapper.entityToDto(user);
		}
		
		return null;
	}	
}
