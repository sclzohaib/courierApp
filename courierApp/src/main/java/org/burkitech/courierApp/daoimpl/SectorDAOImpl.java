package org.burkitech.courierApp.daoimpl;

import org.burkitech.courierApp.dao.SectorDAO;
import org.burkitech.courierApp.dto.Sector;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository("sectorDAO")
@Transactional
public class SectorDAOImpl implements SectorDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean add(Sector sector) {
		try {
			sessionFactory.getCurrentSession().persist(sector);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
