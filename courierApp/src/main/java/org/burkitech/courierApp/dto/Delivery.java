package org.burkitech.courierApp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

//@Entity
//@Table(name = "emp")
public class Delivery {

	@Id
	@Column(name = "delivery_sht_no")
	private String id;
	
	@Column(name = "d_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dDate;
	
	
	public Date getdDate() {
		return dDate;
	}

	public void setdDate(Date dDate) {
		this.dDate = dDate;
	}

	@Column(name = "transport_type")
	private String transportType;
	
	@Column(name = "vehicle_no")
	private String vehicleNo;
	
	@Column(name = "city_no")
	private String cityNo;
	
	@Column(name = "time_slot")
	private String timeSlot;
	
	@Column(name = "emp_id")
	private String empId;
	
	@Column(name = "rut_no")
	private String route;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTransportType() {
		return transportType;
	}

	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getCityNo() {
		return cityNo;
	}

	public void setCityNo(String cityNo) {
		this.cityNo = cityNo;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	
	
}
