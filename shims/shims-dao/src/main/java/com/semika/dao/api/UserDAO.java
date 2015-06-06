/**
 * 
 */
package com.semika.dao.api;

import java.util.List;

import com.semika.dao.common.api.GenericDAO;
import com.semika.domain.User;

/**
 * @author root
 *
 */
public interface UserDAO extends GenericDAO<User, Long> { 

	public List<User> findByCriteria();
	
	public void saveOrUpdate(User user);
	
	public void removeUser(User user) ;
}
