package org.burkitech.courierApp.daoimpl;

import org.burkitech.courierApp.dao.IntSectorDAO;
import org.burkitech.courierApp.dto.IntSector;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository("intSectorDAO")
@Transactional
public class IntSectorDAOImpl implements IntSectorDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public boolean add(IntSector intSector) {
		try {
			sessionFactory.getCurrentSession().persist(intSector);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
