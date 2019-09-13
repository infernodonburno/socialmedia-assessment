package com.cooksys.socialmedia.SocialMediaAssessment.dto;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;



public class UserResponseDto {
	
	private String username;
	private ProfileDto profile;
	
	@CreationTimestamp
	private Timestamp joined;
	
	public UserResponseDto() {}

	public UserResponseDto(String username, ProfileDto profile, Timestamp joined) {
		super();
		this.username = username;
		this.profile = profile;
		this.joined = joined;
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public ProfileDto getProfile() {
		return profile;
	}

	public void setProfile(ProfileDto profile) {
		this.profile = profile;
	}

	public Timestamp getJoined() {
		return joined;
	}

	public void setJoined(Timestamp joined) {
		this.joined = joined;
	}	
}
