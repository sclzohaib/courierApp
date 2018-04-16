package org.burkitech.courierApp.daoimpl;

import org.burkitech.courierApp.dao.TrackDAO;
import org.burkitech.courierApp.dto.Track;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("trackDAO")
@Transactional
public class TrackDAOImpl implements TrackDAO{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean add(Track track) {
		try {
			sessionFactory.getCurrentSession().persist(track);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	
}
