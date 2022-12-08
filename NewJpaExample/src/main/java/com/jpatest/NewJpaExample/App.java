package com.jpatest.NewJpaExample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	Alien a = new Alien();
    	a.setAid(6);
    	a.setAname("riyaz");
    	a.setTech("front end");
 	
    	
        System.out.println( "Hello World!" );
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project");
    	EntityManager em = emf.createEntityManager();
    	
    	em.getTransaction().begin();
    	
    	em.persist(a);
    	
    	em.getTransaction().commit();
    	
   // 	Alien a = em.find(Alien.class, 4);
    	
   //     System.out.println(a);
    	
    	
    }
}
