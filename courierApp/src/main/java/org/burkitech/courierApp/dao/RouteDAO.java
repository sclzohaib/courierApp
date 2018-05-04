package org.burkitech.courierApp.dao;

import java.util.List;

import org.burkitech.courierApp.dto.Route;

public interface RouteDAO {
	boolean add(Route route);

	List<Route> routeList();

}
