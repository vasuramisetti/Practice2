package com.mkyong.customer.model;

import java.sql.Timestamp;

public class Customer 
{
	int custId;
	String name;
	int age;
	String phNumber;
	
	public Customer(int custId, String name, int age,String phNumber) {
		this.custId = custId;
		this.name = name;
		this.age = age;
		this.phNumber=phNumber;
	}
	
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	/**
	 * @return the phNumber
	 */
	public String getPhNumber() {
		return phNumber;
	}

	/**
	 * @param phNumber the phNumber to set
	 */
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", age=" + age + ", phNumber=" + phNumber + "]";
	}

	
	
	
	
}
