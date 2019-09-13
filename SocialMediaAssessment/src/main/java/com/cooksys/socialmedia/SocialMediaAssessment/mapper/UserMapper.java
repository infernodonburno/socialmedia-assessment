package com.cooksys.socialmedia.SocialMediaAssessment.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.cooksys.socialmedia.SocialMediaAssessment.dto.UserRequestDto;
import com.cooksys.socialmedia.SocialMediaAssessment.dto.UserResponseDto;
import com.cooksys.socialmedia.SocialMediaAssessment.entity.User;



@Mapper(componentModel = "spring")
public interface UserMapper {
	
	
	
	User createUserDtoToEntity(UserRequestDto userCreateDto);
	
	//Idk how this worked, but dont move it
	@Mapping(target = "username", source = "credentials.username")
	UserResponseDto entityToDto(User user);
	
	
	UserRequestDto entityToRequestDto(User user);
	User responseDtoToEntity(UserResponseDto responseDto);
	
	List<UserResponseDto> entitiesToResponseDtos(List<User> users);
}
