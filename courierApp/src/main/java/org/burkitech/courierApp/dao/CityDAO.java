package org.burkitech.courierApp.dao;

import java.util.List;

import org.burkitech.courierApp.dto.City;

public interface CityDAO {
boolean add(City city);
List<City> cityList();
}
