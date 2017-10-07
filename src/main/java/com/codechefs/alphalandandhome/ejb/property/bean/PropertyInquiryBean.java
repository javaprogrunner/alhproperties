package com.codechefs.alphalandandhome.ejb.property.bean;

import javax.ejb.Remote;

import com.codechefs.alphalandandhome.orm.model.Customer;
import com.codechefs.alphalandandhome.orm.model.PropertyForRent;
import com.codechefs.alphalandandhome.orm.model.PropertyForSale;

@Remote
public interface PropertyInquiryBean {
	void inquirePropertyForRent(Customer customer, PropertyForRent property);
	
	void inquirePropertyForSale(Customer customer, PropertyForSale property);
}
