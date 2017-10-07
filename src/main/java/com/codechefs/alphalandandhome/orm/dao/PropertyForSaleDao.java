package com.codechefs.alphalandandhome.orm.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.codechefs.alphalandandhome.orm.model.PropertyForSale;

public class PropertyForSaleDao extends BaseDao {
	public List<PropertyForSale> findAll() {
		EntityManager em = getEntityManager();
		return em.createQuery("Select p from PropertyForSale p", PropertyForSale.class).getResultList();
	}
	
	public void save(PropertyForSale p) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
	}
}
