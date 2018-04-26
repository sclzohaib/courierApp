package org.burkitech.courierApp.daoimpl;

import java.util.List;

import org.burkitech.courierApp.dao.ServiceDAO;
import org.burkitech.courierApp.dto.Service;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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

	@Override
	public List<Service> serviceList() {
		String selectService = "FROM Service";
		Query query = sessionFactory.getCurrentSession().createQuery(selectService);
		System.out.println(query.getResultList());
		return query.getResultList();
	}

}
