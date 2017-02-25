package com.hc.scm.uc.dao.administration.model;
/**
 * Description: 佣金管理-主表
 * All rights Reserved, Designed Byhcopyright:   Copyright(C) 2016-2017
 * Company:     hc.
 * @author:     jinxi.li
 * @date:  2017年02月25日
 * @version 1.0.0
 */
public class HcCommission {
   private  String  commiApplyCode;//佣金申请单编码
   private  String  applyEmployCode;//申请员工编码
   private  String  applyEmployName;//申请员工名称
   
   private  String  locationDeptCode;//所在部门编码
   private  String  locationDept;//所在部门名称
   private  String  applyDate;//申请日期
   
   private  String  businessId;//业务成交情况ID
   private  String  commApplyReason;//申请佣金原因
   private  String  commCollectByContent;//佣金收取人情况内容(含姓名、职位等)
   
   private  String  commPaymentMode;//佣金支付方式
   private  String  paymentBank;//收款银行
   private  String  commPaymentDate;//佣金申请支付日期
   
   private  String  commPaymentedDate;//佣金实际支付日期
   private  String  remark;//备注
   
    public String getCommiApplyCode() {
		return commiApplyCode;
	}
	public void setCommiApplyCode(String commiApplyCode) {
		this.commiApplyCode = commiApplyCode;
	}
	public String getApplyEmployCode() {
		return applyEmployCode;
	}
	public void setApplyEmployCode(String applyEmployCode) {
		this.applyEmployCode = applyEmployCode;
	}
	public String getApplyEmployName() {
		return applyEmployName;
	}
	public void setApplyEmployName(String applyEmployName) {
		this.applyEmployName = applyEmployName;
	}
	public String getLocationDeptCode() {
		return locationDeptCode;
	}
	public void setLocationDeptCode(String locationDeptCode) {
		this.locationDeptCode = locationDeptCode;
	}
	public String getLocationDept() {
		return locationDept;
	}
	public void setLocationDept(String locationDept) {
		this.locationDept = locationDept;
	}
	public String getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getCommApplyReason() {
		return commApplyReason;
	}
	public void setCommApplyReason(String commApplyReason) {
		this.commApplyReason = commApplyReason;
	}
	public String getCommCollectByContent() {
		return commCollectByContent;
	}
	public void setCommCollectByContent(String commCollectByContent) {
		this.commCollectByContent = commCollectByContent;
	}
	public String getCommPaymentMode() {
		return commPaymentMode;
	}
	public void setCommPaymentMode(String commPaymentMode) {
		this.commPaymentMode = commPaymentMode;
	}
	public String getPaymentBank() {
		return paymentBank;
	}
	public void setPaymentBank(String paymentBank) {
		this.paymentBank = paymentBank;
	}
	public String getCommPaymentDate() {
		return commPaymentDate;
	}
	public void setCommPaymentDate(String commPaymentDate) {
		this.commPaymentDate = commPaymentDate;
	}
	public String getCommPaymentedDate() {
		return commPaymentedDate;
	}
	public void setCommPaymentedDate(String commPaymentedDate) {
		this.commPaymentedDate = commPaymentedDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
