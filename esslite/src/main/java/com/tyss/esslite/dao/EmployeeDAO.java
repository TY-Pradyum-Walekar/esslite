package com.tyss.esslite.dao;

import com.tyss.esslite.dto.TechnologyDTO;

public interface EmployeeDAO {
	public TechnologyDTO fetchById(String employeeid);
	
}
