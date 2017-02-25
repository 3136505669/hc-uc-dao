package com.hc.scm.uc.dao.administration.model;
/**
 * Description: 报销管理 view
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
public class HcReimbursement {
	private  String  reimburCode;//报销编号  [l_menber]
	private  String  drawByCode;//提 请 人  [l_coname]
	private  String  drawByName;//提 请 人
	
	private  String  exacct;//费用科目[l_topic]
	private  String  reimburByCode;//报 销 人   [l_man]
	private  String  reimburBy;//报 销 人
	
	private  String  reimburDeptCode;//报销部门[l_dept]
	private  String  reimburDept;//报销部门
	private  String  reimburDate;//报销日期[l_date]
	
	private  String  reimburAmount;//报销金额[l_payje]
	private  String  ApplicaDesc;//用途说明[l_purpose]
	
	
    private  String  examApprovSituat;//审批情况[l_spqk]
    
    private  String  firstExamAppruserCode;//第一审批用户编码
    private  String  firstExamAppruser;//第一审批用户[l_spman]
    private  String  secondExamAppruserCode;//第二审批
    
    private  String  secondExamAppruser;//[l_fspman]
    private  String  thirdExamAppruserCode;//第三审批
    private  String  thirdExamAppruser;//[l_firspman]
    
    private  String  examApprOpinion;//审批意见[l_spyj]
    private  String  remark;//[remarks]
    
    
	public String getReimburCode() {
		return reimburCode;
	}
	public void setReimburCode(String reimburCode) {
		this.reimburCode = reimburCode;
	}
	public String getDrawByCode() {
		return drawByCode;
	}
	public void setDrawByCode(String drawByCode) {
		this.drawByCode = drawByCode;
	}
	public String getDrawByName() {
		return drawByName;
	}
	public void setDrawByName(String drawByName) {
		this.drawByName = drawByName;
	}
	public String getExacct() {
		return exacct;
	}
	public void setExacct(String exacct) {
		this.exacct = exacct;
	}
	public String getReimburByCode() {
		return reimburByCode;
	}
	public void setReimburByCode(String reimburByCode) {
		this.reimburByCode = reimburByCode;
	}
	public String getReimburBy() {
		return reimburBy;
	}
	public void setReimburBy(String reimburBy) {
		this.reimburBy = reimburBy;
	}
	public String getReimburDeptCode() {
		return reimburDeptCode;
	}
	public void setReimburDeptCode(String reimburDeptCode) {
		this.reimburDeptCode = reimburDeptCode;
	}
	public String getReimburDept() {
		return reimburDept;
	}
	public void setReimburDept(String reimburDept) {
		this.reimburDept = reimburDept;
	}
	public String getReimburDate() {
		return reimburDate;
	}
	public void setReimburDate(String reimburDate) {
		this.reimburDate = reimburDate;
	}
	public String getReimburAmount() {
		return reimburAmount;
	}
	public void setReimburAmount(String reimburAmount) {
		this.reimburAmount = reimburAmount;
	}
	public String getApplicaDesc() {
		return ApplicaDesc;
	}
	public void setApplicaDesc(String applicaDesc) {
		ApplicaDesc = applicaDesc;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
