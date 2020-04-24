package com.ntt.data.dao;

import java.util.List;

import com.ntt.data.model.EmployeeVO;

public interface EmployeeDAO 
{
	public List<EmployeeVO> getAllEmployees();
}