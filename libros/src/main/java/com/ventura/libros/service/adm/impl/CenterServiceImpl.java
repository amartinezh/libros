package com.ventura.libros.service.adm.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventura.libros.domain.adm.Center;
import com.ventura.libros.repository.adm.CenterDao;
import com.ventura.libros.service.adm.CenterService;

@Service
public class CenterServiceImpl implements CenterService {

	@Autowired
	private CenterDao centerDao;
	
	public List<Center> listCenter() {
		return centerDao.listCenter();
	}
	
}
