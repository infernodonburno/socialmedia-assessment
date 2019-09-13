package com.cooksys.socialmedia.SocialMediaAssessment.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.cooksys.socialmedia.SocialMediaAssessment.dto.TweetRequestDto;
import com.cooksys.socialmedia.SocialMediaAssessment.dto.TweetResponseDto;
import com.cooksys.socialmedia.SocialMediaAssessment.entity.Tweet;

@Mapper(componentModel = "spring")
public interface TweetMapper {
	
	//TODO Response returning null to user for author of tweet, figure out mapping 
	
	TweetRequestDto createEntityToRequestDto(Tweet tweet);
	Tweet createRequestDtoToEntity(TweetRequestDto dto);
	
	
	TweetResponseDto entityToResponseDto(Tweet tweet);
	Tweet responseDtoToEntity(TweetResponseDto dto);
	
	List<TweetResponseDto> entityToResponseDto(List<Tweet> tweets);
}
