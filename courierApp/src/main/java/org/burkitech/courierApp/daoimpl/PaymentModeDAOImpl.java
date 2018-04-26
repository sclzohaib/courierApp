package org.burkitech.courierApp.daoimpl;

import java.util.List;

import org.burkitech.courierApp.dao.PaymentModeDAO;
import org.burkitech.courierApp.dto.PaymentMode;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("paymentModeDAO")
@Transactional
public class PaymentModeDAOImpl implements PaymentModeDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean add(PaymentMode paymentMode) {
		try {
			sessionFactory.getCurrentSession().persist(paymentMode);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public List<PaymentMode> paymentModeList() {
		String selectPaymentMode = "FROM PaymentMode";
		Query query = sessionFactory.getCurrentSession().createQuery(selectPaymentMode);
		System.out.println(query.getResultList());
		return query.getResultList();
	}

}
