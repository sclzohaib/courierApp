package org.burkitech.courierApp.dao;

import org.burkitech.courierApp.dto.Employee;

public interface EmployeeDAO {
	Employee get(int id);
	boolean add(Employee employee);
boolean update(Employee employee);
boolean delete(Employee employee);
}
