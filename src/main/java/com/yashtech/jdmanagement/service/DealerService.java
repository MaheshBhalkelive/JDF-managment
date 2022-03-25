package com.yashtech.jdmanagement.service;

import java.util.List;

import com.yashtech.jdmanagement.model.Dealer;

public interface DealerService {
	
	public Dealer createDealer(Dealer dealer);
	
	public Dealer updateDealer(Dealer dealer);
	
	public List<Dealer> getAllDealer();
	
	public Dealer getDealerById(Integer dealerId);
	
	public void deleteDealer(Integer dealerId);

}
