/**
 * 
 */
package com.hcl.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This is a user controller and responsible to handle all user related requests
 * @author sanjeevkumar_r@hcl.com
 *
 */

@Controller
public class UserController {

	@RequestMapping("/")
	public String getUsers(Model model){
		
		return "Users";
	}
	
	
}
