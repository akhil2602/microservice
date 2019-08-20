package com.client;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Company")

@NamedQueries(
		{
		@NamedQuery(name="findAllCompany",query="from Company C"),
		
		//@NamedQuery(name="findCompanyById",query="from Company C where C.cid=:Id")
		}
		
		)

public class Company {
	
	@Column(name="cname")
	private String Company_Name;
	
	@Column(name="turnover")
	private int Turnover;
	
	@Column(name="ceo")
	private String CEO;
	
	@Column(name="bod")
	private String BOD;
	
	@Column(name="exchange")
	private String LExchanges;
	
	@Column(name="sector")
	private String Sector;
	
	@Column(name="writeup")
	private String Brief_writeup;

	public String getCompany_Name() {
		return Company_Name;
	}

	public void setCompany_Name(String company_Name) {
		Company_Name = company_Name;
	}

	public int getTurnover() {
		return Turnover;
	}

	public void setTurnover(int turnover) {
		Turnover = turnover;
	}

	public String getCEO() {
		return CEO;
	}

	public void setCEO(String cEO) {
		CEO = cEO;
	}

	public String getBOD() {
		return BOD;
	}

	public void setBOD(String bOD) {
		BOD = bOD;
	}

	public String getLExchanges() {
		return LExchanges;
	}

	public void setLExchanges(String lExchanges) {
		LExchanges = lExchanges;
	}

	public String getSector() {
		return Sector;
	}

	public void setSector(String sector) {
		Sector = sector;
	}

	public String getBrief_writeup() {
		return Brief_writeup;
	}

	public void setBrief_writeup(String brief_writeup) {
		Brief_writeup = brief_writeup;
	}
	
	
	
	
}