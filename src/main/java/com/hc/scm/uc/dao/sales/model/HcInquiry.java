package com.hc.scm.uc.dao.sales.model;
/**
 * Description: 询价管理 view
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
public class HcInquiry {
	private  String  inquCode;//询价编码
	private  String  inquDate;//询价日期
	private  String  custCode;//客户
	
	private  String  custName;//客户
	private  String  custTel;//客户电话
	private  String  custAddr;//客户地址
	
	private  String  custContactByCode;//客户联系人
	private  String  custContactBy;//客户联系人
	private  String  custContactByTel;//客户联系人电话
	
	private  String  custContactByEmail;//客户联系人邮箱
	private  String  custContactByPhone;//客户联系人移动电话
	private  String  notifierCode;//通知人
	
	private  String  notifierName;//通知人
	private  String  remark;//
	
	
	public String getInquCode() {
		return inquCode;
	}
	public void setInquCode(String inquCode) {
		this.inquCode = inquCode;
	}
	public String getInquDate() {
		return inquDate;
	}
	public void setInquDate(String inquDate) {
		this.inquDate = inquDate;
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
	public String getCustTel() {
		return custTel;
	}
	public void setCustTel(String custTel) {
		this.custTel = custTel;
	}
	public String getCustAddr() {
		return custAddr;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	public String getCustContactByCode() {
		return custContactByCode;
	}
	public void setCustContactByCode(String custContactByCode) {
		this.custContactByCode = custContactByCode;
	}
	public String getCustContactBy() {
		return custContactBy;
	}
	public void setCustContactBy(String custContactBy) {
		this.custContactBy = custContactBy;
	}
	public String getCustContactByTel() {
		return custContactByTel;
	}
	public void setCustContactByTel(String custContactByTel) {
		this.custContactByTel = custContactByTel;
	}
	public String getCustContactByEmail() {
		return custContactByEmail;
	}
	public void setCustContactByEmail(String custContactByEmail) {
		this.custContactByEmail = custContactByEmail;
	}
	public String getCustContactByPhone() {
		return custContactByPhone;
	}
	public void setCustContactByPhone(String custContactByPhone) {
		this.custContactByPhone = custContactByPhone;
	}
	public String getNotifierCode() {
		return notifierCode;
	}
	public void setNotifierCode(String notifierCode) {
		this.notifierCode = notifierCode;
	}
	public String getNotifierName() {
		return notifierName;
	}
	public void setNotifierName(String notifierName) {
		this.notifierName = notifierName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
