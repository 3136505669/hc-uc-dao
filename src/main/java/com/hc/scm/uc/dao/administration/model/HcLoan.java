package com.hc.scm.uc.dao.administration.model;
/**
 * Description: 借款管理 view
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
public class HcLoan {
	private  String  loanCode;//借款编号[l_menber]
	private  String  loanTheme;//借款主题[l_topic]
	private  String  loanByCode;//借 款 人[l_dept]
	
	private  String  loanBy;//借 款 人
	private  String  loanDate;//借款日期[l_date]
	private  String  loanAmount;//借款金额[l_sqje]
	
	private  String  loanReason;//借款事由[l_purpose]
	private  String  expRepayReimburDate;//预计还款报销日期[remarks]
	private  String  drawByCode;//提 请 人[l_man]
	private  String  drawBy;//提 请 人
	
    private  String  examApprovSituat;//审批情况[l_spqk]
    
    private  String  firstExamAppruserCode;//第一审批用户编码
    private  String  firstExamAppruser;//第一审批用户[l_spman]
    private  String  secondExamAppruserCode;//第二审批[l_fspman]
    
    private  String  secondExamAppruser;//
    private  String  thirdExamAppruserCode;//第三审批[l_firspman]
    private  String  thirdExamAppruser;//
    
    private  String  examApprOpinion;//审批意见[l_spyj]
    
    
	public String getLoanCode() {
		return loanCode;
	}

	public void setLoanCode(String loanCode) {
		this.loanCode = loanCode;
	}

	public String getLoanTheme() {
		return loanTheme;
	}

	public void setLoanTheme(String loanTheme) {
		this.loanTheme = loanTheme;
	}

	public String getLoanByCode() {
		return loanByCode;
	}

	public void setLoanByCode(String loanByCode) {
		this.loanByCode = loanByCode;
	}

	public String getLoanBy() {
		return loanBy;
	}

	public void setLoanBy(String loanBy) {
		this.loanBy = loanBy;
	}

	public String getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
	}

	public String getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanReason() {
		return loanReason;
	}

	public void setLoanReason(String loanReason) {
		this.loanReason = loanReason;
	}

	public String getExpRepayReimburDate() {
		return expRepayReimburDate;
	}

	public void setExpRepayReimburDate(String expRepayReimburDate) {
		this.expRepayReimburDate = expRepayReimburDate;
	}

	public String getDrawByCode() {
		return drawByCode;
	}

	public void setDrawByCode(String drawByCode) {
		this.drawByCode = drawByCode;
	}

	public String getDrawBy() {
		return drawBy;
	}

	public void setDrawBy(String drawBy) {
		this.drawBy = drawBy;
	}

	public String getExamApprovSituat() {
		return examApprovSituat;
	}

	public void setExamApprovSituat(String examApprovSituat) {
		this.examApprovSituat = examApprovSituat;
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

	public String getExamApprOpinion() {
		return examApprOpinion;
	}

	public void setExamApprOpinion(String examApprOpinion) {
		this.examApprOpinion = examApprOpinion;
	}
}
