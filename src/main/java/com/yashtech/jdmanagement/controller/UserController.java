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

import com.yashtech.jdmanagement.model.User;
import com.yashtech.jdmanagement.repository.UserRepository;
import com.yashtech.jdmanagement.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository urepo;
	
	@GetMapping("/getalluser")
	public ResponseEntity<List<User>> getAllUser(){
		return ResponseEntity.ok().body(this.userService.getAllUser());
	}
	
	// @ResponseBody internally convert JSON to object
	@PostMapping("/createuser")
	public ResponseEntity<User> createUser(@RequestBody User user){
		return ResponseEntity.status(201).body(this.userService.createUser(user));	
	}
	
	@GetMapping("/getuser/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Integer id){
		return ResponseEntity.status(200).body(this.userService.getUserById(id));
	}
	
	@PutMapping("/updateuser/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Integer id, @RequestBody User user){
		user.setUserId(id);
		return ResponseEntity.status(202).body(this.userService.updateUser(user));
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public HttpStatus deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
		return HttpStatus.OK;
	}

	
	/*
	 * @GetMapping("/getuserbydelearid/{id}") public
	 * ResponseEntity<List<User>>getUserByDearId(@PathVariable Integer id){ return
	 * ResponseEntity.ok().body(userService.getUserByDealerId(id)); }
	 */
	 
	 @GetMapping("/getuserbydelearid/{id}")
	 public List<User> findbyUser(@PathVariable Integer id){
		 return urepo.findByDealerId(id); 
	 }
	
}
