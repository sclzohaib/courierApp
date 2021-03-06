package org.burkitech.courierApp.daoimpl;

import java.util.List;

import org.burkitech.courierApp.dao.RouteDAO;
import org.burkitech.courierApp.dto.Route;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository("routeDAO")
@Transactional
public class RouteDAOImpl implements RouteDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean add(Route route) {
		try {
			sessionFactory.getCurrentSession().persist(route);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Route> routeList() {
		String selectInstructions = "FROM Route";
		Query query = sessionFactory.getCurrentSession().createQuery(selectInstructions);
		System.out.println(query.getResultList());
		return query.getResultList();
	}

}
