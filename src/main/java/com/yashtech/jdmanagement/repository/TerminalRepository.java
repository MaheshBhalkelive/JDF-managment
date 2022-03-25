package com.yashtech.jdmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.yashtech.jdmanagement.model.Terminal;

@Repository
public interface TerminalRepository extends JpaRepository<Terminal, Integer> {

	@Query(value = "select * from terminal where user_Id=:d", nativeQuery = true )
	public List<Terminal> findByUserId(@Param ("d") Integer id);
	
	@Query(value = "select * from terminal where dealer_id=:d", nativeQuery = true)
	public List<Terminal> findByDealerId(@Param("d") Integer id);
	
}
