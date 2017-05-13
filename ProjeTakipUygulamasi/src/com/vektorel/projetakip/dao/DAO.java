package com.vektorel.projetakip.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.vektorel.projetakip.entity.UserEntity;
import com.vektorel.projetakip.model.Durum;
import com.vektorel.projetakip.model.Proje;
import com.vektorel.projetakip.model.User;


public class DAO {
	
	private static DAO uniqueInstance;
	 
 
	public static DAO getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new DAO();
		}
		return uniqueInstance;
	}
	
	
	SessionFactory sessionFactory;

	public DAO() {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}

	public User checkUser(UserEntity userEntity) {
		User user = null;
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("userName", userEntity.getUserName()));
		criteria.add(Restrictions.eq("password", userEntity.getPassword()));
		List myList = criteria.list();
		if(myList.size() > 0)
			user = (User)myList.get(0);
		session.close();
		return user;
	}
	
	public void addUser(Object userAdd) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(userAdd);
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
		} finally {
			session.close();
		}
	}

	public List<User> getUserList() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		List<User> myList = criteria.list();
		session.close();		
		return myList;
	}

	public List<Durum> getDurumList() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Durum.class);
		List<Durum> myList = criteria.list();
		session.close();		
		return myList;
		
		
	}

	public List<Proje> getProjeList() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Proje.class);
		List<Proje> myList = criteria.list();
		session.close();		
		return myList;
	}

	
	
}

