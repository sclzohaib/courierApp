package org.burkitech.courierApp.daoimpl;

import org.burkitech.courierApp.dao.HandInstrDAO;
import org.burkitech.courierApp.dto.HandInstr;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository("handInstrDAO")
@Transactional
public class HandInstrDAOImpl implements HandInstrDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean add(HandInstr handInstr) {
		
		
		try {
			sessionFactory.getCurrentSession().persist(handInstr);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
