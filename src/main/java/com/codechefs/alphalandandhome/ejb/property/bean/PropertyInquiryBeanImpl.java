package com.codechefs.alphalandandhome.ejb.property.bean;

import java.util.Date;

import javax.ejb.Stateless;

import com.codechefs.alphalandandhome.orm.dao.PropertyInquiryDao;
import com.codechefs.alphalandandhome.orm.model.Customer;
import com.codechefs.alphalandandhome.orm.model.PropertyForRent;
import com.codechefs.alphalandandhome.orm.model.PropertyForSale;
import com.codechefs.alphalandandhome.orm.model.PropertyInquiry;

@Stateless
public class PropertyInquiryBeanImpl implements PropertyInquiryBean {
	PropertyInquiryDao propertyInquiryDao = new PropertyInquiryDao();

	@Override
	public void inquirePropertyForRent(Customer customer, PropertyForRent property) {
		PropertyInquiry inquiry = new PropertyInquiry(new Date(), property.getPropertyID(), customer.getCustomerID());
		propertyInquiryDao.save(inquiry);
	}

	@Override
	public void inquirePropertyForSale(Customer customer, PropertyForSale property) {
		PropertyInquiry inquiry = new PropertyInquiry(new Date(), property.getPropertyID(), customer.getCustomerID());
		propertyInquiryDao.save(inquiry);
	}

}
