package com.codechefs.alphalandandhome.orm.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.codechefs.alphalandandhome.orm.model.PropertyForRent;

public class PropertyForRentDao extends BaseDao {
	public List<PropertyForRent> findAll() {
		EntityManager em = getEntityManager();
		return em.createQuery("Select p from PropertyForRent p", PropertyForRent.class).getResultList();
	}

	public void save(PropertyForRent p) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
	}
}
