package com.codechefs.alphalandandhome.orm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BaseDao {
	private EntityManager em;

	public EntityManager getEntityManager() {
		if (this.em == null) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("codechefs_PU");
			this.em = emf.createEntityManager();
		}
		return this.em;
	}
}
