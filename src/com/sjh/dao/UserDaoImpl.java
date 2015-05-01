package com.sjh.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sjh.entities.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	@Override
	public String getUserNameById(int id) {
		String hql = "SELECT u.username FROM User u WHERE u.id = ?";
		Query query = getSession().createQuery(hql).setInteger(0, id);
		return (String)query.uniqueResult();
	}


	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub

	}

}
