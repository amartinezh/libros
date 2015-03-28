package com.ventura.libros.service.conpyg;

import java.util.List;
import java.util.Map;

import com.ventura.libros.domain.conpyg.conpyg;

public interface conpygService {

	public List<conpyg> getLibros(Map<String, String> condiciones, String cond);
	
}
