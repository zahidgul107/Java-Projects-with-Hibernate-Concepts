package com.telusko.HiboMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Laptop lap = new Laptop();
    	lap.setLid(101);
    	lap.setLname("Lenovo");
    	
    	
    	Student s = new Student();
    	s.setName("Xahid");
    	s.setRollno(1);
    	s.setMarks(50);
    	s.getLaptop().add(lap);
    	
    	lap.getStudent().add(s);
    
    	
//    	Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
//    	ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
//    	SessionFactory sf = Configuration.buildSessionFactory(registry);
//    	Session session = sf.openSession();
//    	
//    	session.beginTransaction();
//    	
//    	session.save(s);
//    	session.save(lap);
//    	
//    	session.getTransaction().commit();
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);       
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();       
        SessionFactory sf = con.buildSessionFactory(reg);       
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(s);
        session.save(lap);
        
        tx.commit();
       
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	System.out.println( "Hello World!" );
    }
}
