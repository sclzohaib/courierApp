package org.burkitech.courierApp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CS_HAND_INSTR")
public class HandInstr {

	@Id
	@Column(name = "HND_ID")
	private String Id;
	
	@Column(name = "DESCRIPTION")
	private String description;

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

	@Override
	public String toString() {
		return "HandInstr [hndId=" + Id + ", description=" + description + "]";
	}
	
	
}
