package org.burkitech.courierApp.dao;

import java.util.List;

import org.burkitech.courierApp.dto.HandInstr;

public interface HandInstrDAO {
	
	boolean add(HandInstr handInstr);

	List<HandInstr> handlInstrList();

}
