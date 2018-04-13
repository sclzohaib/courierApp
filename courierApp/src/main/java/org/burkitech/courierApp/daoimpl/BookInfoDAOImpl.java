package org.burkitech.courierApp.daoimpl;

import org.burkitech.courierApp.dao.BookInfoDAO;
import org.burkitech.courierApp.dto.BookDetail;
import org.burkitech.courierApp.dto.BookInfo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("bookInfoDAO")
@Transactional
public class BookInfoDAOImpl implements BookInfoDAO{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public boolean add(BookInfo bookInfo) {
		try {
			sessionFactory.getCurrentSession().persist(bookInfo);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	@Override
	public boolean addDetail(BookDetail bookDetail) {
		try {
			sessionFactory.getCurrentSession().persist(bookDetail);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
