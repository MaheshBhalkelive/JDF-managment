package com.yashtech.jdmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yashtech.jdmanagement.model.Terminal;

import com.yashtech.jdmanagement.repository.TerminalRepository;

@Service
public class TerminalServiceImpl implements TerminalService {
	
	@Autowired
	private TerminalRepository terminalRepository;

	@Override
	public Terminal createTerminal(Terminal terminal) {
		return terminalRepository.save(terminal);
	}

	@Override
	public List<Terminal> getAllTerminal() {
		return terminalRepository.findAll();
	}

	@Override
	public List<Terminal> getTerminalsByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
