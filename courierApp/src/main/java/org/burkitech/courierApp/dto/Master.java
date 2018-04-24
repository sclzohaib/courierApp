package org.burkitech.courierApp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "master")
public class Master {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "master_id")
	private int id;

//	@Column(name = "master_name")
	private String name;
	
	@OneToOne(mappedBy = "master")
	private Detail detail;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Detail getDetail() {
		return detail;
	}

	public void setDetail(Detail detail) {
		this.detail = detail;
	}
	
	
}
