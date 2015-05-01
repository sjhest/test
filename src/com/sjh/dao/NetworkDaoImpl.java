package com.sjh.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sjh.entities.Network;

@Repository
public class NetworkDaoImpl implements NetworkDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addNetwork(Network network) {
		Session session = sessionFactory.getCurrentSession();
		session.save(network);
	}

}
