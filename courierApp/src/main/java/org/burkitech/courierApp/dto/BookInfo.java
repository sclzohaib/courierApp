package org.burkitech.courierApp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

//@Entity
//@Table(name = "cs_book_info")
public class BookInfo {

	@Id
	@Column(name = "awb_no")
	private String awbNo;

	@Column(name = "BILL_REF#")
	private String billRef;

	@Column(name = "BKG_DAT")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date bkgDate;

	public Date getBkgDate() {
		return bkgDate;
	}

	public void setBkgDate(Date bkgDate) {
		this.bkgDate = bkgDate;
	}

	@Column(name = "CUST_ID")
	private String customerId;

	@Column(name = "SHIP_TYPE")
	private String shipType;

	@Column(name = "PROD_ID")
	private String productId;

	@Column(name = "SERVICE_NO")
	private String serviceNo;

	@Column(name = "SECTOR_ID")
	private String sectorId;

	@Column(name = "ORIGN")
	private String origin;

	@Column(name = "DESTN")
	private String destination;

	@Column(name = "BOOK_WT")
	private long bookWt;

	@Column(name = "ACTUAL_WT")
	private long actualWt;

	@Column(name = "PAY_ID")
	private String payId;

	@Column(name = "EMP_ID")
	private String empId;

	@Column(name = "OUT_SRV_CHARGES")
	private long outServiceCharges;

	@Column(name = "HANDLING_CHG")
	private long handlingCharges;

	@Column(name = "OTHER_CHRG")
	private long otherCharges;

	@Column(name = "AMOUNT")
	private long amount;

	@Column(name = "PARTNER_COMM")
	private long partnerComm;

	@Column(name = "PART_COMM")
	private long partComm;

	@Column(name = "AMT_CAL")
	private long amountCal;

	@Column(name = "HND_INSTRUCTION")
	private String hndInstruction;

	@Column(name = "GST")
	private long gst;

	@Column(name = "SHIP_VALUE")
	private long shipValue;

	@Column(name = "INSURANCE_CHG")
	private long insuranceCharges;

	@Column(name = "ROUTE_CODE")
	private String Routecode;

	@Column(name = "USERID")
	private String userid;

	@Column(name = "SYSID")
	private String sysId;

	@Column(name = "DISCOUNT_SHIP")
	private long discountShip;

	@Column(name = "DISCOUNT_BOTT")
	private long discountBott;

	@Column(name = "DISCOUNT_FREQ")
	private long discountFreq;

	@Column(name = "INCEN_AMT")
	private long incremenAmount;

	@Column(name = "CREATE_DATIME")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createDatetime;

	public Date getCreateDatetime() {
		return createDatetime;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}

	@Column(name = "SCAN_STAT2")
	private String scanStat2;

