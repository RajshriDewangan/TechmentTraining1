package com.techment.solution2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Client {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Authors author = new Authors();
		author.setId(121);
		author.setName("Chetan Bhagat");
		
		em.persist(author);
		
		Book book1 = new Book();
		book1.setIsbn(40563);
		book1.setTitle("7 Habbits of Highly successful people");
		book1.setPrice(330);
		book1.setAuthors(author);
		
		Book book2 = new Book();
		book2.setIsbn(56371);
		book2.setTitle("Three Mistakes of My Life");
		book2.setPrice(200);
		book2.setAuthors(author);
		
		em.persist(book1);
		em.persist(book2);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}