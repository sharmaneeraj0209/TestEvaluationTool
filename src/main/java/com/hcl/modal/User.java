package com.hcl.modal;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * This will represent a user with some role based access.
 * @author sanjeevkumar_r@hcl.com
 *
 */
@Entity
public class User {

	@Id
	@GeneratedValue
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String email; 
	
	private Set<UserRole> roles;
	
	private boolean enable;
	
	private boolean deleted;
	
	@DateTimeFormat(pattern="dd-MMM-yyy")
	private Date createdOn;
	
	@DateTimeFormat(pattern="dd-MMM-yyy")
	private Date updatedOn;
	
	public User(){}

	public User(String firstName, String lastName, String email, Set<UserRole> roles, boolean enable, boolean deleted,
			Date createdOn, Date updatedOn) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.roles = roles;
		this.enable = enable;
		this.deleted = deleted;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}

	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<UserRole> getRoles() {
		return roles;
	}

	public void setRoles(Set<UserRole> roles) {
		this.roles = roles;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	
	
		
}
