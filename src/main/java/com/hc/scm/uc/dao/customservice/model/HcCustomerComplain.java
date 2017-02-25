package com.hc.scm.uc.dao.customservice.model;
/**
 * Description: 客户投诉管理 view
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
public class HcCustomerComplain {
	private  String  custComplainCode;//客户投诉单编码
	private  String  custComplainName;//客户投诉单主题
	private  String  complainType;//投诉类别
	
	private  String  complainLevel;//投诉等级
	private  String  currentState;//当前状态
	private  String  complainDate;//投诉日期
	
	private  String  invoiceNo;//发票号
	private  String  batchNo;//批号
	private  String  orderNo;//订单号
	
	private  String  pactNo;//合同号
	private  String  prodCode;//产品
	private  String  prodName;//产品
	
	private  String  prodModel;//产品
	private  String  qty;//数量
	private  String  unit;//单位 
	
	private  String  qualityStrd;//质量标准
	private  String  transportStrd;//运输标准
	private  String  supplierCode;//供应商
	
	private  String  supplierName;//供应商
	private  String  suppliDelivDate;//供应商发货日期
	private  String  custCode;//客户
	
	private  String  custName;//客户
	private  String  delivDate;//发货日期
	private  String  complainContent;//投诉内容
	
	private  String  registerByCode;//登记人
	private  String  registerBy;//登记人
	private  String  registerDate;//登记日期
	
	private  String  answerForByCode;//责任人
	private  String  answerForBy;//责任人
	private  String  remark;//
	
	
	public String getCustComplainCode() {
		return custComplainCode;
	}
	public void setCustComplainCode(String custComplainCode) {
		this.custComplainCode = custComplainCode;
	}
	public String getCustComplainName() {
		return custComplainName;
	}
	public void setCustComplainName(String custComplainName) {
		this.custComplainName = custComplainName;
	}
	public String getComplainType() {
		return complainType;
	}
	public void setComplainType(String complainType) {
		this.complainType = complainType;
	}
	public String getComplainLevel() {
		return complainLevel;
	}
	public void setComplainLevel(String complainLevel) {
		this.complainLevel = complainLevel;
	}
	public String getCurrentState() {
		return currentState;
	}
	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
	public String getComplainDate() {
		return complainDate;
	}
	public void setComplainDate(String complainDate) {
		this.complainDate = complainDate;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getPactNo() {
		return pactNo;
	}
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
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
	public String getProdModel() {
		return prodModel;
	}
	public void setProdModel(String prodModel) {
		this.prodModel = prodModel;
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
	public String getQualityStrd() {
		return qualityStrd;
	}
	public void setQualityStrd(String qualityStrd) {
		this.qualityStrd = qualityStrd;
	}
	public String getTransportStrd() {
		return transportStrd;
	}
	public void setTransportStrd(String transportStrd) {
		this.transportStrd = transportStrd;
	}
	public String getSupplierCode() {
		return supplierCode;
	}
	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSuppliDelivDate() {
		return suppliDelivDate;
	}
	public void setSuppliDelivDate(String suppliDelivDate) {
		this.suppliDelivDate = suppliDelivDate;
	}
	public String getCustCode() {
		return custCode;
	}
	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getDelivDate() {
		return delivDate;
	}
	public void setDelivDate(String delivDate) {
		this.delivDate = delivDate;
	}
	public String getComplainContent() {
		return complainContent;
	}
	public void setComplainContent(String complainContent) {
		this.complainContent = complainContent;
	}
	public String getRegisterByCode() {
		return registerByCode;
	}
	public void setRegisterByCode(String registerByCode) {
		this.registerByCode = registerByCode;
	}
	public String getRegisterBy() {
		return registerBy;
	}
	public void setRegisterBy(String registerBy) {
		this.registerBy = registerBy;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	public String getAnswerForByCode() {
		return answerForByCode;
	}
	public void setAnswerForByCode(String answerForByCode) {
		this.answerForByCode = answerForByCode;
	}
	public String getAnswerForBy() {
		return answerForBy;
	}
	public void setAnswerForBy(String answerForBy) {
		this.answerForBy = answerForBy;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
