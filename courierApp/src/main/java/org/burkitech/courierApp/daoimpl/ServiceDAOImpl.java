package org.burkitech.courierApp.daoimpl;

import org.burkitech.courierApp.dao.ServiceDAO;
import org.burkitech.courierApp.dto.Service;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository("serviceDAO")
@Transactional
public class ServiceDAOImpl implements ServiceDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean add(Service service) {
		try {
			sessionFactory.getCurrentSession().persist(service);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
