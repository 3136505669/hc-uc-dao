package com.hc.scm.uc.dao.administration.model;
/**
 * Description: 办公用品管理 view
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
public class HcOfficeSupplies {
	private  String  offSupplCode;//办公用品编码[number]
	private  String  applyByCode;//申 请 人
	private  String  applyBy;//申 请 人[man]
	
	private  String  applyDate;//申请日期[datetime]
	private  String  applyForByCode;//申 领 人
	private  String  applyForBy;//申 领 人[coname]
	
	private  String  contactByCode;//联 系 人[senddate]
	private  String  contactBy;//联 系 人
	private  String  contactTel;//联系电话[pay_if]
	
	private  String  category;//类　　别[pay_je]
	private  String  currency;//货　　币[money]
	private  String  examineandapproveByCode;//审 批 人[l_spman]
	
	private  String  examineandapproveBy;//审 批 人
	private  String  remark;//[remarks]
	
	
	public String getOffSupplCode() {
		return offSupplCode;
	}
	public void setOffSupplCode(String offSupplCode) {
		this.offSupplCode = offSupplCode;
	}
	public String getApplyByCode() {
		return applyByCode;
	}
	public void setApplyByCode(String applyByCode) {
		this.applyByCode = applyByCode;
	}
	public String getApplyBy() {
		return applyBy;
	}
	public void setApplyBy(String applyBy) {
		this.applyBy = applyBy;
	}
	public String getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}
	public String getApplyForByCode() {
		return applyForByCode;
	}
	public void setApplyForByCode(String applyForByCode) {
		this.applyForByCode = applyForByCode;
	}
	public String getApplyForBy() {
		return applyForBy;
	}
	public void setApplyForBy(String applyForBy) {
		this.applyForBy = applyForBy;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getExamineandapproveByCode() {
		return examineandapproveByCode;
	}
	public void setExamineandapproveByCode(String examineandapproveByCode) {
		this.examineandapproveByCode = examineandapproveByCode;
	}
	public String getExamineandapproveBy() {
		return examineandapproveBy;
	}
	public void setExamineandapproveBy(String examineandapproveBy) {
		this.examineandapproveBy = examineandapproveBy;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
