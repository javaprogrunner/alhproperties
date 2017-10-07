package com.codechefs.alphalandandhome.main;

import java.util.List;

import com.codechefs.alphalandandhome.orm.dao.CustomerDao;
import com.codechefs.alphalandandhome.orm.model.Customer;

public class ALHMain {
	public static void createCustomers() {
		CustomerDao customerDao = new CustomerDao();
		Customer c1 = new Customer("Nelsie", "Marabe", "nelsie@gmail.com", "222");
		customerDao.save(c1);

		List<Customer> customerList = customerDao.findAll();
		System.out.println(customerList.size());
	}
	
	public static void createProperty() {
		
	}

	public static void main(String args[]) {
		createCustomers();

	}
}
