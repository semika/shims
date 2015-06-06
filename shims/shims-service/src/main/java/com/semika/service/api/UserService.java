/**
 * 
 */
package com.semika.service.api;

import java.util.List;

import com.semika.domain.User;
import com.semika.dto.UserDTO;

/**
 * @author root
 *
 */
public interface UserService {

	public User findById(Long id);
	
	public List<User> findAllUsers();
	
	public void saveUser(UserDTO dto);
	
	public void removeUser(UserDTO dto);
}
