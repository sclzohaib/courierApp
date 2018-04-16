package org.burkitech.courierApp.daoimpl;

import org.burkitech.courierApp.dao.ItemDAO;
import org.burkitech.courierApp.dto.Item;
import org.burkitech.courierApp.dto.Items;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository("itemDAO")
@Transactional
public class ItemDAOImpl implements ItemDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean add(Item item) {
		try {
			sessionFactory.getCurrentSession().persist(item);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}


	@Override
	public boolean addItems(Items items) {
		try {
			sessionFactory.getCurrentSession().persist(items);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
}
