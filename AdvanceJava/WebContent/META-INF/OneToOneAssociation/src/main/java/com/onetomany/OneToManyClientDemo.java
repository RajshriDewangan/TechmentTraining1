package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyClientDemo {

	public static void main(String[] args) {

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("conn");
		EntityManager em =  emf.createEntityManager();

		em.getTransaction().begin();
		
		Course java = new Course(90, "java", 4);
		Course python = new Course(91 , "python", 3);
		Course bigdatab = new Course(92 , "bigData", 4);

		List<Course> course = new ArrayList<Course>();
			
		course.add(java);
		course.add(python);
		course.add(bigdatab);
		
		em.persist(java);
		em.persist(python);
		em.persist(bigdatab);

		Student sachin = new Student();
		sachin.setId(1);
		sachin.setName("sachin");
		sachin.setCourse(course);
		
		em.persist(sachin);

		em.getTransaction().commit();
	}

}
