package com.yashtech.jdmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yashtech.jdmanagement.model.Terminal;
import com.yashtech.jdmanagement.repository.TerminalRepository;
import com.yashtech.jdmanagement.service.TerminalService;

@RestController
public class TerminalController {
	
	@Autowired
	private TerminalService terminalService;
	
	@Autowired
	private TerminalRepository terminalRepository;
	
	
	@PostMapping("/createterminal")
	public ResponseEntity<Terminal> createTerminal(@RequestBody Terminal terminal){
		return ResponseEntity.status(201).body(terminalService.createTerminal(terminal));
	}
	
	
	  @GetMapping("/getallterminal") 
	  public ResponseEntity<List<Terminal>> getAllTerminals(){
		  return ResponseEntity.status(200).body(terminalService.getAllTerminal());
	  }
	  
	
	  @GetMapping("/getterminalbyuserid/{id}")
		 public List<Terminal> findByUser(@PathVariable Integer id){
			 return terminalRepository.findByUserId(id); 
		 }
	  
	  
	  @GetMapping("/getAllTerminalByDealerId/{id}")
	  public List<Terminal> findByDealer(@PathVariable Integer id){

		return terminalRepository.findByDealerId(id);
		  
	  }
	  
}
