package org.burkitech.courierApp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "OMS_CNSG_REF")


public class OmsCnsgRef {
	
	@Id
	@Column(name = "AWB_NO")
	private String awNo;
	
	@Column(name = "TTY")
	private String Tty;
	
	@Column(name = "TDATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date tDate;
	
	
	public Date gettDate() {
		return tDate;
	}

	public void settDate(Date tDate) {
		this.tDate = tDate;
	}

	@Column(name = "MODULAS")
	private String modulas;

	@Column(name = "CUR_CNSG_NO")
	private String curCnsgNo;


	public String getAwNo() {
		return awNo;
	}

	public void setAwNo(String awNo) {
		this.awNo = awNo;
	}

	public String getTty() {
		return Tty;
	}

	public void setTty(String tty) {
		Tty = tty;
	}

	public String getModulas() {
		return modulas;
	}

	public void setModulas(String modulas) {
		this.modulas = modulas;
	}

	public String getCurCnsgNo() {
		return curCnsgNo;
	}

	public void setCurCnsgNo(String curCnsgNo) {
		this.curCnsgNo = curCnsgNo;
	}

	@Override
	public String toString() {
		return "OmsCnsgRef [awNo=" + awNo + ", Tty=" + Tty + ", tDate=" + tDate + ", modulas=" + modulas
				+ ", curCnsgNo=" + curCnsgNo + "]";
	}
	
	

}
