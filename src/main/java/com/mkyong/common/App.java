package com.mkyong.common;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.customer.dao.CustomerDAO;
import com.mkyong.customer.model.Customer;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
    	   CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
           Customer customer = new Customer(6, "Sai",28, "9542123689");
           customerDAO.insert(customer);
       	
           Customer customer1 = customerDAO.findByCustomerId(5);
           System.out.println(customer1);
        
        List<Customer> cuList = customerDAO.getAll();
		System.out.println(cuList);
        
    }
}
