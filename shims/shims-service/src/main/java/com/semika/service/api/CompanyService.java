/**
 * 
 */
package com.semika.service.api;

import java.util.List;

import com.semika.domain.Company;
import com.semika.dto.CompanyDTO;

/**
 * @author Semika Siriwardana
 *
 */
public interface CompanyService {

	public Company findById(Long id);
	
	public List<Company> findAllCompanies();
	
	public void saveCompany(CompanyDTO dto);
	
	public void deleteCompany(CompanyDTO dto);
	
}
