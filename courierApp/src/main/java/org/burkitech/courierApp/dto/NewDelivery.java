package org.burkitech.courierApp.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.collections.FactoryUtils;
import org.apache.commons.collections.list.LazyList;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "NEW_DELIVERY_MASTER")
public class NewDelivery {
	@Id
	@Column(name = "SHEET_NO")
	private Long sheetNo;
	
	@Column(name = "ROUTE")
	private Long route;

	@Column(name = "TRANSPORT")
	private String transport;
	
	@Column(name = "PRODUCT")
	private Long product;
	
	@Column(name = "DLV_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date deliveryDate;
	
	@Column(name = "COURIER")
	private Long courier;
	
	@Column(name = "STATION")
	private String station;
	
	@Column(name = "SLOT")
	private String slot;
	
	@Column(name = "SHEET_TYPE")
	private String sheetType;
//	private List<NewDeliveryDetail> deliveryDetails = LazyList.decorate(new ArrayList<NewDeliveryDetail>(),FactoryUtils.instantiateFactory(NewDeliveryDetail.class));

	public Long getSheetNo() {
		return sheetNo;
	}

	public void setSheetNo(Long sheetNo) {
		this.sheetNo = sheetNo;
	}

	public Long getRoute() {
		return route;
	}

	public void setRoute(Long route) {
		this.route = route;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public Long getProduct() {
		return product;
	}

	public void setProduct(Long product) {
		this.product = product;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Long getCourier() {
		return courier;
	}

	public void setCourier(Long courier) {
		this.courier = courier;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}

	public String getSheetType() {
		return sheetType;
	}

	public void setSheetType(String sheetType) {
		this.sheetType = sheetType;
	}
	
}
