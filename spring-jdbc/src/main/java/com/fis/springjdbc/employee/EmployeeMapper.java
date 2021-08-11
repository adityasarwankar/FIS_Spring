package com.fis.springjdbc.employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee product = new Employee();
		product.setId(rs.getInt("id"));
		product.setName(rs.getString("name"));
		return product;
	}
}
