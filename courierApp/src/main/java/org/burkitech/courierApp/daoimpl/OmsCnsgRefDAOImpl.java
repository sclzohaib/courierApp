package org.burkitech.courierApp.daoimpl;

import org.burkitech.courierApp.dao.OmsCnsgRefDAO;
import org.burkitech.courierApp.dto.OmsCnsgRef;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository("omsCnsgRefDAO")
@Transactional
public class OmsCnsgRefDAOImpl implements OmsCnsgRefDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean add(OmsCnsgRef omsCnsgRef) {
		try {
			sessionFactory.getCurrentSession().persist(omsCnsgRef);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
