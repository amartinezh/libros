package com.ventura.libros.service.adm.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventura.libros.domain.adm.Company;
import com.ventura.libros.service.adm.CompanyService;
import com.ventura.libros.repository.adm.CompanyDao;

@Service
public class CompanyServiceImpl implements CompanyService{

	
	@Autowired
	private CompanyDao companyDao;
	
	
	public List<Company> listCompany() {		
		return companyDao.listCompany();
	}

}
