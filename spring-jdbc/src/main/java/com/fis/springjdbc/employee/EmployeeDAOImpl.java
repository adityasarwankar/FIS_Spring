package com.fis.springjdbc.employee;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

public class EmployeeDAOImpl extends JdbcDaoSupport implements IEmployee {
	
	public List<Employee> getAllProducts() {
		String sql = "select * from employee";
		List<Employee> employee = getJdbcTemplate().query(sql, new EmployeeMapper());
		return employee;
	}

	public void insertProduct(Employee product) {

		String sql = "insert into employee values(?,?)";
		Object[] args = { product.getId(), product.getName() };
		int insertedRows = getJdbcTemplate().update(sql, args);
		System.out.println("Rows Inserted: " + insertedRows);

	}

	@Override
	public void deleteProduct(int id) {

		String sql = "delete from employee where id=?";
		Object[] args = { id };
		int deletedRows = getJdbcTemplate().update(sql, args);
		System.out.println("Rows Deleted: " + deletedRows);
	}

	@Override
	public void updateProduct(Employee product) {
		String sql = "update employee set name=? where id=?";
		Object[] args = { product.getName(), product.getId() };
		int updatedRows = getJdbcTemplate().update(sql, args);
		System.out.println("Rows Updated: " + updatedRows);

	}

	@Override
	public Employee getProductById(int id) {
		String sql = "select * from employee where id=?";
		Object[] args = { id };
		Employee productById = getJdbcTemplate().queryForObject(sql, args, new EmployeeMapper());
		return productById;
	}

}
