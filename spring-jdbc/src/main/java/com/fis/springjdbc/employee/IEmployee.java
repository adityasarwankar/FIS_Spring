package com.fis.springjdbc.employee;

import java.util.List;

public interface IEmployee {
	
	public void insertProduct(Employee product);

	public List<Employee> getAllProducts();

	public void updateProduct(Employee product);

	public void deleteProduct(int id);

	public Employee getProductById(int id);
	
}
