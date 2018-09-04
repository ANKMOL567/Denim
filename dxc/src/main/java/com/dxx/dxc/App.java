package com.dxx.dxc;
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

    	Configuration conf=new Configuration()
    			.addAnnotatedClass(Student.class)
    			.addAnnotatedClass(Department.class);
           	
    	Student std1=new Student();
    	std1.setName("John");
    	std1.setRollno("cs2");
    	std1.setMarks(93.3f);
    	
    	Student std2=new Student();
    	std2.setName("Paul");
    	std2.setRollno("it2");
    	std2.setMarks(83.3f);
    	
    	Department dept=new Department();
    	dept.setdName("CS");
    	dept.setdNo("d1");
    	dept.setdYear(2001);
    	std1.setdNo(dept);
    	std2.setdNo(dept);
    	dept.getStudents().add(std1);
    	dept.getStudents().add(std2);
    	
    	
        conf.configure();
         
        ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
        
        SessionFactory sessionfactory=conf.buildSessionFactory(registry);
       
        Session session=sessionfactory.openSession();
        
       Transaction transaction=session.beginTransaction();
       
       session.save(std1);
       session.save(std2);
       session.save(dept);
              
       transaction.commit();

    }
    }
