package org.burkitech.courierApp.daoimpl;

import org.burkitech.courierApp.dao.DeliveryDAO;
import org.burkitech.courierApp.dto.Delivery;
import org.burkitech.courierApp.dto.DeliveryDetail;
import org.burkitech.courierApp.dto.NewDelivery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("deliveryDAO")
@Transactional
public class DeliveryDAOImpl implements DeliveryDAO {
	@Autowired
	private SessionFactory sessionFactory;

//	@Override
//	public boolean add(Delivery delivery) {
//		try {
//			sessionFactory.getCurrentSession().persist(delivery);
//			return true;
//		}
//
//		catch (Exception ex) {
//			ex.printStackTrace();
//			return false;
//		}
//	}
//
//	@Override
//	public boolean addDetail(DeliveryDetail deliveryDetail) {
//		try {
//			sessionFactory.getCurrentSession().persist(deliveryDetail);
//			return true;
//		}
//
//		catch (Exception ex) {
//			ex.printStackTrace();
//			return false;
//		}
//	}

	@Override
	public boolean add(NewDelivery delivery) {
		try {
			sessionFactory.getCurrentSession().persist(delivery);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
