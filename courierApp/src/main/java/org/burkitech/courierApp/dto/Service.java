package org.burkitech.courierApp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CS_SERVICE")

public class Service {
	
	@Id
	@Column(name = "SERVICE_CODE")
	private String serviceCode;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "PROD_ID")
	private String productId;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "REMARKS")
	private String remarks;
	
	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "Service [serviceCode=" + serviceCode + ", description=" + description + ", productId=" + productId
				+ ", status=" + status + ", remarks=" + remarks + "]";
	}
	
}

