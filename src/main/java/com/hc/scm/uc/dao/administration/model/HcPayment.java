package com.hc.scm.uc.dao.administration.model;
/**
 * Description: 付款管理 view
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
public class HcPayment {
	private  String  paymentCode;//付款编号[p_menber]
	private  String  paymentDate;//付款日期[p_datetime]
	private  String  applyByCode;//申 请 人[p_man]
	
	private  String  applyBy;//申 请 人
	private  String  applyDeptCode;//申请部门[p_dept]
	private  String  applyDept;//申请部门
	
	private  String  receivOrganiz;//收款单位[p_company]
	private  String  receivAccount;//收款帐户[p_banknumber]
	private  String  bankAccount;//开户银行[p_bankname]
	
	private  String  paymentMode;//付款方式[p_payment]
	private  String  amount;//金额(RMB)[p_je]
	private  String  paymentDesc;//付款说明[p_sm]
	
    private  String  examApprSitu;//审批情况[p_states]
    
    private  String  firstExamAppruserCode;//第一审批用户编码
    private  String  firstExamAppruser;//第一审批用户[p_spman]
    private  String  secondExamAppruserCode;//第二审批[fspman]
    
    private  String  secondExamAppruser;//
    private  String  thirdExamAppruserCode;//第三审批[firspman]
    private  String  thirdExamAppruser;//
    
    private  String  fourthExamAppruserCode;//第四审批[fourspman]
    private  String  fourthExamAppruser;//
    private  String  examApprOpinion;//审批意见[spyj]
    
    
	public String getPaymentCode() {
		return paymentCode;
	}
	public void setPaymentCode(String paymentCode) {
		this.paymentCode = paymentCode;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
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
	public String getApplyDeptCode() {
		return applyDeptCode;
	}
	public void setApplyDeptCode(String applyDeptCode) {
		this.applyDeptCode = applyDeptCode;
	}
	public String getApplyDept() {
		return applyDept;
	}
	public void setApplyDept(String applyDept) {
		this.applyDept = applyDept;
	}
	public String getReceivOrganiz() {
		return receivOrganiz;
	}
	public void setReceivOrganiz(String receivOrganiz) {
		this.receivOrganiz = receivOrganiz;
	}
	public String getReceivAccount() {
		return receivAccount;
	}
	public void setReceivAccount(String receivAccount) {
		this.receivAccount = receivAccount;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getPaymentDesc() {
		return paymentDesc;
	}
	public void setPaymentDesc(String paymentDesc) {
		this.paymentDesc = paymentDesc;
	}
	public String getExamApprSitu() {
		return examApprSitu;
	}
	public void setExamApprSitu(String examApprSitu) {
		this.examApprSitu = examApprSitu;
	}
	public String getFirstExamAppruserCode() {
		return firstExamAppruserCode;
	}
	public void setFirstExamAppruserCode(String firstExamAppruserCode) {
		this.firstExamAppruserCode = firstExamAppruserCode;
	}
	public String getFirstExamAppruser() {
		return firstExamAppruser;
	}
	public void setFirstExamAppruser(String firstExamAppruser) {
		this.firstExamAppruser = firstExamAppruser;
	}
	public String getSecondExamAppruserCode() {
		return secondExamAppruserCode;
	}
	public void setSecondExamAppruserCode(String secondExamAppruserCode) {
		this.secondExamAppruserCode = secondExamAppruserCode;
	}
	public String getSecondExamAppruser() {
		return secondExamAppruser;
	}
	public void setSecondExamAppruser(String secondExamAppruser) {
		this.secondExamAppruser = secondExamAppruser;
	}
	public String getThirdExamAppruserCode() {
		return thirdExamAppruserCode;
	}
	public void setThirdExamAppruserCode(String thirdExamAppruserCode) {
		this.thirdExamAppruserCode = thirdExamAppruserCode;
	}
	public String getThirdExamAppruser() {
		return thirdExamAppruser;
	}
	public void setThirdExamAppruser(String thirdExamAppruser) {
		this.thirdExamAppruser = thirdExamAppruser;
	}
	public String getFourthExamAppruserCode() {
		return fourthExamAppruserCode;
	}
	public void setFourthExamAppruserCode(String fourthExamAppruserCode) {
		this.fourthExamAppruserCode = fourthExamAppruserCode;
	}
	public String getFourthExamAppruser() {
		return fourthExamAppruser;
	}
	public void setFourthExamAppruser(String fourthExamAppruser) {
		this.fourthExamAppruser = fourthExamAppruser;
	}
	public String getExamApprOpinion() {
		return examApprOpinion;
	}
	public void setExamApprOpinion(String examApprOpinion) {
		this.examApprOpinion = examApprOpinion;
	}
	
}
