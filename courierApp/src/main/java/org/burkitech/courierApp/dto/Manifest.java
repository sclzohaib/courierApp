package org.burkitech.courierApp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "manifest")
public class Manifest {
	
	@Id
	@Column(name = "manifest_id")
	private String id;
	
	@Column(name = "bag_no")
	private String bagNo;
	
	@Column(name = "man_type")
	private String type;
	
	private String origin;
	
	@Column(name = "dest")
	private String destination;
	
	@Column(name = "m_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date mdate;
	
	@Column(name = "vehicle_no")
	private long vehicleNo;
	
	@Column(name = "total_quantity")
	private long totalQuantity;
	
	@Column(name = "total_weight")
	private long totalWeight;
	
	@Column(name = "prod_id")
	private String product;
	
	@Column(name = "emp_id")
	private String employee;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBagNo() {
		return bagNo;
	}

	public void setBagNo(String bagNo) {
		this.bagNo = bagNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDate() {
		return mdate;
	}

	public void setDate(Date mdate) {
		this.mdate = mdate;
	}

	public long getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(long vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public long getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(long totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public long getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(long totalWeight) {
		this.totalWeight = totalWeight;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}
	
	
}
