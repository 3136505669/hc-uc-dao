package com.hc.scm.uc.dao.sales.model;
/**
 * Description: 订单管理 view
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
public class HcOrder {
	private  String  orderCode;//订单编码 
	private  String  perLiabCode;//责任人
	private  String  perLiabName;//责任人

	private  String  warehouseCode;//仓库
	private  String  warehouseName;//仓库
	private  String  custCode;//客户
	
	private  String  custName;//客户
	private  String  takDelivAddr;//收货地址
	private  String  takDelivByCode;//收货人
	
	private  String  takDelivBy;//收货人
	private  String  contactTel;//联系电话
	private  String  orNotPrepay;//是否预付
	
	private  String  otherCharges;//其它费用
	private  String  invoice;//发票
	private  String  transportMode;//运输方式
	
	private  String  contractCode;//合同编码
	private  String  paymentMode;//付款方式
	private  String  paymentDayQty;//付款天数
	
	private  String  custDelivTime;//客户交期
	private  String  freightBurden;//运费负担 
	private  String  freightSum;//运费金额
	
	private  String  currency;//货币
	private  String  orderDate;//订单日期
	private  String  bank;//银行
	
	private  String  exaApprByCode;//审批人
	private  String  exaApprByName;//审批人
	private  String  remark;//
	
	
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getPerLiabCode() {
		return perLiabCode;
	}
	public void setPerLiabCode(String perLiabCode) {
		this.perLiabCode = perLiabCode;
	}
	public String getPerLiabName() {
		return perLiabName;
	}
	public void setPerLiabName(String perLiabName) {
		this.perLiabName = perLiabName;
	}
	public String getWarehouseCode() {
		return warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public String getWarehouseName() {
		return warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
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
	public String getTakDelivAddr() {
		return takDelivAddr;
	}
	public void setTakDelivAddr(String takDelivAddr) {
		this.takDelivAddr = takDelivAddr;
	}
	public String getTakDelivByCode() {
		return takDelivByCode;
	}
	public void setTakDelivByCode(String takDelivByCode) {
		this.takDelivByCode = takDelivByCode;
	}
	public String getTakDelivBy() {
		return takDelivBy;
	}
	public void setTakDelivBy(String takDelivBy) {
		this.takDelivBy = takDelivBy;
	}
	public String getContactTel() {
		return contactTel;
	}
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}
	public String getOrNotPrepay() {
		return orNotPrepay;
	}
	public void setOrNotPrepay(String orNotPrepay) {
		this.orNotPrepay = orNotPrepay;
	}
	public String getOtherCharges() {
		return otherCharges;
	}
	public void setOtherCharges(String otherCharges) {
		this.otherCharges = otherCharges;
	}
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	public String getTransportMode() {
		return transportMode;
	}
	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}
	public String getContractCode() {
		return contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getPaymentDayQty() {
		return paymentDayQty;
	}
	public void setPaymentDayQty(String paymentDayQty) {
		this.paymentDayQty = paymentDayQty;
	}
	public String getCustDelivTime() {
		return custDelivTime;
	}
	public void setCustDelivTime(String custDelivTime) {
		this.custDelivTime = custDelivTime;
	}
	public String getFreightBurden() {
		return freightBurden;
	}
	public void setFreightBurden(String freightBurden) {
		this.freightBurden = freightBurden;
	}
	public String getFreightSum() {
		return freightSum;
	}
	public void setFreightSum(String freightSum) {
		this.freightSum = freightSum;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getExaApprByCode() {
		return exaApprByCode;
	}
	public void setExaApprByCode(String exaApprByCode) {
		this.exaApprByCode = exaApprByCode;
	}
	public String getExaApprByName() {
		return exaApprByName;
	}
	public void setExaApprByName(String exaApprByName) {
		this.exaApprByName = exaApprByName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
