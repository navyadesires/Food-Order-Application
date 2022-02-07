package com.onlinefooddeliveryapp.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.onlinefooddeliveryapp.entity.Item;
import com.onlinefooddeliveryapp.util.HibernateUtil;

public class ItemRepository {

public List<Item> getAllItem() {
		
		Transaction transaction = null;
		List<Item> itemList = null;
		try {
		Session session = HibernateUtil.getSessionFactory().openSession();
			
			// start the transaction
			transaction = session.beginTransaction();
			
			
			//get entity from database
			itemList = session.createQuery("from Item").getResultList();
	
			//commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return itemList;
	}


public Item addItem(Item item) {
	Transaction transaction = null;
	try {
		Session session = HibernateUtil.getSessionFactory().openSession();
	
		
		// start the transaction
		transaction = session.beginTransaction();
		// save the employee object in to database
		session.save(item);
		// commit transaction
		transaction.commit();
	}catch (Exception e) {
		if (transaction != null) {
			transaction.rollback();
		}

		e.printStackTrace();
	}
	return item;
}

public String removeItem(String itemid) {
	// TODO Auto-generated method stub
	return null;
}

public Item updateItem(String itemid, Item item) {
	// TODO Auto-generated method stub
	return null;
}

public Item getItemById(String itemid) {
	// TODO Auto-generated method stub
	return null;
}
}
