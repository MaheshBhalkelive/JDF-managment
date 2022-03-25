package com.yashtech.jdmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.yashtech.jdmanagement.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	

	@Query(value = "select * from user u where dealer_Id=:d", nativeQuery = true )
	public List<User> findByDealerId(@Param ("d") Integer id);
	
}
	 