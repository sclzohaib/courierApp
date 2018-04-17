package org.burkitech.courierApp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

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
	@DateTimeFormat(pattern = "yyyy-MM-dd")
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

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getGlCode() {
		return glCode;
	}

	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}

	public String getPrfrdVend() {
		return prfrdVend;
	}

	public void setPrfrdVend(String prfrdVend) {
		this.prfrdVend = prfrdVend;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(long sellPrice) {
		this.sellPrice = sellPrice;
	}

	public long getAvgPurRate() {
		return avgPurRate;
	}

	public void setAvgPurRate(long avgPurRate) {
		this.avgPurRate = avgPurRate;
	}

	public String getItemStat() {
		return itemStat;
	}

	public void setItemStat(String itemStat) {
		this.itemStat = itemStat;
	}

	public long getOpenQuantity() {
		return openQuantity;
	}

	public void setOpenQuantity(long openQuantity) {
		this.openQuantity = openQuantity;
	}

	public long getReOrderLevel() {
		return reOrderLevel;
	}

	public void setReOrderLevel(long reOrderLevel) {
		this.reOrderLevel = reOrderLevel;
	}

	public long getMaxOrderQuantity() {
		return maxOrderQuantity;
	}

	public void setMaxOrderQuantity(long maxOrderQuantity) {
		this.maxOrderQuantity = maxOrderQuantity;
	}

	public long getYtdRec() {
		return ytdRec;
	}

	public void setYtdRec(long ytdRec) {
		this.ytdRec = ytdRec;
	}

	public long getYtdIsu() {
		return ytdIsu;
	}

	public void setYtdIsu(long ytdIsu) {
		this.ytdIsu = ytdIsu;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
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
