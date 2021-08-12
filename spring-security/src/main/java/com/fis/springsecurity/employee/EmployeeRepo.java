package com.fis.springsecurity.employee;

import org.springframework.data.repository.CrudRepository;



public interface EmployeeRepo extends CrudRepository<Employee, Integer>  {

}
