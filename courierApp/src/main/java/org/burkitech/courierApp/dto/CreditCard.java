package org.burkitech.courierApp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cs_credit_card")
public class CreditCard {

	@Id
	@Column(name = "CITY_NO")
	private String cityNo;
	
	@Column(name = "PROD_ID")
	private String productId;
	
	@Column(name = "SECT_NO")
	private String sectNo;
	
	@Column(name = "CNTRY_CODE")
	private String countryCode;
	
	@Column(name = "CONTRY_NO")
	private String countryNo;
	
	@Column(name = "SERVICE_NO")
	private String serviceNo;

	public String getCityNo() {
		return cityNo;
	}

	public void setCityNo(String cityNo) {
		this.cityNo = cityNo;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSectNo() {
		return sectNo;
	}

	public void setSectNo(String sectNo) {
		this.sectNo = sectNo;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryNo() {
		return countryNo;
	}

	public void setCountryNo(String countryNo) {
		this.countryNo = countryNo;
	}

	public String getServiceNo() {
		return serviceNo;
	}

	public void setServiceNo(String serviceNo) {
		this.serviceNo = serviceNo;
	}

	@Override
	public String toString() {
		return "CreditCard [cityNo=" + cityNo + ", productId=" + productId + ", sectNo=" + sectNo + ", countryCode="
				+ countryCode + ", countryNo=" + countryNo + ", serviceNo=" + serviceNo + "]";
	}
	
}
