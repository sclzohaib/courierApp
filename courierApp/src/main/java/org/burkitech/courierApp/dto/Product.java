package org.burkitech.courierApp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "CS_PRODUCT")
public class Product {

	@Id
	@Column(name = "PROD_ID")
	private String Id;

	@Column(name = "DSCRP")
	private String description;

	@Column(name = "PART_FLAG")
	private String partFlag;

	@Column(name = "COMM_PRCT")
	private long commPrct;

	@Column(name = "PART_AMT")
	private long partAmount;

	@Column(name = "GST")
	private long gst;

	@Column(name = "EXCLSV")
	private String exclusive;

	@Column(name = "APP_DAT")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date appDate;

	private Date getAppDate() {
		return appDate;
	}

	private void setAppDate(Date appDate) {
		this.appDate = appDate;
	}

	@Column(name = "EXP_DAT")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date expDate;

	private Date getExpDate() {
		return expDate;
	}

	private void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	@Column(name = "STAT")
	private String stat;

	@Column(name = "STAT_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date statDate;

	private Date getStatDate() {
		return statDate;
	}

	private void setStatDate(Date statDate) {
		this.statDate = statDate;
	}

	@Column(name = "REMARKS")
	private String remarks;

	@Column(name = "GL_CODE")
	private String glCode;

	@Column(name = "CHK_DGT")
	private String chkDgt;

	@Column(name = "OVRD_RATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date ovrdDate;

	private Date getOvrdDate() {
		return ovrdDate;
	}

	private void setOvrdDate(Date ovrdDate) {
		this.ovrdDate = ovrdDate;
	}

	private String getId() {
		return Id;
	}

	private void setId(String id) {
		Id = id;
	}

	private String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}

	private String getPartFlag() {
		return partFlag;
	}

	private void setPartFlag(String partFlag) {
		this.partFlag = partFlag;
	}

	private long getCommPrct() {
		return commPrct;
	}

	private void setCommPrct(long commPrct) {
		this.commPrct = commPrct;
	}

	private long getPartAmount() {
		return partAmount;
	}

	private void setPartAmount(long partAmount) {
		this.partAmount = partAmount;
	}

	private long getGst() {
		return gst;
	}

	private void setGst(long gst) {
		this.gst = gst;
	}

	private String getExclusive() {
		return exclusive;
	}

	private void setExclusive(String exclusive) {
		this.exclusive = exclusive;
	}

	private String getStat() {
		return stat;
	}

	private void setStat(String stat) {
		this.stat = stat;
	}

	private String getRemarks() {
		return remarks;
	}

	private void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	private String getGlCode() {
		return glCode;
	}

	private void setGlCode(String glCode) {
		this.glCode = glCode;
	}

	private String getChkDgt() {
		return chkDgt;
	}

	private void setChkDgt(String chkDgt) {
		this.chkDgt = chkDgt;
	}

	@Override
	public String toString() {
		return "Product [Id=" + Id + ", description=" + description + ", partFlag=" + partFlag + ", commPrct="
				+ commPrct + ", partAmount=" + partAmount + ", gst=" + gst + ", exclusive=" + exclusive + ", appDate="
				+ appDate + ", expDate=" + expDate + ", stat=" + stat + ", statDate=" + statDate + ", remarks="
				+ remarks + ", glCode=" + glCode + ", chkDgt=" + chkDgt + ", ovrdDate=" + ovrdDate + "]";
	}

}
