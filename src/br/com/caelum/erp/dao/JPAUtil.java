package br.com.caelum.erp.dao;

import javax.persistence.EntityManager;

public class JPAUtil {

	EntityManager em;
	
	EntityManager getEntityManager(){
		return em;
	}
	
	
}
