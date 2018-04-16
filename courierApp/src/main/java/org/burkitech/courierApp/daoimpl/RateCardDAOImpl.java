package org.burkitech.courierApp.daoimpl;

import org.burkitech.courierApp.dao.RateCardDAO;
import org.burkitech.courierApp.dto.RateCard;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository("rateCardDAO")
@Transactional
public class RateCardDAOImpl implements RateCardDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean add(RateCard rateCard) {
		try {
			sessionFactory.getCurrentSession().persist(rateCard);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
