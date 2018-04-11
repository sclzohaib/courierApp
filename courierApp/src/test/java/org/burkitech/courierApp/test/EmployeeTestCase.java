package org.burkitech.courierApp.test;

import static org.junit.Assert.assertEquals;

import org.burkitech.courierApp.dao.EmployeeDAO;
import org.burkitech.courierApp.dto.Employee;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeTestCase {
	private static AnnotationConfigApplicationContext context;

	@Autowired
	private static EmployeeDAO employeeDAO;
	private Employee employee;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("org.burkitech.courierApp");
		context.refresh();
		employeeDAO = (EmployeeDAO) context.getBean("employeeDAO");
	}

	@Test
	public void testCRUDProduct() {
		employee = new Employee();
		employee.setName("Sharjeel");
//		employee.setDate(null);
		employee.setRoute("MAlir");
		employee.setCity("Karachi");
		assertEquals("Something went wrong while inserting a new product!", true, employeeDAO.add(employee));
		// }
		// reading and updating the category
		// product=productDAO.get(2);
		// product.setName("Samsung Galaxy S7");
		// assertEquals("Something went wrong while updating the existing record!",
		// true,productDAO.update(product));
		//
		// assertEquals("Something went wrong while deleting the existing record!",
		// true, productDAO.delete(product));
		//
		// assertEquals("Something went wrong while fetching the existing record!",
		// 6,productDAO.productList().size());
		// }

		// @Test
		// public void testListActiveProducts(){
		// assertEquals("Something went wrong while fetching the list of products!",
		// 3,productDAO.listActiveProducts().size());
		// }

		// @Test
		// public void testListActiveProductsByCategory(){
		// assertEquals("Something went wrong while fetching the list of products!",
		// 3,productDAO.listActiveProductsByCategory(3).size());
		// assertEquals("Something went wrong while fetching the list of products!",
		// 2,productDAO.listActiveProductsByCategory(1).size());
		// }
		//
		// @Test
		// public void testGetLatestActiveProduct(){
		// assertEquals("Something went wrong while fetching the list of products!",
		// 3,productDAO.getLatestActiveProducts(3).size());
		// }

	}
}