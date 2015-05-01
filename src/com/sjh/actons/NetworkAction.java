package com.sjh.actons;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sjh.entities.Network;
import com.sjh.service.NetworkService;

public class NetworkAction extends ActionSupport implements ModelDriven<Network>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Network network;
	
	@Autowired
	NetworkService networkService = null;
	
	public String execute(){
		networkService.createNetwork(network);
		System.out.println(network);
		return SUCCESS;
	}

	@Override
	public Network getModel() {
		if(network == null){
			network = new Network();
		}
		return network;
	}

	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}
	
	

}
