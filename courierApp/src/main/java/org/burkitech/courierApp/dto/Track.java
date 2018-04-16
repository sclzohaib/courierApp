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
	
	private Date getSecDate() {
		return secDate;
	}

	private void setSecDate(Date secDate) {
		this.secDate = secDate;
	}

	@Column(name = "REPORT_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date reportDate;

	private Date getReportDate() {
		return reportDate;
	}

	private void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	@Column(name = "OUT_SRV_AREA")
	private String outSrvArea;

	@Column(name = "ROUTE_CODE")
	private String routeCode;
	
	@Column(name = "CREATE_DATIME")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createDateTime;

	private Date getCreateDateTime() {
		return createDateTime;
	}

	private void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	@Column(name = "BOOK_TIME")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date bookTime;

	private Date getBookTime() {
		return bookTime;
	}

	private void setBookTime(Date bookTime) {
		this.bookTime = bookTime;
	}

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

	private Date getFwdDate() {
		return fwdDate;
	}

	private void setFwdDate(Date fwdDate) {
		this.fwdDate = fwdDate;
	}

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

	private Date getTrackCallDate() {
		return trackCallDate;
	}

	private void setTrackCallDate(Date trackCallDate) {
		this.trackCallDate = trackCallDate;
	}

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

	private Date getBkgDate() {
		return bkgDate;
	}

	private void setBkgDate(Date bkgDate) {
		this.bkgDate = bkgDate;
	}

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

	private Date getTransmDttm() {
		return transmDttm;
	}

	private void setTransmDttm(Date transmDttm) {
		this.transmDttm = transmDttm;
	}

	@Column(name = "EMP_ID2")
	private String employeeId2;

	private String getAwbNo() {
		return awbNo;
	}

	private void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

	private String getSecStat() {
		return secStat;
	}

	private void setSecStat(String secStat) {
		this.secStat = secStat;
	}

	private String getOutSrvArea() {
		return outSrvArea;
	}

	private void setOutSrvArea(String outSrvArea) {
		this.outSrvArea = outSrvArea;
	}

	private String getRouteCode() {
		return routeCode;
	}

	private void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}

	private String getCodStatus() {
		return codStatus;
	}

	private void setCodStatus(String codStatus) {
		this.codStatus = codStatus;
	}

	private String getHandlingInstruction() {
		return handlingInstruction;
	}

	private void setHandlingInstruction(String handlingInstruction) {
		this.handlingInstruction = handlingInstruction;
	}

	private String getEmployeeId() {
		return employeeId;
	}

	private void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	private String getTract7() {
		return tract7;
	}

	private void setTract7(String tract7) {
		this.tract7 = tract7;
	}

	private String getTract6() {
		return tract6;
	}

	private void setTract6(String tract6) {
		this.tract6 = tract6;
	}

	private String getTract5() {
		return tract5;
	}

	private void setTract5(String tract5) {
		this.tract5 = tract5;
	}

	private String getTract8() {
		return tract8;
	}

	private void setTract8(String tract8) {
		this.tract8 = tract8;
	}

	private String getMisDwh() {
		return misDwh;
	}

	private void setMisDwh(String misDwh) {
		this.misDwh = misDwh;
	}

	private String getBatchNo() {
		return batchNo;
	}

	private void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	private String getCnsgType() {
		return cnsgType;
	}

	private void setCnsgType(String cnsgType) {
		this.cnsgType = cnsgType;
	}

	private String getTrack4() {
		return track4;
	}

	private void setTrack4(String track4) {
		this.track4 = track4;
	}

	private String getTrack3() {
		return track3;
	}

	private void setTrack3(String track3) {
		this.track3 = track3;
	}

	private String getTrack1() {
		return track1;
	}

	private void setTrack1(String track1) {
		this.track1 = track1;
	}

	private String getTrack2() {
		return track2;
	}

	private void setTrack2(String track2) {
		this.track2 = track2;
	}

	private String getCustomerPhone() {
		return customerPhone;
	}

	private void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	private String getShipperAddress1() {
		return shipperAddress1;
	}

	private void setShipperAddress1(String shipperAddress1) {
		this.shipperAddress1 = shipperAddress1;
	}

	private String getShipperAddress3() {
		return shipperAddress3;
	}

	private void setShipperAddress3(String shipperAddress3) {
		this.shipperAddress3 = shipperAddress3;
	}

	private String getShipperAddress2() {
		return shipperAddress2;
	}

	private void setShipperAddress2(String shipperAddress2) {
		this.shipperAddress2 = shipperAddress2;
	}

	private String getCustomerFax() {
		return customerFax;
	}

	private void setCustomerFax(String customerFax) {
		this.customerFax = customerFax;
	}

	private String getCustomerName() {
		return customerName;
	}

	private void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	private String getConsgName() {
		return consgName;
	}

	private void setConsgName(String consgName) {
		this.consgName = consgName;
	}

	private String getConsgAddress1() {
		return consgAddress1;
	}

	private void setConsgAddress1(String consgAddress1) {
		this.consgAddress1 = consgAddress1;
	}

	private String getConsgAddress2() {
		return consgAddress2;
	}

	private void setConsgAddress2(String consgAddress2) {
		this.consgAddress2 = consgAddress2;
	}

	private String getConsgAddress3() {
		return consgAddress3;
	}

	private void setConsgAddress3(String consgAddress3) {
		this.consgAddress3 = consgAddress3;
	}

	private String getConsgPhone() {
		return consgPhone;
	}

	private void setConsgPhone(String consgPhone) {
		this.consgPhone = consgPhone;
	}

	private String getConsgFax() {
		return consgFax;
	}

	private void setConsgFax(String consgFax) {
		this.consgFax = consgFax;
	}

	private String getCallNo() {
		return callNo;
	}

	private void setCallNo(String callNo) {
		this.callNo = callNo;
	}

	private String getCustomerId() {
		return customerId;
	}

	private void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	private String getPackCont() {
		return packCont;
	}

	private void setPackCont(String packCont) {
		this.packCont = packCont;
	}

	private long getBookWeight() {
		return bookWeight;
	}

	private void setBookWeight(long bookWeight) {
		this.bookWeight = bookWeight;
	}

	private String getDestination() {
		return destination;
	}

	private void setDestination(String destination) {
		this.destination = destination;
	}

	private String getOrigin() {
		return origin;
	}

	private void setOrigin(String origin) {
		this.origin = origin;
	}

	private long getTotalAmount() {
		return totalAmount;
	}

	private void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}

	private long getActualWeight() {
		return actualWeight;
	}

	private void setActualWeight(long actualWeight) {
		this.actualWeight = actualWeight;
	}

	private long getOutSrvCharges() {
		return outSrvCharges;
	}

	private void setOutSrvCharges(long outSrvCharges) {
		this.outSrvCharges = outSrvCharges;
	}

	private String getProductId() {
		return productId;
	}

	private void setProductId(String productId) {
		this.productId = productId;
	}

	private String getServiceNo() {
		return serviceNo;
	}

	private void setServiceNo(String serviceNo) {
		this.serviceNo = serviceNo;
	}

	private String getNoPcs() {
		return noPcs;
	}

	private void setNoPcs(String noPcs) {
		this.noPcs = noPcs;
	}

	private String getTransmStatus() {
		return transmStatus;
	}

	private void setTransmStatus(String transmStatus) {
		this.transmStatus = transmStatus;
	}

	private String getEmployeeId2() {
		return employeeId2;
	}

	private void setEmployeeId2(String employeeId2) {
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
