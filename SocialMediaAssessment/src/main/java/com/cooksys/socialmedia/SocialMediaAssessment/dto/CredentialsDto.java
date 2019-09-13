package com.cooksys.socialmedia.SocialMediaAssessment.dto;

import com.cooksys.socialmedia.SocialMediaAssessment.entity.Credentials;

public class CredentialsDto {
	
	private Credentials credentials;
	
	public CredentialsDto() {}

	public CredentialsDto(Credentials credentials) {
		super();
		this.credentials = credentials;
	}

	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}
}
