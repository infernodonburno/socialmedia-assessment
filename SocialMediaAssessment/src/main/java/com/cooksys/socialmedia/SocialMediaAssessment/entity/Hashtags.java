package com.cooksys.socialmedia.SocialMediaAssessment.entity;

import java.sql.Timestamp;

import javax.persistence.Embeddable;

@Embeddable
public class Hashtags {
	
	private String label;
	private Timestamp firstUsed;
	private Timestamp lastUsed;
	
	public Hashtags() {}

	public Hashtags(String label, Timestamp firstUsed, Timestamp lastUsed) {
		super();
		this.label = label;
		this.firstUsed = new Timestamp(System.currentTimeMillis());
		this.lastUsed = new Timestamp(System.currentTimeMillis());
	}
	

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Timestamp getFirstUsed() {
		return firstUsed;
	}

	public void setFirstUsed(Timestamp firstUsed) {
		this.firstUsed = firstUsed;
	}

	public Timestamp getLastUsed() {
		return lastUsed;
	}

	public void setLastUsed(Timestamp lastUsed) {
		this.lastUsed = lastUsed;
	}	
}
