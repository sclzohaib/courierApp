package org.burkitech.courierApp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "CS_TRACK")
public class Track {

	@Id
	@Column(name = "AWB_NO")
	private String awbNo;

	@Column(name = "SEC_STAT")
	private String secStat;

	@Column(name = "SEC_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date secDate;

	@Column(name = "REPORT_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date reportDate;

	@Column(name = "OUT_SRV_AREA")
	private String outSrvArea;

	@Column(name = "ROUTE_CODE")
	private String routeCode;

	@Column(name = "CREATE_DATIME")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createDateTime;

	@Column(name = "BOOK_TIME")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date bookTime;

	@Column(name = "COD_STATUS")
	private String codStatus;

	@Column(name = "HNDLG_INSTRUCTION")
	private String handlingInstruction;

	@Column(name = "EMP_ID")
	private String employeeId;

	@Column(name = "TRACK_7")
	private String tract7;

	@Column(name = "TRACK_6")
	private String tract6;

	@Column(name = "TRACK_5")
	private String tract5;

	@Column(name = "TRACK_8")
	private String tract8;

	@Column(name = "MIS_DWH")
	private String misDwh;

	@Column(name = "BATCH_NO")
	private String batchNo;

	@Column(name = "CNSG_TYP")
	private String cnsgType;

	@Column(name = "FWD_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fwdDate;

	@Column(name = "TRACK_4")
	private String track4;

	@Column(name = "TRACK_3")
	private String track3;

	@Column(name = "TRACK_1")
	private String track1;

	@Column(name = "TRACK_2")
	private String track2;

	@Column(name = "TRACK_CALLDATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date trackCallDate;

	@Column(name = "CUS_PHN")
	private String customerPhone;

	@Column(name = "SHIPPER_ADD1")
	private String shipperAddress1;

	@Column(name = "SHIPPER_ADD3")
	private String shipperAddress3;

	@Column(name = "SHIPPER_ADD2")
	private String shipperAddress2;

	@Column(name = "CUS_FAX")
	private String customerFax;

	@Column(name = "BKG_DAT")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date bkgDate;

	@Column(name = "CUS_NAM")
	private String customerName;

	@Column(name = "CONSG_NAM")
	private String consgName;

	@Column(name = "CONSG_ADDR1")
	private String consgAddress1;

	@Column(name = "CONSG_ADDR2")
	private String consgAddress2;

	@Column(name = "CONSG_ADDR3")
	private String consgAddress3;

	@Column(name = "CONSG_PHN")
	private String consgPhone;

	@Column(name = "CONSG_FAX")
	private String consgFax;

	@Column(name = "CALL_NO")
	private String callNo;

	@Column(name = "CUST_ID")
	private String customerId;

	@Column(name = "PACK_CONT")
	private String packCont;

	@Column(name = "BOOK_WT")
	private long bookWeight;

	@Column(name = "DESTN")
	private String destination;

	@Column(name = "ORIGN")
	private String origin;

	@Column(name = "TOT_AMT")
	private long totalAmount;

	@Column(name = "ACTUAL_WT")
	private long actualWeight;

	@Column(name = "OUT_SRV_CHARGES")
	private long outSrvCharges;

	@Column(name = "PROD_ID")
	private String productId;

	@Column(name = "SERVICE_NO")
	private String serviceNo;

	@Column(name = "NO_PCS")
	private String noPcs;

	@Column(name = "TRANSM_STATUS")
	private String transmStatus;

	@Column(name = "TRANSM_DTTM")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date transmDttm;

	@Column(name = "EMP_ID2")
	private String employeeId2;

	public String getAwbNo() {
		return awbNo;
	}

	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

	public String getSecStat() {
		return secStat;
	}

	public void setSecStat(String secStat) {
		this.secStat = secStat;
	}

	public Date getSecDate() {
		return secDate;
	}

	public void setSecDate(Date secDate) {
		this.secDate = secDate;
	}

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public String getOutSrvArea() {
		return outSrvArea;
	}

	public void setOutSrvArea(String outSrvArea) {
		this.outSrvArea = outSrvArea;
	}

	public String getRouteCode() {
		return routeCode;
	}

	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	public Date getBookTime() {
		return bookTime;
	}

	public void setBookTime(Date bookTime) {
		this.bookTime = bookTime;
	}

	public String getCodStatus() {
		return codStatus;
	}

	public void setCodStatus(String codStatus) {
		this.codStatus = codStatus;
	}

	public String getHandlingInstruction() {
		return handlingInstruction;
	}

	public void setHandlingInstruction(String handlingInstruction) {
		this.handlingInstruction = handlingInstruction;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getTract7() {
		return tract7;
	}

	public void setTract7(String tract7) {
		this.tract7 = tract7;
	}

	public String getTract6() {
		return tract6;
	}

	public void setTract6(String tract6) {
		this.tract6 = tract6;
	}

	public String getTract5() {
		return tract5;
	}

	public void setTract5(String tract5) {
		this.tract5 = tract5;
	}

	public String getTract8() {
		return tract8;
	}

	public void setTract8(String tract8) {
		this.tract8 = tract8;
	}

	public String getMisDwh() {
		return misDwh;
	}

	public void setMisDwh(String misDwh) {
		this.misDwh = misDwh;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getCnsgType() {
		return cnsgType;
	}

	public void setCnsgType(String cnsgType) {
		this.cnsgType = cnsgType;
	}

	public Date getFwdDate() {
		return fwdDate;
	}

	public void setFwdDate(Date fwdDate) {
		this.fwdDate = fwdDate;
	}

	public String getTrack4() {
		return track4;
	}

	public void setTrack4(String track4) {
		this.track4 = track4;
	}

	public String getTrack3() {
		return track3;
	}

	public void setTrack3(String track3) {
		this.track3 = track3;
	}

	public String getTrack1() {
		return track1;
	}

	public void setTrack1(String track1) {
		this.track1 = track1;
	}

	public String getTrack2() {
		return track2;
	}

	public void setTrack2(String track2) {
		this.track2 = track2;
	}

	public Date getTrackCallDate() {
		return trackCallDate;
	}

	public void setTrackCallDate(Date trackCallDate) {
		this.trackCallDate = trackCallDate;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getShipperAddress1() {
		return shipperAddress1;
	}

	public void setShipperAddress1(String shipperAddress1) {
		this.shipperAddress1 = shipperAddress1;
	}

	public String getShipperAddress3() {
		return shipperAddress3;
	}

	public void setShipperAddress3(String shipperAddress3) {
		this.shipperAddress3 = shipperAddress3;
	}

	public String getShipperAddress2() {
		return shipperAddress2;
	}

	public void setShipperAddress2(String shipperAddress2) {
		this.shipperAddress2 = shipperAddress2;
	}

	public String getCustomerFax() {
		return customerFax;
	}

	public void setCustomerFax(String customerFax) {
		this.customerFax = customerFax;
	}

	public Date getBkgDate() {
		return bkgDate;
	}

	public void setBkgDate(Date bkgDate) {
		this.bkgDate = bkgDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getConsgName() {
		return consgName;
	}

	public void setConsgName(String consgName) {
		this.consgName = consgName;
	}

	public String getConsgAddress1() {
		return consgAddress1;
	}

	public void setConsgAddress1(String consgAddress1) {
		this.consgAddress1 = consgAddress1;
	}

	public String getConsgAddress2() {
		return consgAddress2;
	}

	public void setConsgAddress2(String consgAddress2) {
		this.consgAddress2 = consgAddress2;
	}

	public String getConsgAddress3() {
		return consgAddress3;
	}

	public void setConsgAddress3(String consgAddress3) {
		this.consgAddress3 = consgAddress3;
	}

	public String getConsgPhone() {
		return consgPhone;
	}

	public void setConsgPhone(String consgPhone) {
		this.consgPhone = consgPhone;
	}

	public String getConsgFax() {
		return consgFax;
	}

	public void setConsgFax(String consgFax) {
		this.consgFax = consgFax;
	}

	public String getCallNo() {
		return callNo;
	}

	public void setCallNo(String callNo) {
		this.callNo = callNo;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getPackCont() {
		return packCont;
	}

	public void setPackCont(String packCont) {
		this.packCont = packCont;
	}

	public long getBookWeight() {
		return bookWeight;
	}

	public void setBookWeight(long bookWeight) {
		this.bookWeight = bookWeight;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public long getActualWeight() {
		return actualWeight;
	}

	public void setActualWeight(long actualWeight) {
		this.actualWeight = actualWeight;
	}

	public long getOutSrvCharges() {
		return outSrvCharges;
	}

	public void setOutSrvCharges(long outSrvCharges) {
		this.outSrvCharges = outSrvCharges;
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

	public String getNoPcs() {
		return noPcs;
	}

	public void setNoPcs(String noPcs) {
		this.noPcs = noPcs;
	}

	public String getTransmStatus() {
		return transmStatus;
	}

	public void setTransmStatus(String transmStatus) {
		this.transmStatus = transmStatus;
	}

	public Date getTransmDttm() {
		return transmDttm;
	}

	public void setTransmDttm(Date transmDttm) {
		this.transmDttm = transmDttm;
	}

	public String getEmployeeId2() {
		return employeeId2;
	}

	public void setEmployeeId2(String employeeId2) {
		this.employeeId2 = employeeId2;
	}

	@Override
	public String toString() {
		return "Track [awbNo=" + awbNo + ", secStat=" + secStat + ", secDate=" + secDate + ", reportDate=" + reportDate
				+ ", outSrvArea=" + outSrvArea + ", routeCode=" + routeCode + ", createDateTime=" + createDateTime
				+ ", bookTime=" + bookTime + ", codStatus=" + codStatus + ", handlingInstruction=" + handlingInstruction
				+ ", employeeId=" + employeeId + ", tract7=" + tract7 + ", tract6=" + tract6 + ", tract5=" + tract5
				+ ", tract8=" + tract8 + ", misDwh=" + misDwh + ", batchNo=" + batchNo + ", cnsgType=" + cnsgType
				+ ", fwdDate=" + fwdDate + ", track4=" + track4 + ", track3=" + track3 + ", track1=" + track1
				+ ", track2=" + track2 + ", trackCallDate=" + trackCallDate + ", customerPhone=" + customerPhone
				+ ", shipperAddress1=" + shipperAddress1 + ", shipperAddress3=" + shipperAddress3 + ", shipperAddress2="
				+ shipperAddress2 + ", customerFax=" + customerFax + ", bkgDate=" + bkgDate + ", customerName="
				+ customerName + ", consgName=" + consgName + ", consgAddress1=" + consgAddress1 + ", consgAddress2="
				+ consgAddress2 + ", consgAddress3=" + consgAddress3 + ", consgPhone=" + consgPhone + ", consgFax="
				+ consgFax + ", callNo=" + callNo + ", customerId=" + customerId + ", packCont=" + packCont
				+ ", bookWeight=" + bookWeight + ", destination=" + destination + ", origin=" + origin
				+ ", totalAmount=" + totalAmount + ", actualWeight=" + actualWeight + ", outSrvCharges=" + outSrvCharges
				+ ", productId=" + productId + ", serviceNo=" + serviceNo + ", noPcs=" + noPcs + ", transmStatus="
				+ transmStatus + ", transmDttm=" + transmDttm + ", employeeId2=" + employeeId2 + "]";
	}

}
