package com.telusko.DemoHib;

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
    	
    	AlienName an = new AlienName();
    	an.setFname("Zahid");
    	an.setMname("Ahmad");
    	an.setLname("Bhat");
    	
       Alien telusko = new Alien();
       telusko.setAid(101);
       telusko.setAname(an);
       telusko.setColor("White");
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
       ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();       
       SessionFactory sf = con.buildSessionFactory(reg);      
       Session session = sf.openSession();
       
       Transaction tx = session.beginTransaction();
       
       session.save(telusko);
       
     //  telusko = (Alien) session.get(Alien.class, 101);
       
       tx.commit();
      // session.close();
       
       
       System.out.println(telusko);
    }
}
