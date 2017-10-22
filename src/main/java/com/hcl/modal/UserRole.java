/**
 * 
 */
package com.hcl.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * This class represent a single role for user.
 * @author sanjeevkumar_r@hcl.com
 *
 */

@Entity
public class UserRole {

	@Id
	@GeneratedValue
	private int id;
	
	private String code;
	
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
}
