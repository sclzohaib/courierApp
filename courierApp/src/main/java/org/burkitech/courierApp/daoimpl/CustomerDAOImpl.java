package org.burkitech.courierApp.daoimpl;

import org.burkitech.courierApp.dao.CustomerDAO;
import org.burkitech.courierApp.dto.Customer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("customerDAO")
@Transactional
public class CustomerDAOImpl implements CustomerDAO{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public boolean add(Customer customer) {
		try {
			sessionFactory.getCurrentSession().persist(customer);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
