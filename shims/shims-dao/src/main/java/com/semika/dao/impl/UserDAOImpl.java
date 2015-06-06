/**
 * 
 */
package com.semika.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.semika.dao.api.UserDAO;
import com.semika.dao.common.impl.GenericHibernateDAO;
import com.semika.domain.User;

/**
 * @author root
 *
 */
@Repository
public class UserDAOImpl extends GenericHibernateDAO<User, Long> implements UserDAO {

	@Autowired
	public UserDAOImpl(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
	
	public List<User> findByCriteria() {
		return null;
	}

	public void saveOrUpdate(User user) {
		
	}

	public void removeUser(User user) {
		
	}
	
}
