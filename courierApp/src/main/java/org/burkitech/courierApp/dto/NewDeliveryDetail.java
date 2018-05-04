package org.burkitech.courierApp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "delivery_detail")
public class NewDeliveryDetail {
	@Id
	@Column(name = "delivery_sht_no")
	private String id;

	private String item;

	@Column(name = "rec_name")
	private String reciever;

	@Column(name = "rec_time")
	private String recieveTime;

	@Column(name = "delivery_status")
	private char status;
}
