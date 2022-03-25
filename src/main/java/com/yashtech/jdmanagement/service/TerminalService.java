package com.yashtech.jdmanagement.service;

import java.util.List;
import java.util.Set;

import com.yashtech.jdmanagement.model.Terminal;

public interface TerminalService {
	
	public Terminal createTerminal(Terminal terminal);
	
	public List<Terminal> getAllTerminal();
	
	public List<Terminal> getTerminalsByUserId(Integer userId);

}
