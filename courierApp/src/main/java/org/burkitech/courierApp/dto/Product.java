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

	@Column(name = "EXP_DAT")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date expDate;

	@Column(name = "STAT")
	private String stat;

	@Column(name = "STAT_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date statDate;

	@Column(name = "REMARKS")
	private String remarks;

	@Column(name = "GL_CODE")
	private String glCode;

	@Column(name = "CHK_DGT")
	private String chkDgt;

	@Column(name = "OVRD_RATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date ovrdDate;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPartFlag() {
		return partFlag;
	}

	public void setPartFlag(String partFlag) {
		this.partFlag = partFlag;
	}

	public long getCommPrct() {
		return commPrct;
	}

	public void setCommPrct(long commPrct) {
		this.commPrct = commPrct;
	}

	public long getPartAmount() {
		return partAmount;
	}

	public void setPartAmount(long partAmount) {
		this.partAmount = partAmount;
	}

	public long getGst() {
		return gst;
	}

	public void setGst(long gst) {
		this.gst = gst;
	}

	public String getExclusive() {
		return exclusive;
	}

	public void setExclusive(String exclusive) {
		this.exclusive = exclusive;
	}

	public Date getAppDate() {
		return appDate;
	}

	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public Date getStatDate() {
		return statDate;
	}

	public void setStatDate(Date statDate) {
		this.statDate = statDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getGlCode() {
		return glCode;
	}

	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}

	public String getChkDgt() {
		return chkDgt;
	}

	public void setChkDgt(String chkDgt) {
		this.chkDgt = chkDgt;
	}

	public Date getOvrdDate() {
		return ovrdDate;
	}

	public void setOvrdDate(Date ovrdDate) {
		this.ovrdDate = ovrdDate;
	}

	@Override
	public String toString() {
		return "Product [Id=" + Id + ", description=" + description + ", partFlag=" + partFlag + ", commPrct="
				+ commPrct + ", partAmount=" + partAmount + ", gst=" + gst + ", exclusive=" + exclusive + ", appDate="
				+ appDate + ", expDate=" + expDate + ", stat=" + stat + ", statDate=" + statDate + ", remarks="
				+ remarks + ", glCode=" + glCode + ", chkDgt=" + chkDgt + ", ovrdDate=" + ovrdDate + "]";
	}
}
