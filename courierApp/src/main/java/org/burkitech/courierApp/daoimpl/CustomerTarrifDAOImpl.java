package org.burkitech.courierApp.daoimpl;

import org.burkitech.courierApp.dao.CustomerTarrifDAO;
import org.burkitech.courierApp.dto.CustomerTarrif;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("customerTarrifDAO")
@Transactional
public class CustomerTarrifDAOImpl implements CustomerTarrifDAO{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public boolean add(CustomerTarrif customerTarrif) {
		try {
			sessionFactory.getCurrentSession().persist(customerTarrif);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
