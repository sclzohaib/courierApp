package org.burkitech.courierApp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CS_INT_SECTOR")
public class IntSector {
	
	@Id
	@Column(name = "CITY_NO")
	private String cityNo;
	
	@Column(name = "PROD_ID")
	private String prodId;
	
	@Column(name = "SECTOR_ID")
	private String sectorId;
	
	@Column(name = "COUNTRY_CODE")
	private String countryCode;
	
	@Column(name = "COUNTRY_NO")
	private String countryNo;
	
	@Column(name = "SERVICE_CODE")
	private String serviceCode;
	
	public String getCityNo() {
		return cityNo;
	}


	public void setCityNo(String cityNo) {
		this.cityNo = cityNo;
	}


	public String getProdId() {
		return prodId;
	}


	public void setProdId(String prodId) {
		this.prodId = prodId;
	}


	public String getSectorId() {
		return sectorId;
	}


	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
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


	public String getServiceCode() {
		return serviceCode;
	}


	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	@Override
	public String toString() {
		return "IntSector [cityNo=" + cityNo + ", prodId=" + prodId + ", sectorId=" + sectorId + ", countryCode="
				+ countryCode + ", countryNo=" + countryNo + ", serviceCode=" + serviceCode + "]";
	}

	

}
