package com.codechefs.alphalandandhome.orm.dao;

import javax.persistence.EntityManager;

import com.codechefs.alphalandandhome.orm.model.PropertyInquiry;

public class PropertyInquiryDao extends BaseDao {

	public void save(PropertyInquiry inquiry) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.persist(inquiry);
		em.getTransaction().commit();
	}

}
