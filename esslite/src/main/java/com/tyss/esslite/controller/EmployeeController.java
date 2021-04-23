package com.tyss.esslite.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.tyss.esslite.dto.EmployeeResponse;
import com.tyss.esslite.dto.TechnologyDTO;
import com.tyss.esslite.service.EmployeeService;


@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/getbyemployeeid")
	public ResponseEntity<EmployeeResponse> searchById(String employeeid) {
		
		TechnologyDTO dto = service.fetchById(employeeid);
		EmployeeResponse response= new EmployeeResponse();
		
		if(dto !=null) {
			response.setError(false);
			response.setMessage("Record fetch successfully");
			response.setData(Arrays.asList(dto));
			return new ResponseEntity<EmployeeResponse>(response,HttpStatus.OK);
		} else {
			response.setError(true);
			response.setMessage("Record cannot be found ");
			response.setData(null);
			return new ResponseEntity<EmployeeResponse>(response,HttpStatus.BAD_REQUEST);
		}
	}

	
}
