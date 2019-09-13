package com.cooksys.socialmedia.SocialMediaAssessment.dto;

public class TweetRequestDto {
	
	private String content;
	private CredentialsDto credentials;
	
	public TweetRequestDto() {}

	public TweetRequestDto(String content, CredentialsDto credentials) {
		super();
		this.content = content;
		this.credentials = credentials;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public CredentialsDto getCredentials() {
		return credentials;
	}

	public void setCredentials(CredentialsDto credentials) {
		this.credentials = credentials;
	}
	
	

}
