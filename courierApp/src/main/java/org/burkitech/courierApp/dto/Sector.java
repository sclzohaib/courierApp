package org.burkitech.courierApp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "CS_SECTOR")
public class Sector {

	@Id
	@Column(name = "SECTOR_ID")
	private String Id;
	
	@Column(name = "DSCRP")
	private String description;

	@Column(name = "SECT_TYP_NO")
	private String sectorTypeNo;

	@Column(name = "STAT")
	private String stat;
	
	@Column(name = "STAT_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date statDate;
	
	
	public Date getStatDate() {
		return statDate;
	}


	public void setStatDate(Date statDate) {
		this.statDate = statDate;
	}


	@Column(name = "REMARKS")
	private String remarks;


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


	public String getSectorTypeNo() {
		return sectorTypeNo;
	}


	public void setSectorTypeNo(String sectorTypeNo) {
		this.sectorTypeNo = sectorTypeNo;
	}


	public String getStat() {
		return stat;
	}


	public void setStat(String stat) {
		this.stat = stat;
	}

	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	@Override
	public String toString() {
		return "Sector [Id=" + Id + ", description=" + description + ", sectorTypeNo=" + sectorTypeNo + ", stat=" + stat
				+ ", statDate=" + statDate + ", remarks=" + remarks + "]";
	}	

}
