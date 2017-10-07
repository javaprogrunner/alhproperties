package com.codechefs.alphalandandhome.ejb.property.bean;

import java.util.List;

import javax.ejb.Stateless;

import com.codechefs.alphalandandhome.orm.dao.PropertyForSaleDao;
import com.codechefs.alphalandandhome.orm.model.PropertyForSale;

/**
 * Session Bean implementation class PropertyBeanImpl
 */
@Stateless
public class PropertyForSaleBeanImpl implements PropertyForSaleBean {
	PropertyForSaleDao propertyDao = new PropertyForSaleDao();

	@Override
	public List<PropertyForSale> getAll() {
		return propertyDao.findAll();
	}

}
