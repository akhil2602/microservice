package com.daoImpl;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.controller.Company;
import com.dao.CompanyDao;

@Repository
public class CompanyDaoImpl implements CompanyDao {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Company> getAllCompany() {
		// TODO Auto-generated method stub
		Query query=(Query) manager.createNamedQuery("findAllCompany");
		List<Company> company=((javax.persistence.Query) query).getResultList();
		return company;
	}

	/*@Override
	public Company getCompanyById(int cid) {
		// TODO Auto-generated method stub
		Query query=manager.createNamedQuery("findCompanyById");
		query.setParameter("Id", cid);
		return (Company)query.getSingleResult();
	}

	@Transactional
	@Override
	public boolean storeCompanyData(Company company) {
		// TODO Auto-generated method stub
		manager.persist(company);		
		Company company_found=getCompanyById(company.getCid());
		if(company_found!=null){
		return true;}
		else{
			return false;
	}
	}

	@Override
	public boolean updateComapany(Company company) {
		// TODO Auto-generated method stub
		Company company_db=getCompanyById(company.getCid());
		manager.merge(company);
//		Company updated_db=getCompanyById(company_db.getCid());
//		if(company_db.equals)
		
		return true;
	}*/

}
