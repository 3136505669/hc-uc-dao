package com.hc.scm.uc.dao.sales.model;
/**
 * Description: 合同管理子表 view
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
public class HcSubContract {
	private  String  id;//
	private  String  prodCode;//产品
	private  String  prodName;//产品
	
	private  String  typeModel;//型号规格
	private  String  prodDesc;//产品描述
	private  String  custType;//客户型号
	
	private  String  qty;//数量 
	private  String  unit;//单位
	private  String  univalent;//单价 
	
	private  String  currency;//货币
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
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
