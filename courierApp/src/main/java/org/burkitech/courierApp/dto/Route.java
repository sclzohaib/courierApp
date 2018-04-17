package org.burkitech.courierApp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CS_ROUTE")
public class Route {

	@Id
	@Column(name = "RUT_NO")
	private String rutNo;

	@Column(name = "DSCRP")
	private String dscrp;

	@Column(name = "RUT_TYP_NO")
	private String rutTypNo;

	@Column(name = "PIK_TIM_NO")
	private String pikTimNo;

	@Column(name = "DEL_TIM_NO")
	private String delTimNo;

	@Column(name = "CITY_NO")
	private String cityNo;

	@Column(name = "PIK_RATE")
	private long pikRate;

	@Column(name = "DEL_RATE")
	private long delRate;

	@Column(name = "REMARKS")
	private String remarks;

	@Column(name = "STAT")
	private String stat;

	@Column(name = "SALE_TRTY")
	private String saleTrty;

	public String getRutNo() {
		return rutNo;
	}

	public void setRutNo(String rutNo) {
		this.rutNo = rutNo;
	}

	public String getDscrp() {
		return dscrp;
	}

	public void setDscrp(String dscrp) {
		this.dscrp = dscrp;
	}

	public String getRutTypNo() {
		return rutTypNo;
	}

	public void setRutTypNo(String rutTypNo) {
		this.rutTypNo = rutTypNo;
	}

	public String getPikTimNo() {
		return pikTimNo;
	}

	public void setPikTimNo(String pikTimNo) {
		this.pikTimNo = pikTimNo;
	}

	public String getDelTimNo() {
		return delTimNo;
	}

	public void setDelTimNo(String delTimNo) {
		this.delTimNo = delTimNo;
	}

	public String getCityNo() {
		return cityNo;
	}

	public void setCityNo(String cityNo) {
		this.cityNo = cityNo;
	}

	public long getPikRate() {
		return pikRate;
	}

	public void setPikRate(long pikRate) {
		this.pikRate = pikRate;
	}

	public long getDelRate() {
		return delRate;
	}

	public void setDelRate(long delRate) {
		this.delRate = delRate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public String getSaleTrty() {
		return saleTrty;
	}

	public void setSaleTrty(String saleTrty) {
		this.saleTrty = saleTrty;
	}

	@Override
	public String toString() {
		return "Route [rutNo=" + rutNo + ", dscrp=" + dscrp + ", rutTypNo=" + rutTypNo + ", pikTimNo=" + pikTimNo
				+ ", delTimNo=" + delTimNo + ", cityNo=" + cityNo + ", pikRate=" + pikRate + ", delRate=" + delRate
				+ ", remarks=" + remarks + ", stat=" + stat + ", saleTrty=" + saleTrty + "]";
	}
}
