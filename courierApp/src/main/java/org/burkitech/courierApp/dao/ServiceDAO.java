package org.burkitech.courierApp.dao;

import java.util.List;

import org.burkitech.courierApp.dto.City;
import org.burkitech.courierApp.dto.Service;

public interface ServiceDAO {

	boolean add(Service service);

	List<Service> serviceList();
}
