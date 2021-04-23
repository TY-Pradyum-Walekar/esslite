package com.tyss.esslite.dto;

import java.util.List;



public class EmployeeResponse {
	private boolean error;
	private String message;	
	private List data;
	
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<TechnologyDTO> getList() {
		return data;
	}
	public void setData(List<TechnologyDTO> data) {
		this.data = data;
	}
	
	
	
}
