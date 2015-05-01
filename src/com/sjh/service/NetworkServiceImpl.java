package com.sjh.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjh.dao.NetworkDao;
import com.sjh.entities.Network;

@Service
public class NetworkServiceImpl implements NetworkService {

	@Autowired
	NetworkDao networkDao = null;
	
	@Transactional
	@Override
	public void createNetwork(Network network) {
		networkDao.addNetwork(network);
	}

}
