package org.burkitech.courierApp.dao;

import java.util.List;

import org.burkitech.courierApp.dto.Product;

public interface ProductDAO {

	boolean add(Product product);
	List<Product> productList();
}
