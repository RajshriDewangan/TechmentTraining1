package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ClientApp {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em =  emf.createEntityManager();

		em.getTransaction().begin();
		
		Author author = new Author();
		author.setAuthorId(1);
		author.setFirstName("raji");
		author.setMiddleName("xyz");
		author.setLastName("dewangan");
		author.setPhoneNo(98765432);
		
		em.persist(author);
		
		Query query1 = em.createQuery("Select a from Author a");  

		@SuppressWarnings("unchecked")  
		List<Author> list=(List<Author>)query1.getResultList( );  

		System.out.print("a_id");  
		System.out.print("\t a_name");  
		System.out.println("\t a_phoneNumber"); 
		
		Query query2 = em.createQuery("update Author SET middleName='kumari' where FirstName='rani'");  
        query2.executeUpdate();
        
        for( Author a:list ){  
			System.out.print(a.getAuthorId());  
			System.out.print("\t" +  a.getFirstName());  
			System.out.print("\t " + a.getMiddleName());
			System.out.print("\t "+a.getLastName());
			System.out.print("\t"+a.getPhoneNo());
			System.out.println();  

		}  

        
        Query query = em.createQuery("delete from Author where AuthorId=14");  
        query.executeUpdate();  
     
        
        

		for( Author a:list ){  
			System.out.print(a.getAuthorId());  
			System.out.print("\t" +  a.getFirstName());  
			System.out.print("\t " + a.getMiddleName());
			System.out.print("\t "+a.getLastName());
			System.out.print("\t"+a.getPhoneNo());
			System.out.println();  

		}  
		
		
		Author author2= em.find(Author.class, 7);
		    System.out.print("\t" +  author2.getAuthorId());  
		    System.out.print("\t" +  author2.getFirstName());  
			System.out.print("\t" +  author2.getFirstName());  
			System.out.print("\t " + author2.getMiddleName());
			System.out.print("\t "+author2.getLastName());
			System.out.print("\t"+author2.getPhoneNo());
		

		

		em.getTransaction().commit();
		em.close();  
		emf.close();    
	}			
}