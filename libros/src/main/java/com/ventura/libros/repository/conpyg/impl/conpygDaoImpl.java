package com.ventura.libros.repository.conpyg.impl;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.ventura.libros.domain.conpyg.conpyg;
import com.ventura.libros.repository.conpyg.conpygDao;

@Repository
public class conpygDaoImpl implements conpygDao {

	@PersistenceContext
	private EntityManager em = null;

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@SuppressWarnings("unchecked")
	public List<conpyg> getLibros() {
		List<Object[]> result = em
				.createQuery(
						"SELECT cline, cdesc, cldgr, cbook, cyear, cpers, cvalm, cvalp, cvar1, cvalmya, cvar2, cvalma, cvar3 FROM conpyg order by cline").getResultList();
		List<conpyg> conpyg = new LinkedList<conpyg>();
		for (Object[] obj : result) {
			conpyg.add(new conpyg((String) obj[0], (String) obj[1], (String) obj[2], (String) obj[3], (String) obj[4], (String) obj[5], (String) obj[6], (String) obj[7], (String) obj[8], (String) obj[9], (String) obj[10], (String) obj[11], (String) obj[12]));
		}
		return conpyg;
	}

}
