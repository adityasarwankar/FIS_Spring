package com.fis.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

	private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);
	String name;
	String code;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	@Override
	public String toString() {
		return "Country [getName()=" + getName() + ", getCode()=" + getCode() + "]";
	}
			
	public Country() {
		LOGGER.debug("Inside Country Constructor");
	}
	
	public static void main(String[] args) {
	}

}
