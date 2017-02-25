package com.hc.scm.uc.dao.administration.model;
/**
 * Description: 佣金管理子表 view
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
public class HcSubCommission {
   private  String  id;//id
   private  String  businessId;//业务成交情况id
   private  String  CustCode;//客户编码
   
   private  String  CustName;//客户名称
   private  String  piNo;//PI单号
   private  String  nameOfaPart;//品名
   
   private  String  amount;//单价
   private  String  amountUnit;//金额单位
   private  String  qty;//数量
   
   private  String  qtyUnit;//数量单位
   private  String  commission;//佣金
   private  String  remark;//备注
   
   public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getCustCode() {
		return CustCode;
	}
	public void setCustCode(String custCode) {
		CustCode = custCode;
	}
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public String getPiNo() {
		return piNo;
	}
	public void setPiNo(String piNo) {
		this.piNo = piNo;
	}
	public String getNameOfaPart() {
		return nameOfaPart;
	}
	public void setNameOfaPart(String nameOfaPart) {
		this.nameOfaPart = nameOfaPart;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmountUnit() {
		return amountUnit;
	}
	public void setAmountUnit(String amountUnit) {
		this.amountUnit = amountUnit;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getQtyUnit() {
		return qtyUnit;
	}
	public void setQtyUnit(String qtyUnit) {
		this.qtyUnit = qtyUnit;
	}
	public String getCommission() {
		return commission;
	}
	public void setCommission(String commission) {
		this.commission = commission;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
