package com.cooksys.socialmedia.SocialMediaAssessment.entity;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	
	
	
	@Embedded
	@AttributeOverrides({
		  @AttributeOverride( name = "username", column = @Column(unique = true, name = "username")),
		  @AttributeOverride( name = "password", column = @Column(name = "password"))})
	private Credentials credentials;
	
	
	
	@Embedded
	@AttributeOverrides({
		  @AttributeOverride( name = "firstName", column = @Column(name = "contact_first_name")),
		  @AttributeOverride( name = "lastName", column = @Column(name = "contact_last_name")),
		  @AttributeOverride( name = "email", column = @Column(name = "contact_email")),
		  @AttributeOverride( name = "phone", column = @Column(name = "contact_phone"))})
	private Profile profile;
	
	@CreationTimestamp
	private Timestamp joined;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<User> followings;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<User> followers;
	
	public Set<User> getFollowings() {
		return followings;
	}

	public void setFollowings(Set<User> followings) {
		this.followings = followings;
	}

	public Set<User> getFollowers() {
		return followers;
	}

	public void setFollowers(Set<User> followers) {
		this.followers = followers;
	}

	
	public User() {}
	 

	public User(Integer id, Profile profile, Timestamp joined, Credentials credentials, Set<User> followings, Set<User> followers) {
		super();
		this.id = id;
		this.credentials = credentials;
		this.profile = profile;
		this.joined = joined;
		this.followings = followings;
		this.followers = followers;	
	}
	
	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Timestamp getJoined() {
		return joined;
	}

	public void setJoined(Timestamp joined) {
		this.joined = joined;
	}
	
}
