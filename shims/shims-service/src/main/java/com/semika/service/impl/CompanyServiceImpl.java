/**
 * 
 */
package com.semika.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semika.dao.api.CompanyDAO;
import com.semika.domain.Company;
import com.semika.dto.CompanyDTO;
import com.semika.service.api.CompanyService;

/**
 * @author Semika Siriwardana
 *
 */
@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDAO companyDao;

	public Company findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Company> findAllCompanies() {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveCompany(CompanyDTO dto) {
		// TODO Auto-generated method stub
		
	}

	public void deleteCompany(CompanyDTO dto) {
		// TODO Auto-generated method stub
		
	}

}
