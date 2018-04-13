package org.burkitech.courierApp.daoimpl;

import org.burkitech.courierApp.dao.ManifestDAO;
import org.burkitech.courierApp.dto.Manifest;
import org.burkitech.courierApp.dto.ManifestDetail;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("manifestDAO")
@Transactional
public class ManifestDAOImpl implements ManifestDAO{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public boolean add(Manifest manifest) {
		try {
			sessionFactory.getCurrentSession().persist(manifest);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	@Override
	public boolean addDetail(ManifestDetail manifestDetail) {
		try {
			sessionFactory.getCurrentSession().persist(manifestDetail);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
