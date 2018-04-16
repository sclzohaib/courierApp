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

	private String getRutNo() {
		return rutNo;
	}

	private void setRutNo(String rutNo) {
		this.rutNo = rutNo;
	}

	private String getDscrp() {
		return dscrp;
	}

	private void setDscrp(String dscrp) {
		this.dscrp = dscrp;
	}

	private String getRutTypNo() {
		return rutTypNo;
	}

	private void setRutTypNo(String rutTypNo) {
		this.rutTypNo = rutTypNo;
	}

	private String getPikTimNo() {
		return pikTimNo;
	}

	private void setPikTimNo(String pikTimNo) {
		this.pikTimNo = pikTimNo;
	}

	private String getDelTimNo() {
		return delTimNo;
	}

	private void setDelTimNo(String delTimNo) {
		this.delTimNo = delTimNo;
	}

	private String getCityNo() {
		return cityNo;
	}

	private void setCityNo(String cityNo) {
		this.cityNo = cityNo;
	}

	private long getPikRate() {
		return pikRate;
	}

	private void setPikRate(long pikRate) {
		this.pikRate = pikRate;
	}

	private long getDelRate() {
		return delRate;
	}

	private void setDelRate(long delRate) {
		this.delRate = delRate;
	}

	private String getRemarks() {
		return remarks;
	}

	private void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	private String getStat() {
		return stat;
	}

	private void setStat(String stat) {
		this.stat = stat;
	}

	private String getSaleTrty() {
		return saleTrty;
	}

	private void setSaleTrty(String saleTrty) {
		this.saleTrty = saleTrty;
	}

	@Override
	public String toString() {
		return "Route [rutNo=" + rutNo + ", dscrp=" + dscrp + ", rutTypNo=" + rutTypNo + ", pikTimNo=" + pikTimNo
				+ ", delTimNo=" + delTimNo + ", cityNo=" + cityNo + ", pikRate=" + pikRate + ", delRate=" + delRate
				+ ", remarks=" + remarks + ", stat=" + stat + ", saleTrty=" + saleTrty + "]";
	}	
	
	

}
