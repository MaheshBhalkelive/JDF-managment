package com.yashtech.jdmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Terminal {
	
	@Id
	@NonNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int terminalId;
	
	private String terminalName;
	
	@OneToOne
	@JoinColumn(name = "userId")
	@JsonProperty( value = "user", access = JsonProperty.Access.WRITE_ONLY)
	private User user;
	
	
	@OneToOne
	@JoinColumn(name = "dealerId")
	@JsonProperty( value = "dealer", access = JsonProperty.Access.WRITE_ONLY)
	private Dealer dealer;

	public Terminal() {
		super();
	}

	public Terminal(@NonNull int terminalId, String terminalName, User user) {
		super();
		this.terminalId = terminalId;
		this.terminalName = terminalName;
		this.user = user;
	}

	public int getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(int terminalId) {
		this.terminalId = terminalId;
	}

	public String getTerminalName() {
		return terminalName;
	}

	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Terminal [terminalId=" + terminalId + ", terminalName=" + terminalName + ", user=" + user + "]";
	}

}
