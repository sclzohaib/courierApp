package org.burkitech.courierApp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "CS_RATE_CARD")
public class RateCard {
	
	@Id
	@Column(name = "PAY_ID")
	private String payId;
	
	@Column(name = "PROD_ID")
	private String productID;

	@Column(name = "SECTOR_ID")
	private String SECTORiD;
	
	@Column(name = "SERVICE_CODE")
	private String serviceCode;
	
	@Column(name = "WTT_LOWER_LMT")
	private long wttLowerLmt;
	
	@Column(name = "WTT_UPPER_LMT")
	private long wttUpperLmt;
	
	@Column(name = "DIV_FAC")
	private long divFac;
	
	@Column(name = "CHARGES")
	private long charges;
	
	@Column(name = "AD_CHARGES")
	private long adCharges;
	
	@Column(name = "HANDLING_CHARGES")
	private long handlingCharges;
	
	@Column(name = "OTHER_CHARGES")
	private long otherCharges;
	
	@Column(name = "START_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	
	
	private Date getStartDate() {
		return startDate;
	}

	private void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Column(name = "END_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endDate;
	
	private Date getEndDate() {
		return endDate;
	}

	private void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "REMARKS")
	private String remarks;
	
	@Column(name = "APPROVAL_AUTH")
	private String approvalAuth;
	
	@Column(name = "UPDATED_BY")
	private String updatedBy;
	
//	@Column(name = "UPDATED_DATE")
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	private Date updatedDate;

	@Column(name = "EMP_ID")
	private String empId;
	
	@Column(name = "STAT")
	private String stat;
	
	@Column(name = "TARRIF_YEAR")
	private String tarrifYear;


	private String getPayId() {
		return payId;
	}

	private void setPayId(String payId) {
		this.payId = payId;
	}

	private String getProductID() {
		return productID;
	}

	private void setProductID(String productID) {
		this.productID = productID;
	}

	private String getSECTORiD() {
		return SECTORiD;
	}

	private void setSECTORiD(String sECTORiD) {
		SECTORiD = sECTORiD;
	}

	private String getServiceCode() {
		return serviceCode;
	}

	private void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	private long getWttLowerLmt() {
		return wttLowerLmt;
	}

	private void setWttLowerLmt(long wttLowerLmt) {
		this.wttLowerLmt = wttLowerLmt;
	}

	private long getWttUpperLmt() {
		return wttUpperLmt;
	}

	private void setWttUpperLmt(long wttUpperLmt) {
		this.wttUpperLmt = wttUpperLmt;
	}

	private long getDivFac() {
		return divFac;
	}

	private void setDivFac(long divFac) {
		this.divFac = divFac;
	}

	private long getCharges() {
		return charges;
	}

	private void setCharges(long charges) {
		this.charges = charges;
	}

	private long getAdCharges() {
		return adCharges;
	}

	private void setAdCharges(long adCharges) {
		this.adCharges = adCharges;
	}

	private long getHandlingCharges() {
		return handlingCharges;
	}

	private void setHandlingCharges(long handlingCharges) {
		this.handlingCharges = handlingCharges;
	}

	private long getOtherCharges() {
		return otherCharges;
	}

	private void setOtherCharges(long otherCharges) {
		this.otherCharges = otherCharges;
	}

	private String getRemarks() {
		return remarks;
	}

	private void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	private String getApprovalAuth() {
		return approvalAuth;
	}

	private void setApprovalAuth(String approvalAuth) {
		this.approvalAuth = approvalAuth;
	}

	private String getUpdatedBy() {
		return updatedBy;
	}

	private void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	private String getEmpId() {
		return empId;
	}

	private void setEmpId(String empId) {
		this.empId = empId;
	}

	private String getStat() {
		return stat;
	}

	private void setStat(String stat) {
		this.stat = stat;
	}

	private String getTarrifYear() {
		return tarrifYear;
	}

	private void setTarrifYear(String tarrifYear) {
		this.tarrifYear = tarrifYear;
	}

	@Override
	public String toString() {
		return "RateCard [payId=" + payId + ", productID=" + productID + ", SECTORiD=" + SECTORiD + ", serviceCode="
				+ serviceCode + ", wttLowerLmt=" + wttLowerLmt + ", wttUpperLmt=" + wttUpperLmt + ", divFac=" + divFac
				+ ", charges=" + charges + ", adCharges=" + adCharges + ", handlingCharges=" + handlingCharges
				+ ", otherCharges=" + otherCharges + ", startDate=" + startDate + ", endDate=" + endDate + ", remarks="
				+ remarks + ", approvalAuth=" + approvalAuth + ", updatedBy=" + updatedBy + ", empId=" + empId
				+ ", stat=" + stat + ", tarrifYear=" + tarrifYear + "]";
	}
	

}
