package com.yashtech.jdmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yashtech.jdfmanagement.exception.DealerNotFoundException;
import com.yashtech.jdmanagement.model.Dealer;
import com.yashtech.jdmanagement.repository.DealerRepository;

@Service
public class DealerServiceImpl implements DealerService {
	
	@Autowired
	private DealerRepository dealerRepository;

	@Override
	public Dealer createDealer(Dealer dealer) {
		return dealerRepository.save(dealer);
	}

	@Override
	public Dealer updateDealer(Dealer dealer) {
		
		Optional<Dealer> dealerDb = dealerRepository.findById(dealer.getDealerId());
		
		if(dealerDb.isPresent()) {
			Dealer dealerUpdate = dealerDb.get();
			dealerUpdate.setDealerId(dealer.getDealerId());
			dealerUpdate.setDealerName(dealer.getDealerName());
			
			dealerRepository.save(dealerUpdate);
			
			return dealerUpdate;
		}else {
			throw new DealerNotFoundException("dealer not found : " + dealer.getDealerId());
			}
		
	}

	@Override
	public List<Dealer> getAllDealer() {
		return dealerRepository.findAll();
	}

	@Override
	public Dealer getDealerById(Integer dealerId) {
		
		Optional<Dealer> dealerDb = dealerRepository.findById(dealerId);
		
		if(dealerDb.isPresent()) {
			return dealerDb.get();
		}
		throw new DealerNotFoundException("Dealer not found : "+ dealerId);
	}

	@Override
	public void deleteDealer(Integer dealerId) {
		
		Optional<Dealer> dealerDb = dealerRepository.findById(dealerId);
		
		if(dealerDb.isPresent()) {
			dealerRepository.delete(dealerDb.get());
		}else {
			throw new DealerNotFoundException("Dealer not found :" + dealerId);
		}
		
	}

}
