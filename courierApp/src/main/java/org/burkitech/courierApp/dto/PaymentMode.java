package org.burkitech.courierApp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CS_PAYMENT_MODE")
public class PaymentMode {

	@Id
	@Column(name = "PAYMENT_CODE")
	private String payCode;

	@Column(name = "DESCRIPTION")
	private String description;

	public String getPayCode() {
		return payCode;
	}

	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "PaymentMode [payCode=" + payCode + ", description=" + description + "]";
	}

}
