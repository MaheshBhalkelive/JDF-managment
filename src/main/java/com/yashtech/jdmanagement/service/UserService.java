package com.yashtech.jdmanagement.service; 

import java.util.List;

import com.yashtech.jdmanagement.model.User;

public interface UserService {
	
	public User createUser(User user);
	
	public User updateUser(User user);

	public List<User> getAllUser();
	
	public User getUserById(Integer userId);
	
	public void deleteUser(Integer userId);
	
	public List<User> getUserByDealerId(Integer delearId);
	
	
}