	@Column(name = "SCAN_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date scanDate;

	public Date getScanDate() {
		return scanDate;
	}

	public void setScanDate(Date scanDate) {
		this.scanDate = scanDate;
	}

	@Column(name = "RPT_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date rptDate;

	public Date getRptDate() {
		return rptDate;
	}

	public void setRptDate(Date rptDate) {
		this.rptDate = rptDate;
	}

	@Column(name = "EOD_STATUS")
	private String eodStatus;

	@Column(name = "BILL_STATUS")
	private String billStatus;

	@Column(name = "INC_STATUS")
	private String incStatus;

	@Column(name = "CUT_OF_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date cutOfDate;

	public Date getCutOfDate() {
		return cutOfDate;
	}

	public void setCutOfDate(Date cutOfDate) {
		this.cutOfDate = cutOfDate;
	}

	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "DISCOUNT")
	private String discount;

	@Column(name = "DISCOUNT_UNIT")
	private long discountUnit;

	@Column(name = "DISCOUNT_WTT")
	private long discountWt;

	@Column(name = "CUST_REF")
	private String custRef;

	@Column(name = "BILL_CALLDATE")
	private String billCallDate;

	public String getAwbNo() {
		return awbNo;
	}

	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

	public String getBillRef() {
		return billRef;
	}

	public void setBillRef(String billRef) {
		this.billRef = billRef;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getShipType() {
		return shipType;
	}

	public void setShipType(String shipType) {
		this.shipType = shipType;
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

	public String getSectorId() {
		return sectorId;
	}

	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
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

	public long getBookWt() {
		return bookWt;
	}

	public void setBookWt(long bookWt) {
		this.bookWt = bookWt;
	}

	public long getActualWt() {
		return actualWt;
	}

	public void setActualWt(long actualWt) {
		this.actualWt = actualWt;
	}

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public long getOutServiceCharges() {
		return outServiceCharges;
	}

	public void setOutServiceCharges(long outServiceCharges) {
		this.outServiceCharges = outServiceCharges;
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

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public long getPartnerComm() {
		return partnerComm;
	}

	public void setPartnerComm(long partnerComm) {
		this.partnerComm = partnerComm;
	}

	public long getPartComm() {
		return partComm;
	}

	public void setPartComm(long partComm) {
		this.partComm = partComm;
	}

	public long getAmountCal() {
		return amountCal;
	}

	public void setAmountCal(long amountCal) {
		this.amountCal = amountCal;
	}

	public String getHndInstruction() {
		return hndInstruction;
	}

	public void setHndInstruction(String hndInstruction) {
		this.hndInstruction = hndInstruction;
	}

	public long getGst() {
		return gst;
	}

	public void setGst(long gst) {
		this.gst = gst;
	}

	public long getShipValue() {
		return shipValue;
	}

	public void setShipValue(long shipValue) {
		this.shipValue = shipValue;
	}

	public long getInsuranceCharges() {
		return insuranceCharges;
	}

	public void setInsuranceCharges(long insuranceCharges) {
		this.insuranceCharges = insuranceCharges;
	}

	public String getRoutecode() {
		return Routecode;
	}

	public void setRoutecode(String routecode) {
		Routecode = routecode;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getSysId() {
		return sysId;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId;
	}

	public long getDiscountShip() {
		return discountShip;
	}

	public void setDiscountShip(long discountShip) {
		this.discountShip = discountShip;
	}

	public long getDiscountBott() {
		return discountBott;
	}

	public void setDiscountBott(long discountBott) {
		this.discountBott = discountBott;
	}

	public long getDiscountFreq() {
		return discountFreq;
	}

	public void setDiscountFreq(long discountFreq) {
		this.discountFreq = discountFreq;
	}

	public long getIncremenAmount() {
		return incremenAmount;
	}

	public void setIncremenAmount(long incremenAmount) {
		this.incremenAmount = incremenAmount;
	}

	public String getScanStat2() {
		return scanStat2;
	}

	public void setScanStat2(String scanStat2) {
		this.scanStat2 = scanStat2;
	}

	public String getEodStatus() {
		return eodStatus;
	}

	public void setEodStatus(String eodStatus) {
		this.eodStatus = eodStatus;
	}

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public String getIncStatus() {
		return incStatus;
	}

	public void setIncStatus(String incStatus) {
		this.incStatus = incStatus;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public long getDiscountUnit() {
		return discountUnit;
	}

	public void setDiscountUnit(long discountUnit) {
		this.discountUnit = discountUnit;
	}

	public long getDiscountWt() {
		return discountWt;
	}

	public void setDiscountWt(long discountWt) {
		this.discountWt = discountWt;
	}

	public String getCustRef() {
		return custRef;
	}

	public void setCustRef(String custRef) {
		this.custRef = custRef;
	}

	public String getBillCallDate() {
		return billCallDate;
	}

	public void setBillCallDate(String billCallDate) {
		this.billCallDate = billCallDate;
	}

	@Override
	public String toString() {
		return "BookInfo [awbNo=" + awbNo + ", billRef=" + billRef + ", bkgDate=" + bkgDate + ", customerId="
				+ customerId + ", shipType=" + shipType + ", productId=" + productId + ", serviceNo=" + serviceNo
				+ ", sectorId=" + sectorId + ", origin=" + origin + ", destination=" + destination + ", bookWt="
				+ bookWt + ", actualWt=" + actualWt + ", payId=" + payId + ", empId=" + empId + ", outServiceCharges="
				+ outServiceCharges + ", handlingCharges=" + handlingCharges + ", otherCharges=" + otherCharges
				+ ", amount=" + amount + ", partnerComm=" + partnerComm + ", partComm=" + partComm + ", amountCal="
				+ amountCal + ", hndInstruction=" + hndInstruction + ", gst=" + gst + ", shipValue=" + shipValue
				+ ", insuranceCharges=" + insuranceCharges + ", Routecode=" + Routecode + ", userid=" + userid
				+ ", sysId=" + sysId + ", discountShip=" + discountShip + ", discountBott=" + discountBott
				+ ", discountFreq=" + discountFreq + ", incremenAmount=" + incremenAmount + ", createDatetime="
				+ createDatetime + ", scanStat2=" + scanStat2 + ", scanDate=" + scanDate + ", rptDate=" + rptDate
				+ ", eodStatus=" + eodStatus + ", billStatus=" + billStatus + ", incStatus=" + incStatus
				+ ", cutOfDate=" + cutOfDate + ", userId=" + userId + ", discount=" + discount + ", discountUnit="
				+ discountUnit + ", discountWt=" + discountWt + ", custRef=" + custRef + ", billCallDate="
				+ billCallDate + "]";
	}

}
