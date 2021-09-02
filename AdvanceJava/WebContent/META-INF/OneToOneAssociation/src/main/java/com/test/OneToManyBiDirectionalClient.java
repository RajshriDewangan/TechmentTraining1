package com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyBiDirectionalClient {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("conn");
		EntityManager em =  emf.createEntityManager();

		em.getTransaction().begin();

		Library library = new Library();
		library.setName("abc lib");
		
		em.persist(library);
		
		Book bk1 = new Book();
		bk1.setBookName("java");
		bk1.setAuthor("bala");
		bk1.setLibrary(library);
		em.persist(bk1);
		
		System.out.println("-----inserted----");
	
		em.getTransaction().commit();
	}
	

}
