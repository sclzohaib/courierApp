package org.burkitech.courierApp.dao;

import org.burkitech.courierApp.dto.Item;
import org.burkitech.courierApp.dto.Items;

public interface ItemDAO {
	
	boolean add(Item item);
	boolean addItems(Items items);
}
