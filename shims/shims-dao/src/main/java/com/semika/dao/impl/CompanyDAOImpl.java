/**
 * 
 */
package com.semika.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.semika.dao.api.CompanyDAO;
import com.semika.dao.common.impl.GenericHibernateDAO;
import com.semika.domain.Company;

/**
 * @author Semika Siriwardana
 *
 */
@Repository
public class CompanyDAOImpl extends GenericHibernateDAO<Company, Long> implements CompanyDAO {

	@Autowired
	public CompanyDAOImpl(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
	
	public List<Company> findByCriteria() {
		return null;
	}

	public void saveOrUpdate(Company company) {
		
	}

	public void removeCompany(Company company) {
		
	}

}
