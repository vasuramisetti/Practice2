package com.mkyong.customer.dao;

import java.util.List;


import com.mkyong.customer.model.Customer;

public interface CustomerDAO 
{
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
	
	public List<Customer> getAll();
	
}




