/**
 * 
 */
package com.semika.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semika.dao.api.UserDAO;
import com.semika.domain.User;
import com.semika.dto.UserDTO;
import com.semika.service.api.UserService;

/**
 * @author root
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService { 
	
	@Autowired
	private UserDAO userDao;

	public User findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveUser(UserDTO dto) {
		// TODO Auto-generated method stub
		
	}

	public void removeUser(UserDTO dto) {
		// TODO Auto-generated method stub
		
	}

}
