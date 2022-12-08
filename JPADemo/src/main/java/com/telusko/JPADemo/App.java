package com.telusko.JPADemo;

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
 /*   	Alien a = new Alien();
    	a.setAid(5);
    	a.setAname("Pranav");
    	a.setTech("Oracle");
    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class);
    	ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
    	SessionFactory sf = config.buildSessionFactory(registry);
    	Session session = sf.openSession();
    	
    	session.beginTransaction();    	
    	session.save(a);
    	session.getTransaction().commit();		*/
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");
    	EntityManager em = emf.createEntityManager();
    	
    	Alien a = em.find(Alien.class, 4);
    	
    	
        System.out.println(a);
    }
}
