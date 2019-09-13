package com.cooksys.socialmedia.SocialMediaAssessment.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cooksys.socialmedia.SocialMediaAssessment.dto.UserRequestDto;
import com.cooksys.socialmedia.SocialMediaAssessment.dto.UserResponseDto;
import com.cooksys.socialmedia.SocialMediaAssessment.entity.User;
import com.cooksys.socialmedia.SocialMediaAssessment.mapper.UserMapper;
import com.cooksys.socialmedia.SocialMediaAssessment.repository.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepository;
	private UserMapper userMapper;
	
	
	
	public UserService(UserRepository userRepository, UserMapper userMapper) {
		super();
		this.userRepository = userRepository;
		this.userMapper = userMapper;
	}
	
	//CREATE
	public ResponseEntity<UserResponseDto> createDto(UserRequestDto userCreateDto){
		User userToCreate = userMapper.createUserDtoToEntity(userCreateDto);
		return new ResponseEntity<UserResponseDto>(userMapper.entityToDto(userRepository.saveAndFlush(userToCreate)), HttpStatus.CREATED);
	
	}
	
	//READ ALL
	public List<UserResponseDto> getAllUsers(){
		return this.userMapper.entitiesToResponseDtos(this.userRepository.findAll());
	}
	
	//Edit 
	public UserResponseDto updateUser(String username, UserRequestDto userRequestDto) {
		User user = this.userRepository.findUserByCredentialsUsername(username);
			if(user.getCredentials().equals(userRequestDto.getCredentials()))
			{
				user.setProfile(userRequestDto.getProfile());
			}
			
			return this.userMapper.entityToDto(this.userRepository.save(user));
	}
	
	//Do some followers and following stuff (ran out of time)

}
