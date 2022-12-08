package com.jpaprojects.JPAProjects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	
    	Alien a = em.find(Alien.class, 4);
    	
        System.out.println( "Hello World!" );
    }
}
