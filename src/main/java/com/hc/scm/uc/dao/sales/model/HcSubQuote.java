package com.hc.scm.uc.dao.sales.model;
/**
 * Description: 报价管理子表 view
 * All rights Reserved, Designed By Hc
 * Copyright:   Copyright(C) 2016-2017
 * Company:     hcsunmo
 * author:      jinxi.li
 * Createdate:  2016年8月21日
 *
 * Modification  History:
 * Date         Author             What
 * ------------------------------------------
 *
 */
public class HcSubQuote {
	private  String  id;//id
	private  String  prodCode;//产品编码
	private  String  prodName;//产品名称
	
	private  String  typeModel;//型号规格
	private  String  qty;//
	private  String  unit;//
	
	private  String  univalent;//单价
	private  String  currency;//货币
	private  String  prodDesc;//产品描述
	
	private  String  brand;//品牌
	private  String  manufCode;//制造商
	private  String  manufName;//制造商
	
	private  String  deliveTime;//货期（交期）
	private  String  remark;//
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getTypeModel() {
		return typeModel;
	}
	public void setTypeModel(String typeModel) {
		this.typeModel = typeModel;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getUnivalent() {
		return univalent;
	}
	public void setUnivalent(String univalent) {
		this.univalent = univalent;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getManufCode() {
		return manufCode;
	}
	public void setManufCode(String manufCode) {
		this.manufCode = manufCode;
	}
	public String getManufName() {
		return manufName;
	}
	public void setManufName(String manufName) {
		this.manufName = manufName;
	}
	public String getDeliveTime() {
		return deliveTime;
	}
	public void setDeliveTime(String deliveTime) {
		this.deliveTime = deliveTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
