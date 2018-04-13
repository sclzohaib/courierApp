package org.burkitech.courierApp.dto;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "cs_book_detl")
public class BookDetail {
	@Id
	@Column(name = "awb_no")
	private String awbNo;
	
	@Column(name = "SHIPPER_ADD1")
	private String shipperAddress1;
	
	@Column(name = "SHIPPER_ADD2")
	private String shipperAddress2;

	@Column(name = "SHIPPER_ADD3")
	private String shipperAddress3;
	
	@Column(name = "SHIPPER_PHN")
	private String shipperPhone;
	
	@Column(name = "SHIPPER_FAX")
	private String shipperFax;
	
	@Column(name = "SHIPPER_ZIP_CODE")
	private String shipperZipCode;
	
	@Column(name = "SHIPPER_COUNTRY")
	private String shipperCountry;
	
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
	
	@Column(name = "CONSG_ZIP_CODE")
	private String consgZipCode;
	
	@Column(name = "CONSG_COUNTRY")
	private String consgCountry;
	
	@Column(name = "CONSG_ATTN")
	private String consgAttn;
	
	@Column(name = "CONSG_REF")
	private String consgRef;
	
	@Column(name = "IMP_EXP_LIC")
	private String impExpLic;

	public String getAwbNo() {
		return awbNo;
	}

	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

	public String getShipperAddress1() {
		return shipperAddress1;
	}

	public void setShipperAddress1(String shipperAddress1) {
		this.shipperAddress1 = shipperAddress1;
	}

	public String getShipperAddress2() {
		return shipperAddress2;
	}

	public void setShipperAddress2(String shipperAddress2) {
		this.shipperAddress2 = shipperAddress2;
	}

	public String getShipperAddress3() {
		return shipperAddress3;
	}

	public void setShipperAddress3(String shipperAddress3) {
		this.shipperAddress3 = shipperAddress3;
	}

	public String getShipperPhone() {
		return shipperPhone;
	}

	public void setShipperPhone(String shipperPhone) {
		this.shipperPhone = shipperPhone;
	}

	public String getShipperFax() {
		return shipperFax;
	}

	public void setShipperFax(String shipperFax) {
		this.shipperFax = shipperFax;
	}

	public String getShipperZipCode() {
		return shipperZipCode;
	}

	public void setShipperZipCode(String shipperZipCode) {
		this.shipperZipCode = shipperZipCode;
	}

	public String getShipperCountry() {
		return shipperCountry;
	}

	public void setShipperCountry(String shipperCountry) {
		this.shipperCountry = shipperCountry;
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

	public String getConsgZipCode() {
		return consgZipCode;
	}

	public void setConsgZipCode(String consgZipCode) {
		this.consgZipCode = consgZipCode;
	}

	public String getConsgCountry() {
		return consgCountry;
	}

	public void setConsgCountry(String consgCountry) {
		this.consgCountry = consgCountry;
	}

	public String getConsgAttn() {
		return consgAttn;
	}

	public void setConsgAttn(String consgAttn) {
		this.consgAttn = consgAttn;
	}

	public String getConsgRef() {
		return consgRef;
	}

	public void setConsgRef(String consgRef) {
		this.consgRef = consgRef;
	}

	public String getImpExpLic() {
		return impExpLic;
	}

	public void setImpExpLic(String impExpLic) {
		this.impExpLic = impExpLic;
	}

	@Override
	public String toString() {
		return "BookDetail [awbNo=" + awbNo + ", shipperAddress1=" + shipperAddress1 + ", shipperAddress2="
				+ shipperAddress2 + ", shipperAddress3=" + shipperAddress3 + ", shipperPhone=" + shipperPhone
				+ ", shipperFax=" + shipperFax + ", shipperZipCode=" + shipperZipCode + ", shipperCountry="
				+ shipperCountry + ", consgAddress1=" + consgAddress1 + ", consgAddress2=" + consgAddress2
				+ ", consgAddress3=" + consgAddress3 + ", consgPhone=" + consgPhone + ", consgFax=" + consgFax
				+ ", consgZipCode=" + consgZipCode + ", consgCountry=" + consgCountry + ", consgAttn=" + consgAttn
				+ ", consgRef=" + consgRef + ", impExpLic=" + impExpLic + "]";
	}	
}
