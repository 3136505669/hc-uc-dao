package com.hc.scm.uc.dao.sales.model;
/**
 * Description: 样品管理 view
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
public class HcSample {
	private  String  sampleCode;//样品单编码 
	private  String  perLiableCode;//责任人
	private  String  perLiableName;//责任人
	
	private  String  warehouseCode;//仓库
	private  String  warehouseName;//仓库
	private  String  custCode;//客户
	
	private  String  custName;//客户
	private  String  takDelivAddr;//收货地址
	private  String  contactByCode;//联系人
	
	private  String  contactBy;//联系人
	private  String  contactTel;//联系电话
	private  String  registerDate;//登记日期 
	
	private  String  sampleCurrency;//样品货币
	private  String  transportMode;//运输方式
	private  String  delivDate;//发货日期
	
	private  String  freight;//运费
	private  String  insurance;//保险
	private  String  adHocRequest;//特别要求
	
	private  String  remark;//
	
	
	public String getSampleCode() {
		return sampleCode;
	}

	public void setSampleCode(String sampleCode) {
		this.sampleCode = sampleCode;
	}

	public String getPerLiableCode() {
		return perLiableCode;
	}

	public void setPerLiableCode(String perLiableCode) {
		this.perLiableCode = perLiableCode;
	}

	public String getPerLiableName() {
		return perLiableName;
	}

	public void setPerLiableName(String perLiableName) {
		this.perLiableName = perLiableName;
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

	public String getContactByCode() {
		return contactByCode;
	}

	public void setContactByCode(String contactByCode) {
		this.contactByCode = contactByCode;
	}

	public String getContactBy() {
		return contactBy;
	}

	public void setContactBy(String contactBy) {
		this.contactBy = contactBy;
	}

	public String getContactTel() {
		return contactTel;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getSampleCurrency() {
		return sampleCurrency;
	}

	public void setSampleCurrency(String sampleCurrency) {
		this.sampleCurrency = sampleCurrency;
	}

	public String getTransportMode() {
		return transportMode;
	}

	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}

	public String getDelivDate() {
		return delivDate;
	}

	public void setDelivDate(String delivDate) {
		this.delivDate = delivDate;
	}

	public String getFreight() {
		return freight;
	}

	public void setFreight(String freight) {
		this.freight = freight;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public String getAdHocRequest() {
		return adHocRequest;
	}

	public void setAdHocRequest(String adHocRequest) {
		this.adHocRequest = adHocRequest;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	
}
