package com.controller;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.CompanyService;



@RestController
@RequestMapping("company")
public class Controller {
	
	public Controller(){
		
		System.out.println("Controller constructer");
	}
	
	@Autowired
	private CompanyService companyService;
	
	@GetMapping("allcomapanies")
	public ResponseEntity<List<Company>> retrieveAllCompany(){
		List<Company> companyList=companyService.getAllCompany();
		ResponseEntity<List<Company>> response=new ResponseEntity<List<Company>>(companyList,HttpStatus.OK);
		return response;
	}

	
	
	
	
	
	
	
	
}
