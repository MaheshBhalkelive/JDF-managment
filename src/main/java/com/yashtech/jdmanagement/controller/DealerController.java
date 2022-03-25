package com.yashtech.jdmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yashtech.jdmanagement.model.Dealer;
import com.yashtech.jdmanagement.service.DealerService;

@RestController
public class DealerController {

	@Autowired
	private DealerService dealerService;
	
	@GetMapping("/getalldealer")
	public ResponseEntity<List<Dealer>> getAllDealer(){
		return ResponseEntity.ok().body(dealerService.getAllDealer());
	}
	
	@PostMapping("/createdealer")
	public ResponseEntity<Dealer> createDealer (@RequestBody Dealer dealer){
		return ResponseEntity.status(201).body(dealerService.createDealer(dealer));
	}
	
	@PutMapping("/updatedealer/{id}")
	public ResponseEntity<Dealer> updateDealer(@PathVariable Integer id, @RequestBody Dealer dealer){
		dealer.setDealerId(id);
		return ResponseEntity.status(202).body(dealerService.updateDealer(dealer));
	}
	
	@GetMapping("/getdealer/{id}")
	public ResponseEntity<Dealer> getDealerById(@PathVariable Integer id){
		return ResponseEntity.status(200).body(dealerService.getDealerById(id));
	}
	
	@DeleteMapping("/deletedealer/{id}")
	public HttpStatus deleteDealer(@PathVariable Integer id) {
		dealerService.deleteDealer(id);
		return HttpStatus.OK;
	}
	
}
