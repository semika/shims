/**
 * 
 */
package com.semika.web.actions;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.semika.domain.User;
import com.semika.service.api.UserService;

/**
 * @author semika
 *
 */
@Namespace("/")
@Results({
	  @Result(name="success", location="/jsp/login/login.jsp")
})
@Controller
public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private UserService userService; 
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String execute() {
		
		User user = userService.findById(1L);
		if (user == null) {
			
		}
	    return SUCCESS;
	}

}
