package com.codechefs.alphalandandhome.ejb.customer.bean;

import java.util.List;

import javax.ejb.Remote;

import com.codechefs.alphalandandhome.orm.model.Customer;

@Remote
public interface CustomerBean {
	List<Customer> getAll();
	
	Customer get(Long customerId);
}
