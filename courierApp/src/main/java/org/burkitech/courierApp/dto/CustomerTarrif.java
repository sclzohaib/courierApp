package org.burkitech.courierApp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

//@Entity
//@Table(name = "CS_CUST_TARRIF")
public class CustomerTarrif {

	@Id
	@Column(name = "CUST_ID")
	private String customerID;
	
	@Column(name = "PROD_ID")
	private String productId;
	
	@Column(name = "SERVICE_CODE")
	private String serviceCode;
	
	@Column(name = "SECTOR_ID")
	private String sectorId;
	
	@Column(name = "DESTN")
	private String destination;
	
	@Column(name = "WTT_LOWER_LMT")
	private long wttLowerLimit;
	
	@Column(name = "WTT_UPPER_LMT")
	private long wttUpperLimit;
	
	@Column(name = "DIV_FAC")
	private long divFac;
	
	@Column(name = "CHARGES")
	private long charges;
	
	@Column(name = "ADDITIONAL_CHRG")
	private long additionalCharges;
	
	@Column(name = "HANDLING_CHRG")
	private long handlingCharges;
	
	@Column(name = "OTHER_CHRG")
	private long otherCharges;
	
	@Column(name = "START_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Column(name = "END_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endDate;
	
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "APPROVAL_AUTH")
	private String approvalAuth;
	
	@Column(name = "UPDATED_BY")
	private String updatedBy;
	
	@Column(name = "UPDATED_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updateDate;
	
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Column(name = "EMP_ID")
	private String employeeId;
	
	@Column(name = "STAT")
	private String stat;
	
	@Column(name = "RMKS")
	private String remarks;

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getSectorId() {
		return sectorId;
	}

	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public long getWttLowerLimit() {
		return wttLowerLimit;
	}

	public void setWttLowerLimit(long wttLowerLimit) {
		this.wttLowerLimit = wttLowerLimit;
	}

	public long getWttUpperLimit() {
		return wttUpperLimit;
	}

	public void setWttUpperLimit(long wttUpperLimit) {
		this.wttUpperLimit = wttUpperLimit;
	}

	public long getDivFac() {
		return divFac;
	}

	public void setDivFac(long divFac) {
		this.divFac = divFac;
	}

	public long getCharges() {
		return charges;
	}

	public void setCharges(long charges) {
		this.charges = charges;
	}

	public long getAdditionalCharges() {
		return additionalCharges;
	}

	public void setAdditionalCharges(long additionalCharges) {
		this.additionalCharges = additionalCharges;
	}

	public long getHandlingCharges() {
		return handlingCharges;
	}

	public void setHandlingCharges(long handlingCharges) {
		this.handlingCharges = handlingCharges;
	}

	public long getOtherCharges() {
		return otherCharges;
	}

	public void setOtherCharges(long otherCharges) {
		this.otherCharges = otherCharges;
	}

	public String getApprovalAuth() {
		return approvalAuth;
	}

	public void setApprovalAuth(String approvalAuth) {
		this.approvalAuth = approvalAuth;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "CustomerTarrif [customerID=" + customerID + ", productId=" + productId + ", serviceCode=" + serviceCode
				+ ", sectorId=" + sectorId + ", destination=" + destination + ", wttLowerLimit=" + wttLowerLimit
				+ ", wttUpperLimit=" + wttUpperLimit + ", divFac=" + divFac + ", charges=" + charges
				+ ", additionalCharges=" + additionalCharges + ", handlingCharges=" + handlingCharges
				+ ", otherCharges=" + otherCharges + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", approvalAuth=" + approvalAuth + ", updatedBy=" + updatedBy + ", updateDate=" + updateDate
				+ ", employeeId=" + employeeId + ", stat=" + stat + ", remarks=" + remarks + "]";
	}
	
	
}
