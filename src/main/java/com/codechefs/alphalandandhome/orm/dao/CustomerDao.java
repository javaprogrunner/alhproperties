package com.codechefs.alphalandandhome.orm.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.codechefs.alphalandandhome.orm.model.Customer;

public class CustomerDao extends BaseDao{

	public Customer find(Long customerId) {
		EntityManager em = getEntityManager();
		return em.find(Customer.class, customerId);
	}

	public List<Customer> findAll() {
		EntityManager em = getEntityManager();
		return em.createQuery("Select c from Customer c", Customer.class).getResultList();
	}

	public void save(Customer customer) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.persist(customer);
		em.getTransaction().commit();
	}

}
