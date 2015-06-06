/**
 * 
 */
package com.semika.dao.api;

import java.util.List;

import com.semika.dao.common.api.GenericDAO;
import com.semika.domain.Company;

/**
 * @author Semika Siriwardana
 *
 */
public interface CompanyDAO extends GenericDAO<Company, Long> { 
	
	public List<Company> findByCriteria();
	
	public void saveOrUpdate(Company company);
	
	public void removeCompany(Company company);
}
