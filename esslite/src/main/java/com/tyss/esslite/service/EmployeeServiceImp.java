package com.tyss.esslite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.esslite.dao.EmployeeDAO;
import com.tyss.esslite.dto.TechnologyDTO;


@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeDAO dao;
	
	@Override
	public TechnologyDTO fetchById(String employeeid) {
		// TODO Auto-generated method stub
		return dao.fetchById(employeeid);
	}

}
