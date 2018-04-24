package org.burkitech.courierApp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detail")
public class Detail {
	@Id
	@Column(name = "detail_id")
	private int id;

	@Column(name = "address")
	private String address;
	
	@OneToOne
	@JoinColumn(name = "master_id")
	private Master master;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Master getMaster() {
		return master;
	}

	public void setMaster(Master master) {
		this.master = master;
	}
	
	
}
