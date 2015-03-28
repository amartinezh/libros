package com.ventura.libros.domain.conpyg;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "conpyg", schema = "libros")
public class conpyg implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@NotEmpty
	@Column(name = "cline")
	private String cline;

	@Column(name = "cdesc")
	String cdesc;

	@Column(name = "cldgr")
	String cldgr;

	@Column(name = "cbook")
	String cbook;

	@Column(name = "cyear")
	String cyear;

	@Column(name = "cpers")
	String cpers;

	@Column(name = "cvalm")
	String cvalm;

	@Column(name = "cvalp")
	String cvalp;

	@Column(name = "cvar1")
	String cvar1;

	@Column(name = "cvalmya")
	String cvalmya;

	@Column(name = "cvar2")
	String cvar2;

	@Column(name = "cvalma")
	String cvalma;

	@Column(name = "cvar3")
	String cvar3;

	public conpyg() {
		// TODO Auto-generated constructor stub
	}
	
	public conpyg(String cline, String cdesc, String cldgr, String cbook,
			String cyear, String cpers, String cvalm, String cvalp,
			String cvar1, String cvalmya, String cvar2, String cvalma,
			String cvar3) {
		super();
		this.cline = cline;
		this.cdesc = cdesc;
		this.cldgr = cldgr;
		this.cbook = cbook;
		this.cyear = cyear;
		this.cpers = cpers;
		this.cvalm = cvalm;
		this.cvalp = cvalp;
		this.cvar1 = cvar1;
		this.cvalmya = cvalmya;
		this.cvar2 = cvar2;
		this.cvalma = cvalma;
		this.cvar3 = cvar3;
	}

	@Override
	public String toString() {
		return "conpyg [cline=" + cline + ", cdesc=" + cdesc + ", cldgr="
				+ cldgr + ", cbook=" + cbook + ", cyear=" + cyear + ", cpers="
				+ cpers + ", cvalm=" + cvalm + ", cvalp=" + cvalp + ", cvar1="
				+ cvar1 + ", cvalmya=" + cvalmya + ", cvar2=" + cvar2
				+ ", cvalma=" + cvalma + ", cvar3=" + cvar3 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cbook == null) ? 0 : cbook.hashCode());
		result = prime * result + ((cdesc == null) ? 0 : cdesc.hashCode());
		result = prime * result + ((cldgr == null) ? 0 : cldgr.hashCode());
		result = prime * result + ((cline == null) ? 0 : cline.hashCode());
		result = prime * result + ((cpers == null) ? 0 : cpers.hashCode());
		result = prime * result + ((cvalm == null) ? 0 : cvalm.hashCode());
		result = prime * result + ((cvalma == null) ? 0 : cvalma.hashCode());
		result = prime * result + ((cvalmya == null) ? 0 : cvalmya.hashCode());
		result = prime * result + ((cvalp == null) ? 0 : cvalp.hashCode());
		result = prime * result + ((cvar1 == null) ? 0 : cvar1.hashCode());
		result = prime * result + ((cvar2 == null) ? 0 : cvar2.hashCode());
		result = prime * result + ((cvar3 == null) ? 0 : cvar3.hashCode());
		result = prime * result + ((cyear == null) ? 0 : cyear.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		conpyg other = (conpyg) obj;
		if (cbook == null) {
			if (other.cbook != null)
				return false;
		} else if (!cbook.equals(other.cbook))
			return false;
		if (cdesc == null) {
			if (other.cdesc != null)
				return false;
		} else if (!cdesc.equals(other.cdesc))
			return false;
		if (cldgr == null) {
			if (other.cldgr != null)
				return false;
		} else if (!cldgr.equals(other.cldgr))
			return false;
		if (cline == null) {
			if (other.cline != null)
				return false;
		} else if (!cline.equals(other.cline))
			return false;
		if (cpers == null) {
			if (other.cpers != null)
				return false;
		} else if (!cpers.equals(other.cpers))
			return false;
		if (cvalm == null) {
			if (other.cvalm != null)
				return false;
		} else if (!cvalm.equals(other.cvalm))
			return false;
		if (cvalma == null) {
			if (other.cvalma != null)
				return false;
		} else if (!cvalma.equals(other.cvalma))
			return false;
		if (cvalmya == null) {
			if (other.cvalmya != null)
				return false;
		} else if (!cvalmya.equals(other.cvalmya))
			return false;
		if (cvalp == null) {
			if (other.cvalp != null)
				return false;
		} else if (!cvalp.equals(other.cvalp))
			return false;
		if (cvar1 == null) {
			if (other.cvar1 != null)
				return false;
		} else if (!cvar1.equals(other.cvar1))
			return false;
		if (cvar2 == null) {
			if (other.cvar2 != null)
				return false;
		} else if (!cvar2.equals(other.cvar2))
			return false;
		if (cvar3 == null) {
			if (other.cvar3 != null)
				return false;
		} else if (!cvar3.equals(other.cvar3))
			return false;
		if (cyear == null) {
			if (other.cyear != null)
				return false;
		} else if (!cyear.equals(other.cyear))
			return false;
		return true;
	}

	public String getCline() {
		return cline;
	}

	public void setCline(String cline) {
		this.cline = cline;
	}

	public String getCdesc() {
		return cdesc;
	}

	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}

	public String getCldgr() {
		return cldgr;
	}

	public void setCldgr(String cldgr) {
		this.cldgr = cldgr;
	}

	public String getCbook() {
		return cbook;
	}

	public void setCbook(String cbook) {
		this.cbook = cbook;
	}

	public String getCyear() {
		return cyear;
	}

	public void setCyear(String cyear) {
		this.cyear = cyear;
	}

	public String getCpers() {
		return cpers;
	}

	public void setCpers(String cpers) {
		this.cpers = cpers;
	}

	public String getCvalm() {
		return cvalm;
	}

	public void setCvalm(String cvalm) {
		this.cvalm = cvalm;
	}

	public String getCvalp() {
		return cvalp;
	}

	public void setCvalp(String cvalp) {
		this.cvalp = cvalp;
	}

	public String getCvar1() {
		return cvar1;
	}

	public void setCvar1(String cvar1) {
		this.cvar1 = cvar1;
	}

	public String getCvalmya() {
		return cvalmya;
	}

	public void setCvalmya(String cvalmya) {
		this.cvalmya = cvalmya;
	}

	public String getCvar2() {
		return cvar2;
	}

	public void setCvar2(String cvar2) {
		this.cvar2 = cvar2;
	}

	public String getCvalma() {
		return cvalma;
	}

	public void setCvalma(String cvalma) {
		this.cvalma = cvalma;
	}

	public String getCvar3() {
		return cvar3;
	}

	public void setCvar3(String cvar3) {
		this.cvar3 = cvar3;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
