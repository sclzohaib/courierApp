package org.burkitech.courierApp.dao;

import org.burkitech.courierApp.dto.Delivery;
import org.burkitech.courierApp.dto.DeliveryDetail;
import org.burkitech.courierApp.dto.NewDelivery;

public interface DeliveryDAO {
//	boolean add(Delivery delivery);
//	boolean addDetail(DeliveryDetail deliveryDetail);
	boolean add(NewDelivery delivery);
}
