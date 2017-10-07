package com.codechefs.alphalandandhome.ejb.property.bean;

import java.util.List;

import javax.ejb.Remote;

import com.codechefs.alphalandandhome.orm.model.PropertyForRent;
import com.codechefs.alphalandandhome.orm.model.PropertyForSale;

@Remote
public interface PropertyForRentBean {
	List<PropertyForRent> getAll();
}
