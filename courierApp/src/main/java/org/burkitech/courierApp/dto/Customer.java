package org.burkitech.courierApp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

//@Entity
//@Table(name = "CS_customer")
public class Customer {
	@Id
	@Column(name = "CUST_ID")
	private String customerID;

	@Column(name = "IND_NO")
	private String intNo;

	@Column(name = "REGS_DAT")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date registrationDate;

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Column(name = "UPDATED_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedDate;

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Column(name = "CLOSE_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date closeDate;

	public Date getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	@Column(name = "CUS_EXPIRED_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date expiredDate;

	public Date getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}

	@Column(name = "ACC_FEE")
	private String accFee;

	@Column(name = "SERV_CHRG")
	private long serviceCharges;

	@Column(name = "REC_TER_ID")
	private long recTerId;

	@Column(name = "FEE_FLAG")
	private String feeFlag;

	@Column(name = "BILLING_STATUS")
	private String billingStatus;

	@Column(name = "PIN_NO")
	private String pinNO;

	@Column(name = "STAT")
	private String stat;

	@Column(name = "BILLING_CUST")
	private String billingCust;

	@Column(name = "TRTY_CODE")
	private String trtyCode;

	@Column(name = "HNDLG_EXEMPT")
	private String handlingExempt;

	@Column(name = "TRF_YEAR")
	private String trfYear;

	@Column(name = "BANK_CODE")
	private String bankCode;

	@Column(name = "EMP_ID")
	private String employeeId;

	@Column(name = "OCTROI_EXEMPT")
	private String octroiExempt;

	@Column(name = "CUS_GST")
	private String cusGst;

	@Column(name = "DISCOUNT_FLAG")
	private String discountFlag;

	@Column(name = "ADDR1")
	private String address1;

	@Column(name = "ADDR2")
	private String address2;

	@Column(name = "ADDR3")
	private String address3;

	@Column(name = "DESIG")
	private String designation;

	@Column(name = "INT_ADDR")
	private String intAddess;

	//

	@Column(name = "CUST_ID2")
	private String customerId2;

	@Column(name = "CONT_PER")
	private String contPer;

	@Column(name = "CUS_NAM")
	private String customerName;

	@Column(name = "PCUS_NO")
	private String pcusNo;

	@Column(name = "CRDT_AMT_LMT")
	private String creditAmountLimit;

	@Column(name = "INV_TYPE_NO")
	private String invTypeNo;

	@Column(name = "DSCNT_BOTT")
	private long discountBott;

	@Column(name = "CRDT_DAYS")
	private long creditDays;

	@Column(name = "CRDT_DAYS_LMT")
	private String creditDaysLimit;

	@Column(name = "CITY_NO")
	private String cityNo;

	@Column(name = "EMP_ID2")
	private String employeeId2;

	@Column(name = "RUT_NO")
	private String routeNo;

	@Column(name = "CUS_PROD")
	private String customerProduct;

	@Column(name = "BILL_CYC_NO")
	private String billCycNo;

	@Column(name = "CUS_CASH")
	private String customerCash;

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getIntNo() {
		return intNo;
	}

	public void setIntNo(String intNo) {
		this.intNo = intNo;
	}

	public String getAccFee() {
		return accFee;
	}

	public void setAccFee(String accFee) {
		this.accFee = accFee;
	}

	public long getServiceCharges() {
		return serviceCharges;
	}

	public void setServiceCharges(long serviceCharges) {
		this.serviceCharges = serviceCharges;
	}

	public long getRecTerId() {
		return recTerId;
	}

	public void setRecTerId(long recTerId) {
		this.recTerId = recTerId;
	}

	public String getFeeFlag() {
		return feeFlag;
	}

	public void setFeeFlag(String feeFlag) {
		this.feeFlag = feeFlag;
	}

	public String getBillingStatus() {
		return billingStatus;
	}

	public void setBillingStatus(String billingStatus) {
		this.billingStatus = billingStatus;
	}

	public String getPinNO() {
		return pinNO;
	}

	public void setPinNO(String pinNO) {
		this.pinNO = pinNO;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public String getBillingCust() {
		return billingCust;
	}

	public void setBillingCust(String billingCust) {
		this.billingCust = billingCust;
	}

	public String getTrtyCode() {
		return trtyCode;
	}

	public void setTrtyCode(String trtyCode) {
		this.trtyCode = trtyCode;
	}

	public String getHandlingExempt() {
		return handlingExempt;
	}

	public void setHandlingExempt(String handlingExempt) {
		this.handlingExempt = handlingExempt;
	}

	public String getTrfYear() {
		return trfYear;
	}

	public void setTrfYear(String trfYear) {
		this.trfYear = trfYear;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getOctroiExempt() {
		return octroiExempt;
	}

	public void setOctroiExempt(String octroiExempt) {
		this.octroiExempt = octroiExempt;
	}

	public String getCusGst() {
		return cusGst;
	}

	public void setCusGst(String cusGst) {
		this.cusGst = cusGst;
	}

	public String getDiscountFlag() {
		return discountFlag;
	}

	public void setDiscountFlag(String discountFlag) {
		this.discountFlag = discountFlag;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getIntAddess() {
		return intAddess;
	}

	public void setIntAddess(String intAddess) {
		this.intAddess = intAddess;
	}

	public String getCustomerId2() {
		return customerId2;
	}

	public void setCustomerId2(String customerId2) {
		this.customerId2 = customerId2;
	}

	public String getContPer() {
		return contPer;
	}

	public void setContPer(String contPer) {
		this.contPer = contPer;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPcusNo() {
		return pcusNo;
	}

	public void setPcusNo(String pcusNo) {
		this.pcusNo = pcusNo;
	}

	public String getCreditAmountLimit() {
		return creditAmountLimit;
	}

	public void setCreditAmountLimit(String creditAmountLimit) {
		this.creditAmountLimit = creditAmountLimit;
	}

	public String getInvTypeNo() {
		return invTypeNo;
	}

	public void setInvTypeNo(String invTypeNo) {
		this.invTypeNo = invTypeNo;
	}

	public long getDiscountBott() {
		return discountBott;
	}

	public void setDiscountBott(long discountBott) {
		this.discountBott = discountBott;
	}

	public long getCreditDays() {
		return creditDays;
	}

	public void setCreditDays(long creditDays) {
		this.creditDays = creditDays;
	}

	public String getCreditDaysLimit() {
		return creditDaysLimit;
	}

	public void setCreditDaysLimit(String creditDaysLimit) {
		this.creditDaysLimit = creditDaysLimit;
	}

	public String getCityNo() {
		return cityNo;
	}

	public void setCityNo(String cityNo) {
		this.cityNo = cityNo;
	}

	public String getEmployeeId2() {
		return employeeId2;
	}

	public void setEmployeeId2(String employeeId2) {
		this.employeeId2 = employeeId2;
	}

	public String getRouteNo() {
		return routeNo;
	}

	public void setRouteNo(String routeNo) {
		this.routeNo = routeNo;
	}

	public String getCustomerProduct() {
		return customerProduct;
	}

	public void setCustomerProduct(String customerProduct) {
		this.customerProduct = customerProduct;
	}

	public String getBillCycNo() {
		return billCycNo;
	}

	public void setBillCycNo(String billCycNo) {
		this.billCycNo = billCycNo;
	}

	public String getCustomerCash() {
		return customerCash;
	}

	public void setCustomerCash(String customerCash) {
		this.customerCash = customerCash;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", intNo=" + intNo + ", registrationDate=" + registrationDate
				+ ", updatedDate=" + updatedDate + ", closeDate=" + closeDate + ", expiredDate=" + expiredDate
				+ ", accFee=" + accFee + ", serviceCharges=" + serviceCharges + ", recTerId=" + recTerId + ", feeFlag="
				+ feeFlag + ", billingStatus=" + billingStatus + ", pinNO=" + pinNO + ", stat=" + stat
				+ ", billingCust=" + billingCust + ", trtyCode=" + trtyCode + ", handlingExempt=" + handlingExempt
				+ ", trfYear=" + trfYear + ", bankCode=" + bankCode + ", employeeId=" + employeeId + ", octroiExempt="
				+ octroiExempt + ", cusGst=" + cusGst + ", discountFlag=" + discountFlag + ", address1=" + address1
				+ ", address2=" + address2 + ", address3=" + address3 + ", designation=" + designation + ", intAddess="
				+ intAddess + ", customerId2=" + customerId2 + ", contPer=" + contPer + ", customerName=" + customerName
				+ ", pcusNo=" + pcusNo + ", creditAmountLimit=" + creditAmountLimit + ", invTypeNo=" + invTypeNo
				+ ", discountBott=" + discountBott + ", creditDays=" + creditDays + ", creditDaysLimit="
				+ creditDaysLimit + ", cityNo=" + cityNo + ", employeeId2=" + employeeId2 + ", routeNo=" + routeNo
				+ ", customerProduct=" + customerProduct + ", billCycNo=" + billCycNo + ", customerCash=" + customerCash
				+ "]";
	}

}
