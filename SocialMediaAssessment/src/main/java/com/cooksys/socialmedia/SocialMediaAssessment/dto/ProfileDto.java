package com.cooksys.socialmedia.SocialMediaAssessment.dto;

import com.cooksys.socialmedia.SocialMediaAssessment.entity.Profile;


public class ProfileDto {
	
	private Profile profile;
	
	public ProfileDto() {}

	public ProfileDto(Profile profile) {
		super();
		this.profile = profile;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
}
