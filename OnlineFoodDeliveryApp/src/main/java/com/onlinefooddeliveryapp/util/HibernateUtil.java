package com.onlinefooddeliveryapp.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.onlinefooddeliveryapp.entity.Bill;
import com.onlinefooddeliveryapp.entity.Cart;
import com.onlinefooddeliveryapp.entity.Category;
import com.onlinefooddeliveryapp.entity.Customer;
import com.onlinefooddeliveryapp.entity.Item;
import com.onlinefooddeliveryapp.entity.Order;

public class HibernateUtil {

private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			try {
				Configuration cfg = new Configuration();
				
				//Hibernate settings equivalent to hibernate.cfg.xml properties
				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL,"jdbc:mysql://localhost:3306/Project_onlinefooddeliveryapp");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS,"rootpass");
				settings.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");
				settings.put(Environment.SHOW_SQL, "true");
				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				settings.put(Environment.HBM2DDL_AUTO, "update");
				
				cfg.setProperties(settings);
				cfg.addAnnotatedClass(Item.class);
//				cfg.addAnnotatedClass(Flight.class);
//				cfg.addAnnotatedClass(Person.class);
//				cfg.addAnnotatedClass(Passenger.class);
//				cfg.addAnnotatedClass(Location.class);
				//cfg.addAnnotatedClass(Employee_Details.class);
				
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
													.applySettings(cfg.getProperties()).build();
				System.out.println("Hibernate Java Configuration Service Registry Created....");
				sessionFactory = cfg.buildSessionFactory(serviceRegistry);
				return sessionFactory;
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}
