package com.cooksys.socialmedia.SocialMediaAssessment.dto;

import com.cooksys.socialmedia.SocialMediaAssessment.entity.User;

public class TweetResponseDto {
	
	private Integer id;
	private User author;
	
	public TweetResponseDto() {}

	public TweetResponseDto(Integer id, User author) {
		super();
		this.id = id;
		this.author = author;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}
	
	

}
