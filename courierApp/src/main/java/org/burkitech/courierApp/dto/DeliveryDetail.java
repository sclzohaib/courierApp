package org.burkitech.courierApp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "delivery_detail")
public class DeliveryDetail {
	
	@Column(name = "delivery_sht_no")
	private String id;
	
	private String item;
	
	@Column(name = "rec_name")
	private String reciever;
	
	@Column(name = "rec_time")
	private String recieveTime;
	
	@Column(name = "delivery_status")
	private char status;

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

	public String getReciever() {
		return reciever;
	}

	public void setReciever(String reciever) {
		this.reciever = reciever;
	}

	public String getRecieveTime() {
		return recieveTime;
	}

	public void setRecieveTime(String recieveTime) {
		this.recieveTime = recieveTime;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "DeliveryDetail [id=" + id + ", item=" + item + ", reciever=" + reciever + ", recieveTime=" + recieveTime
				+ ", status=" + status + "]";
	}
	
	
}
