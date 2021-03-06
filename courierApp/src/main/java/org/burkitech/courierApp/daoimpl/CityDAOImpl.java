package org.burkitech.courierApp.daoimpl;

import java.util.List;

import org.burkitech.courierApp.dao.CityDAO;
import org.burkitech.courierApp.dto.City;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("cityDAO")
@Transactional
public class CityDAOImpl implements CityDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean add(City city) {
		try {
			sessionFactory.getCurrentSession().persist(city);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public List<City> cityList() {
		String selectCity = "FROM City";
		Query query = sessionFactory.getCurrentSession().createQuery(selectCity);
		System.out.println(query.getResultList());
		return query.getResultList();
	}

}
