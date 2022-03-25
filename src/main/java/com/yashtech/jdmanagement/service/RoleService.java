package com.yashtech.jdmanagement.service;

import java.util.List;

import com.yashtech.jdmanagement.model.Role;

public interface RoleService {
	
	public Role createRole(Role role);
	
	public Role updateRole(Role role);
	
	public List<Role> getAllRole();
	
	public Role getRoleById(Integer roleId);

	public void deleteRole(Integer roleId);

}
