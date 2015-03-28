package com.ventura.libros.service.conpyg.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventura.libros.domain.conpyg.conpyg;
import com.ventura.libros.repository.conpyg.conpygDao;
import com.ventura.libros.service.conpyg.conpygService;

@Service
public class conpygServiceImpl implements conpygService{

	@Autowired
	private conpygDao conpygDao;
	
	public List<conpyg> getLibros(Map<String, String> condiciones, String cond) {
		return conpygDao.getLibros();
	}
}
