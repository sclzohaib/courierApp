package org.burkitech.courierApp.daoimpl;

import java.util.List;

import org.burkitech.courierApp.dao.ProductDAO;
import org.burkitech.courierApp.dto.Product;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean add(Product product) {
		try {
			sessionFactory.getCurrentSession().persist(product);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Product> productList() {
		String selectProducts = "FROM Product";
		Query query = sessionFactory.getCurrentSession().createQuery(selectProducts);
		System.out.println(query.getResultList());
		return query.getResultList();
	}

}
