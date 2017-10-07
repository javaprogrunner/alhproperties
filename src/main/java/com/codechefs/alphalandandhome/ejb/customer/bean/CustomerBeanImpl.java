package com.codechefs.alphalandandhome.ejb.customer.bean;

import java.util.List;

import javax.ejb.Stateless;

import com.codechefs.alphalandandhome.orm.dao.CustomerDao;
import com.codechefs.alphalandandhome.orm.model.Customer;

@Stateless
public class CustomerBeanImpl implements CustomerBean {
	CustomerDao customerDao = new CustomerDao();
 
	@Override
	public List<Customer> getAll() {
		return customerDao.findAll();
	}

	@Override
	public Customer get(Long customerId) {
		return customerDao.find(customerId);
	}
	

}
