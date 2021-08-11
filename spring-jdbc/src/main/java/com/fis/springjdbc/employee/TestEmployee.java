package com.fis.springjdbc.employee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
	

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("daoexample.xml");
		EmployeeDAOImpl bean = context.getBean("employeeDao", EmployeeDAOImpl.class);

		System.out.println("===============================");
		System.out.println("Insert a Product");
		Employee newProduct = new Employee();
		newProduct.setId(30);
		newProduct.setName("eraser");
		bean.insertProduct(newProduct);
		System.out.println("===============================");
		System.out.println("Delete Product");
		int id = 10;
		bean.deleteProduct(id);
		System.out.println("===============================");
		System.out.println("Get Product Based on Id");
		id = 20;
		Employee productById = bean.getProductById(id);
		System.out.println(productById);
		System.out.println("===============================");
		System.out.println("Update Product");
		newProduct = new Employee();
		newProduct.setId(30);
		newProduct.setName("browneraser");
		bean.updateProduct(newProduct);
		System.out.println("===============================");
		System.out.println("Get All Products");
		System.out.println(bean.getAllProducts());
		System.out.println("===============================");

		context.close();
	}
}
