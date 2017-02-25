package com.hc.scm.uc.dao.administration.model;
/**
 * Description: 外出管理 view
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
public class HcEgress {
    private  String  egressCode;//外出单编码[l_menber]
    private  String  egressEmployId;//外出员工id[man]
    private  String  egressEmployName;//外出员工姓名
    
    private  String  drawByCode;//提请人编码[l_man]
    private  String  drawBy;//提请人
    private  String  applyDate;//申请日期[l_date]
    
    private  String  custCode;//客户编码[l_role]
    private  String  custName;//客户名称
    private  String  custAddr;//客户地址[l_zz_date]
    
    private  String  custContactByCode;//客户联系人编码
    private  String  custContactBy;//客户联系人[l_dg_date]
    private  String  custContactTel;//客户联系电话
    
    private  String  businessProcess;//事务处理状况
    private  String  egressDate;//外出时间[l_wcsj]
    private  String  reservaReturnDate;//预定返回时间[l_ydfhsj]
    
    private  String  practReturnDate;//实际返回时间[l_sjfhsj]
    private  String  businProcStatus;//事务处理状况[remarks]
    private  String  examApprSitu;//审批情况[l_spqk]
    
    private  String  firstExamAppruserCode;//第一审批用户编码
    private  String  firstExamAppruser;//第一审批用户[l_spman]
    private  String  secondExamAppruserCode;//第二审批[l_fspman]
    
    private  String  secondExamAppruser;//
    private  String  thirdExamAppruserCode;//第三审批[l_firspman]
    private  String  thirdExamAppruser;//
    
    private  String  examApprOpinion;//审批意见[l_spyj]
    
    
    public String getEgressCode() {
		return egressCode;
	}

	public void setEgressCode(String egressCode) {
		this.egressCode = egressCode;
	}

	public String getEgressEmployId() {
		return egressEmployId;
	}

	public void setEgressEmployId(String egressEmployId) {
		this.egressEmployId = egressEmployId;
	}

	public String getEgressEmployName() {
		return egressEmployName;
	}

	public void setEgressEmployName(String egressEmployName) {
		this.egressEmployName = egressEmployName;
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

	public String getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
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

	public String getCustContactTel() {
		return custContactTel;
	}

	public void setCustContactTel(String custContactTel) {
		this.custContactTel = custContactTel;
	}

	public String getBusinessProcess() {
		return businessProcess;
	}

	public void setBusinessProcess(String businessProcess) {
		this.businessProcess = businessProcess;
	}

	public String getEgressDate() {
		return egressDate;
	}

	public void setEgressDate(String egressDate) {
		this.egressDate = egressDate;
	}

	public String getReservaReturnDate() {
		return reservaReturnDate;
	}

	public void setReservaReturnDate(String reservaReturnDate) {
		this.reservaReturnDate = reservaReturnDate;
	}

	public String getPractReturnDate() {
		return practReturnDate;
	}

	public void setPractReturnDate(String practReturnDate) {
		this.practReturnDate = practReturnDate;
	}

	public String getBusinProcStatus() {
		return businProcStatus;
	}

	public void setBusinProcStatus(String businProcStatus) {
		this.businProcStatus = businProcStatus;
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

	public String getExamApprOpinion() {
		return examApprOpinion;
	}

	public void setExamApprOpinion(String examApprOpinion) {
		this.examApprOpinion = examApprOpinion;
	}

	
}
