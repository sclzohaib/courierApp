package org.burkitech.courierApp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CS_ITEMS")
public class Items {

	@Id
	@Column(name = "AWB_NO")
	private String awbNo;
	
	@Column(name = "ITEM_CODE")
	private String itemCode;
	
	@Column(name = "QTY")
	private long qty;
	
	@Column(name = "CHARGES")
	private long charges;
	
	@Column(name = "DELIVERY_CHARGES")
	private long deliveryCharges;

	@Column(name = "SP_RATE")
	private long sprate;

	@Column(name = "ITEMS_CALLDATE")
	private Date itemsCalldate;

	public Date getItemsCalldate() {
		return itemsCalldate;
	}

	public void setItemsCalldate(Date itemsCalldate) {
		this.itemsCalldate = itemsCalldate;
	}

	public String getAwbNo() {
		return awbNo;
	}

	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public long getQty() {
		return qty;
	}

	public void setQty(long qty) {
		this.qty = qty;
	}

	public long getCharges() {
		return charges;
	}

	public void setCharges(long charges) {
		this.charges = charges;
	}

	public long getDeliveryCharges() {
		return deliveryCharges;
	}

	public void setDeliveryCharges(long deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}

	public long getSprate() {
		return sprate;
	}

	public void setSprate(long sprate) {
		this.sprate = sprate;
	}

	@Override
	public String toString() {
		return "Items [awbNo=" + awbNo + ", itemCode=" + itemCode + ", qty=" + qty + ", charges=" + charges
				+ ", deliveryCharges=" + deliveryCharges + ", sprate=" + sprate + ", itemsCalldate=" + itemsCalldate
				+ "]";
	}
	
	
}
