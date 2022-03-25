package com.yashtech.jdmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yashtech.jdmanagement.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
