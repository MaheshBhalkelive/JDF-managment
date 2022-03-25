package com.yashtech.jdmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Dealer {
	
	@Id
	@NonNull
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@JsonProperty( value = "dealerId", access = JsonProperty.Access.WRITE_ONLY)
	private int dealerId;
	
	private String dealerName;
	
	public Dealer() {
		super();
	}

	public Dealer(@NonNull int dealerId, String dealerName) {
		super();
		this.dealerId = dealerId;
		this.dealerName = dealerName;
	}

	public int getDealerId() {
		return dealerId;
	}

	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	@Override
	public String toString() {
		return "Dealer [dealerId=" + dealerId + ", dealerName=" + dealerName + "]";
	}

}
