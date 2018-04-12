package org.burkitech.courierApp.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "menifest")
public class MenifestDetail {

	private String id;
	private String item;
	private Long quantity;
	private Long weight;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Long getWeight() {
		return weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}	
}
