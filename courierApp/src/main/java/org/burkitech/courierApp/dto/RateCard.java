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

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getSECTORiD() {
		return SECTORiD;
	}

	public void setSECTORiD(String sECTORiD) {
		SECTORiD = sECTORiD;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public long getWttLowerLmt() {
		return wttLowerLmt;
	}

	public void setWttLowerLmt(long wttLowerLmt) {
		this.wttLowerLmt = wttLowerLmt;
	}

	public long getWttUpperLmt() {
		return wttUpperLmt;
	}

	public void setWttUpperLmt(long wttUpperLmt) {
		this.wttUpperLmt = wttUpperLmt;
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

	public long getAdCharges() {
		return adCharges;
	}

	public void setAdCharges(long adCharges) {
		this.adCharges = adCharges;
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

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public String getTarrifYear() {
		return tarrifYear;
	}

	public void setTarrifYear(String tarrifYear) {
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
