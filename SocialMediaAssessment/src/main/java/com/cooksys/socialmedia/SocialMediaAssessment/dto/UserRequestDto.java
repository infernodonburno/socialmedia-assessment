package com.cooksys.socialmedia.SocialMediaAssessment.dto;

import com.cooksys.socialmedia.SocialMediaAssessment.entity.*;


public class UserRequestDto {
	
	private Credentials credentials;
	private Profile profile;
	
	public UserRequestDto() {}
	
	public UserRequestDto(Credentials credentials, Profile profile) {
		super();
		this.credentials = credentials;
		this.profile = profile;
	}

	public Credentials getCredentials() {
		return this.credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
}

	
