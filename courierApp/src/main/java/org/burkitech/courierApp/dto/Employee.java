package org.burkitech.courierApp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "emp")
public class Employee {
	// 1
	@Id
	@Column(name = "emp_id")
	private String id;

	@NotBlank(message = "Please enter the Employee Name!")
	@Column(name = "emp_name")
	private String name;

	@Column(name = "emp_joining")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date joinDate;

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	@NotBlank(message = "Please enter the route!")
	@Column(name = "rut_no")
	private String route;

	@Column(name = "city_no")
	private String city;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// public String getDate() {
	// return joinDate;
	// }

	// public void setDate(String joinDate) {
	// this.joinDate = joinDate;
	// }

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", date=" + joinDate + ", route=" + route + ", city=" + city
				+ "]";
	}

}
