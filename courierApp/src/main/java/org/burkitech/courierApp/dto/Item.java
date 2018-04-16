package org.burkitech.courierApp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CS_ITEM")
public class Item {

	@Id
	@Column(name = "ITEM_CODE")
	private String itemCode;
	
	@Column(name = "CLASS_CODE")
	private String classCode;
	
	@Column(name = "GL_CODE")
	private String glCode;

	@Column(name = "PRFRD_VEND")
	private String prfrdVend;
	
	@Column(name = "LOC_CODE")
	private String locationCode;
	
	@Column(name = "UOM")
	private String uom;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "SELL_PRICE")
	private long sellPrice;
	
	@Column(name = "AVG_PUR_RATE")
	private long avgPurRate;
	
	@Column(name = "ITEM_STAT")
	private String itemStat;
	
	@Column(name = "OPEN_QTY")
	private long openQuantity;
	
	@Column(name = "RE_ORD_LVL")
	private long reOrderLevel;
	
	@Column(name = "MAX_ORD_QTY")
	private long maxOrderQuantity;
	
	@Column(name = "YTD_REC")
	private long ytdRec;
	
	@Column(name = "YTD_ISU")
	private long ytdIsu;
	
	@Column(name = "LAST_ISU_DATE")
	private Date lastIsuDate;
	
	public Date getLastIsuDate() {
		return lastIsuDate;
	}

	public void setLastIsuDate(Date lastIsuDate) {
		this.lastIsuDate = lastIsuDate;
	}

	@Column(name = "EMP_ID")
	private String employeeId;
	
	@Column(name = "CITY_CODE")
	private String cityCode;

	private String getItemCode() {
		return itemCode;
	}

	private void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	private String getClassCode() {
		return classCode;
	}

	private void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	private String getGlCode() {
		return glCode;
	}

	private void setGlCode(String glCode) {
		this.glCode = glCode;
	}

	private String getPrfrdVend() {
		return prfrdVend;
	}

	private void setPrfrdVend(String prfrdVend) {
		this.prfrdVend = prfrdVend;
	}

	private String getLocationCode() {
		return locationCode;
	}

	private void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	private String getUom() {
		return uom;
	}

	private void setUom(String uom) {
		this.uom = uom;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private long getSellPrice() {
		return sellPrice;
	}

	private void setSellPrice(long sellPrice) {
		this.sellPrice = sellPrice;
	}

	private long getAvgPurRate() {
		return avgPurRate;
	}

	private void setAvgPurRate(long avgPurRate) {
		this.avgPurRate = avgPurRate;
	}

	private String getItemStat() {
		return itemStat;
	}

	private void setItemStat(String itemStat) {
		this.itemStat = itemStat;
	}

	private long getOpenQuantity() {
		return openQuantity;
	}

	private void setOpenQuantity(long openQuantity) {
		this.openQuantity = openQuantity;
	}

	private long getReOrderLevel() {
		return reOrderLevel;
	}

	private void setReOrderLevel(long reOrderLevel) {
		this.reOrderLevel = reOrderLevel;
	}

	private long getMaxOrderQuantity() {
		return maxOrderQuantity;
	}

	private void setMaxOrderQuantity(long maxOrderQuantity) {
		this.maxOrderQuantity = maxOrderQuantity;
	}

	private long getYtdRec() {
		return ytdRec;
	}

	private void setYtdRec(long ytdRec) {
		this.ytdRec = ytdRec;
	}

	private long getYtdIsu() {
		return ytdIsu;
	}

	private void setYtdIsu(long ytdIsu) {
		this.ytdIsu = ytdIsu;
	}

	private String getEmployeeId() {
		return employeeId;
	}

	private void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	private String getCityCode() {
		return cityCode;
	}

	private void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", classCode=" + classCode + ", glCode=" + glCode + ", prfrdVend="
				+ prfrdVend + ", locationCode=" + locationCode + ", uom=" + uom + ", name=" + name + ", sellPrice="
				+ sellPrice + ", avgPurRate=" + avgPurRate + ", itemStat=" + itemStat + ", openQuantity=" + openQuantity
				+ ", reOrderLevel=" + reOrderLevel + ", maxOrderQuantity=" + maxOrderQuantity + ", ytdRec=" + ytdRec
				+ ", ytdIsu=" + ytdIsu + ", lastIsuDate=" + lastIsuDate + ", employeeId=" + employeeId + ", cityCode="
				+ cityCode + "]";
	}
	
	
}
