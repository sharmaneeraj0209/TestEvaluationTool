package com.hcl.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.modal.User;

/**
 * @author sanjeevkumar_r@hcl.com
 *
 */
public interface UserDao extends JpaRepository<User, Long>{
	
}
