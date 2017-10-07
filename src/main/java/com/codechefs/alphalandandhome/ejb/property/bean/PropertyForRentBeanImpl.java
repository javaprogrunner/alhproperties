package com.codechefs.alphalandandhome.ejb.property.bean;

import java.util.List;

import javax.ejb.Stateless;

import com.codechefs.alphalandandhome.orm.dao.PropertyForRentDao;
import com.codechefs.alphalandandhome.orm.model.PropertyForRent;

/**
 * Session Bean implementation class PropertyBeanImpl
 */
@Stateless
public class PropertyForRentBeanImpl implements PropertyForRentBean {
	PropertyForRentDao propertyDao = new PropertyForRentDao();

	@Override
	public List<PropertyForRent> getAll() {
		return propertyDao.findAll();
	}

}
