package org.burkitech.courierApp.daoimpl;

import org.burkitech.courierApp.dao.MasterDAO;
import org.burkitech.courierApp.dto.Detail;
import org.burkitech.courierApp.dto.Master;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("masterDAO")
@Transactional
public class MasterDAOImpl implements MasterDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean add(Master master) {
		try {
			sessionFactory.getCurrentSession().persist(master);
			master.getDetail().setMaster(master);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addDetail(Detail detail) {
		try {
			sessionFactory.getCurrentSession().persist(detail);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
