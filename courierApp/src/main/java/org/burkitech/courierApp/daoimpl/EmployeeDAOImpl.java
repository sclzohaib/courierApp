package org.burkitech.courierApp.daoimpl;

import java.util.List;

import org.burkitech.courierApp.dao.EmployeeDAO;
import org.burkitech.courierApp.dto.Employee;
import org.burkitech.courierApp.dto.Route;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("employeeDAO")
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Employee get(int id) {
		return sessionFactory.getCurrentSession().get(Employee.class, Integer.valueOf(id));
	}

	@Override
	public boolean add(Employee employee) {
		try {
			sessionFactory.getCurrentSession().persist(employee);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Employee employee) {
		try {
			sessionFactory.getCurrentSession().update(employee);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Employee employee) {
		try {
			sessionFactory.getCurrentSession().delete(employee);
			return true;
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Route> employeeList() {
		String selectInstructions = "FROM Employee";
		Query query = sessionFactory.getCurrentSession().createQuery(selectInstructions);
		System.out.println(query.getResultList());
		return query.getResultList();
	}

}
