package com.yashtech.jdmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yashtech.jdmanagement.model.Dealer;

@Repository
public interface DealerRepository extends JpaRepository<Dealer, Integer> {
	
}
