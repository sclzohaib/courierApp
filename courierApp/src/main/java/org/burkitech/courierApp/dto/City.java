package org.burkitech.courierApp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

//@Entity
//@Table(name="cs_city")
public class City {

	@Id
	@Column(name = "CITY_NO")
	private String cityNo;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "AREA_NO")
	private String areaNo;
	
	@Column(name = "PROD_ID")
	private String productId;
	
	@Column(name = "SECTOR_ID")
	private String serviceNo;
	
	@Column(name = "HUB_STAT")
	private String hubstat;
	
	@Column(name = "HUB_NAME")
	private String hubName;
	
	@Column(name = "CONTATCT_PERSON")
	private String contactPerson;
	
	@Column(name = "DESIG")
	private String designation;
	
	@Column(name = "ADDR1")
	private String address1;
	
	@Column(name = "ADDR2")
	private String address2;
	
	@Column(name = "ADDR3")
	private String address3;
	
	@Column(name = "CONTRY_NO")
	private String countryNo;
	
	@Column(name = "INTR_ADDR")
	private String intrAddress;
	
	@Column(name = "PHONE")
	private String phone;
	
	@Column(name = "FAX")
	private String fax;
	
	@Column(name = "TELX")
	private String telx;
	
	@Column(name = "STD_TIME")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date stdTime;
	
	@Column(name = "OSEC")
	private String osec;
	
	@Column(name = "RBAG_HUB")
	private String rbagHub;

	public String getCityNo() {
		return cityNo;
	}

	public void setCityNo(String cityNo) {
		this.cityNo = cityNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAreaNo() {
		return areaNo;
	}

	public void setAreaNo(String areaNo) {
		this.areaNo = areaNo;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getServiceNo() {
		return serviceNo;
	}

	public void setServiceNo(String serviceNo) {
		this.serviceNo = serviceNo;
	}

	public String getHubstat() {
		return hubstat;
	}

	public void setHubstat(String hubstat) {
		this.hubstat = hubstat;
	}

	public String getHubName() {
		return hubName;
	}

	public void setHubName(String hubName) {
		this.hubName = hubName;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getCountryNo() {
		return countryNo;
	}

	public void setCountryNo(String countryNo) {
		this.countryNo = countryNo;
	}

	public String getIntrAddress() {
		return intrAddress;
	}

	public void setIntrAddress(String intrAddress) {
		this.intrAddress = intrAddress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getTelx() {
		return telx;
	}

	public void setTelx(String telx) {
		this.telx = telx;
	}

	public Date getStdTime() {
		return stdTime;
	}

	public void setStdTime(Date stdTime) {
		this.stdTime = stdTime;
	}

	public String getOsec() {
		return osec;
	}

	public void setOsec(String osec) {
		this.osec = osec;
	}

	public String getRbagHub() {
		return rbagHub;
	}

	public void setRbagHub(String rbagHub) {
		this.rbagHub = rbagHub;
	}

	@Override
	public String toString() {
		return "City [cityNo=" + cityNo + ", description=" + description + ", areaNo=" + areaNo + ", productId="
				+ productId + ", serviceNo=" + serviceNo + ", hubstat=" + hubstat + ", hubName=" + hubName
				+ ", contactPerson=" + contactPerson + ", designation=" + designation + ", address1=" + address1
				+ ", address2=" + address2 + ", address3=" + address3 + ", countryNo=" + countryNo + ", intrAddress="
				+ intrAddress + ", phone=" + phone + ", fax=" + fax + ", telx=" + telx + ", stdTime=" + stdTime
				+ ", osec=" + osec + ", rbagHub=" + rbagHub + "]";
	}
	
	
}
