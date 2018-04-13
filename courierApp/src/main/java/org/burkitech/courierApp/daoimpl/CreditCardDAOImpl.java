package org.burkitech.courierApp.daoimpl;

import org.burkitech.courierApp.dao.CreditCardDAO;
import org.burkitech.courierApp.dto.CreditCard;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("creditCardDAO")
@Transactional
public class CreditCardDAOImpl implements CreditCardDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public boolean add(CreditCard creditCard) {
		try {
			sessionFactory.getCurrentSession().persist(creditCard);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
