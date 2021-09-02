package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneClientDemo {

	public static void main(String[] args) {

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Book_issued");
		EntityManager em =  emf.createEntityManager();

		em.getTransaction().begin();
		
		Address address = new Address();
		address.setDoorNo(1001);
		address.setStreetName("cross street");
		address.setCity("bhilai");
	
		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("Raji");
		employee.setDesignation("developer");
		employee.setAddress(address);
	
		em.persist(address);
		em.persist(employee);
		
		em.getTransaction().commit();
		
        em.close();  
        emf.close();  

	}

}
