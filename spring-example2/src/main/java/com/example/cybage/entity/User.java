package com.example.cybage.entity;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String username;
	private String email;
	private String password;
	private boolean locked;
	private boolean activated;
	private String role;
	@OneToOne(fetch = FetchType.LAZY ,
	    	
	    		cascade = CascadeType.ALL,
	    		mappedBy = "user"
	    		)
	private Profile profile;
	
	@OneToMany(targetEntity = Like.class,cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="userId", referencedColumnName = "userId")
    List<Like> likes;
	
//	@OneToMany(targetEntity = Feedback.class,cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name="userId", referencedColumnName = "userId")
//    List<Feedback> feedbacks;


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	public User() {
		super();
	}
	public User(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}
	public User(String username, String email, String password, boolean locked, boolean activated,String role) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.locked = true;
		this.activated = true;
		this.role="user";
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
}
