package org.burkitech.courierApp.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "NEW_BOOK_INFO")
public class NewBookInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="my_entity_seq_gen")
	@SequenceGenerator(name="my_entity_seq_gen", sequenceName="new_info")
	private int id;
	private String custKey;// master
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date bkgDate; // master
	private long productId;// master
	private long cnsgNo;// detail
	private String origin;// master
	private String dest;// master
	@Transient
	private String cityName;
	private Long serviceType;// master
	private String shipperInfo;// detail
	private String cnsgInfo;// detatl
	private String shipperName;// detail
	private String cnsgName;// detail
	private String shipperCompany;// detail
	private String cnsgCompany;// detail
	private String shipperAddress;// detail
	private String cnsgAddress;// detail
	private String shipperPhone;// detail
	private String cnsgPhone;// detail
	private String paymentMode;// master
	private Long serviceAmount;// master
	private Long gst;// master
	private Long noOfPcs;// master
	private Long handlingAmount;// master
	private Long ped;// master
	private float dimensions;// master
	private Long partnerAmount;// master
	private Long octroi;// master
	private Long chargeableWtt;// master
	private Long otsAmount;// master
	private Long fuelCharges;// master
	private String hanlingInstr;// master
	private Long otherAmount;// master
	private Long insPremium;// master
	private String insItemType;// master
	private Long partnerComm;// master
	private Long customFees;// master
	private String insDeclareValue;// master
	private Long discShipment;// master
	private Long total;// master

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustKey() {
		return custKey;
	}

	public void setCustKey(String custKey) {
		this.custKey = custKey;
	}

	public Date getBkgDate() {
		return bkgDate;
	}

	public void setBkgDate(Date bkgDate) {
		this.bkgDate = bkgDate;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getCnsgNo() {
		return cnsgNo;
	}

	public void setCnsgNo(long cnsgNo) {
		this.cnsgNo = cnsgNo;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Long getServiceType() {
		return serviceType;
	}

	public void setServiceType(Long serviceType) {
		this.serviceType = serviceType;
	}

	public String getShipperInfo() {
		return shipperInfo;
	}

	public void setShipperInfo(String shipperInfo) {
		this.shipperInfo = shipperInfo;
	}

	public String getCnsgInfo() {
		return cnsgInfo;
	}

	public void setCnsgInfo(String cnsgInfo) {
		this.cnsgInfo = cnsgInfo;
	}

	public String getShipperName() {
		return shipperName;
	}

	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}

	public String getCnsgName() {
		return cnsgName;
	}

	public void setCnsgName(String cnsgName) {
		this.cnsgName = cnsgName;
	}

	public String getShipperCompany() {
		return shipperCompany;
	}

	public void setShipperCompany(String shipperCompany) {
		this.shipperCompany = shipperCompany;
	}

	public String getCnsgCompany() {
		return cnsgCompany;
	}

	public void setCnsgCompany(String cnsgCompany) {
		this.cnsgCompany = cnsgCompany;
	}

	public String getShipperAddress() {
		return shipperAddress;
	}

	public void setShipperAddress(String shipperAddress) {
		this.shipperAddress = shipperAddress;
	}

	public String getCnsgAddress() {
		return cnsgAddress;
	}

	public void setCnsgAddress(String cnsgAddress) {
		this.cnsgAddress = cnsgAddress;
	}

	public String getShipperPhone() {
		return shipperPhone;
	}

	public void setShipperPhone(String shipperPhone) {
		this.shipperPhone = shipperPhone;
	}

	public String getCnsgPhone() {
		return cnsgPhone;
	}

	public void setCnsgPhone(String cnsgPhone) {
		this.cnsgPhone = cnsgPhone;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Long getServiceAmount() {
		return serviceAmount;
	}

	public void setServiceAmount(Long serviceAmount) {
		this.serviceAmount = serviceAmount;
	}

	public Long getGst() {
		return gst;
	}

	public void setGst(Long gst) {
		this.gst = gst;
	}

	public Long getNoOfPcs() {
		return noOfPcs;
	}

	public void setNoOfPcs(Long noOfPcs) {
		this.noOfPcs = noOfPcs;
	}

	public Long getHandlingAmount() {
		return handlingAmount;
	}

	public void setHandlingAmount(Long handlingAmount) {
		this.handlingAmount = handlingAmount;
	}

	public Long getPed() {
		return ped;
	}

	public void setPed(Long ped) {
		this.ped = ped;
	}

	public float getDimensions() {
		return dimensions;
	}

	public void setDimensions(float dimensions) {
		this.dimensions = dimensions;
	}

	public Long getPartnerAmount() {
		return partnerAmount;
	}

	public void setPartnerAmount(Long partnerAmount) {
		this.partnerAmount = partnerAmount;
	}

	public Long getOctroi() {
		return octroi;
	}

	public void setOctroi(Long octroi) {
		this.octroi = octroi;
	}

	public Long getChargeableWtt() {
		return chargeableWtt;
	}

	public void setChargeableWtt(Long chargeableWtt) {
		this.chargeableWtt = chargeableWtt;
	}

	public Long getOtsAmount() {
		return otsAmount;
	}

	public void setOtsAmount(Long otsAmount) {
		this.otsAmount = otsAmount;
	}

	public Long getFuelCharges() {
		return fuelCharges;
	}

	public void setFuelCharges(Long fuelCharges) {
		this.fuelCharges = fuelCharges;
	}

	public String getHanlingInstr() {
		return hanlingInstr;
	}

	public void setHanlingInstr(String hanlingInstr) {
		this.hanlingInstr = hanlingInstr;
	}

	public Long getOtherAmount() {
		return otherAmount;
	}

	public void setOtherAmount(Long otherAmount) {
		this.otherAmount = otherAmount;
	}

	public Long getInsPremium() {
		return insPremium;
	}

	public void setInsPremium(Long insPremium) {
		this.insPremium = insPremium;
	}

	public String getInsItemType() {
		return insItemType;
	}

	public void setInsItemType(String insItemType) {
		this.insItemType = insItemType;
	}

	public Long getPartnerComm() {
		return partnerComm;
	}

	public void setPartnerComm(Long partnerComm) {
		this.partnerComm = partnerComm;
	}

	public Long getCustomFees() {
		return customFees;
	}

	public void setCustomFees(Long customFees) {
		this.customFees = customFees;
	}

	public String getInsDeclareValue() {
		return insDeclareValue;
	}

	public void setInsDeclareValue(String insDeclareValue) {
		this.insDeclareValue = insDeclareValue;
	}

	public Long getDiscShipment() {
		return discShipment;
	}

	public void setDiscShipment(Long discShipment) {
		this.discShipment = discShipment;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

}
