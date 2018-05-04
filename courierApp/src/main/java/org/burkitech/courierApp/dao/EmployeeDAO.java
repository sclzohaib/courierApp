package org.burkitech.courierApp.dao;

import java.util.List;

import org.burkitech.courierApp.dto.Employee;
import org.burkitech.courierApp.dto.Route;

public interface EmployeeDAO {
	Employee get(int id);
	boolean add(Employee employee);
boolean update(Employee employee);
boolean delete(Employee employee);
List<Route> employeeList();
}
