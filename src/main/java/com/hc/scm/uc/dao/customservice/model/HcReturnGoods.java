package com.hc.scm.uc.dao.customservice.model;
/**
 * Description: 退货管理 view
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
public class HcReturnGoods {
	private  String  returnGoodsCode;//退货单编码
	private  String  inChargeByCode;//责任人
	private  String  inChargeByName;//责任人
	
	private  String  subject;//主题
	private  String  custCode;//客户
	private  String  custName;//客户
	
	private  String  currency;//货币 
	private  String  returnGoodsDate;//退货日期
	private  String  remark;//
	
	
	public String getReturnGoodsCode() {
		return returnGoodsCode;
	}
	public void setReturnGoodsCode(String returnGoodsCode) {
		this.returnGoodsCode = returnGoodsCode;
	}
	public String getInChargeByCode() {
		return inChargeByCode;
	}
	public void setInChargeByCode(String inChargeByCode) {
		this.inChargeByCode = inChargeByCode;
	}
	public String getInChargeByName() {
		return inChargeByName;
	}
	public void setInChargeByName(String inChargeByName) {
		this.inChargeByName = inChargeByName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
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
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getReturnGoodsDate() {
		return returnGoodsDate;
	}
	public void setReturnGoodsDate(String returnGoodsDate) {
		this.returnGoodsDate = returnGoodsDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
