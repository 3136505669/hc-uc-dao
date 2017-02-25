package com.hc.scm.uc.dao.administration.model;

/**
 * Description: 盖章管理 view
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
public class HcSeal {
	private  String  sealCode;//盖章单编码 
	private  String  borrowDeptCode;//借用部门
	private  String  borrowDept;//借用部门
	
	private  String  handleByCode;//经办人
	private  String  handleByName;//经办人
	private  String  borrowIndiaByCode;//借印人
	
	private  String  borrowIndiaByName;//借印人
	private  String  loanDate;//借出时间 
	private  String  useTerm;//使用期限
	
	private  String  borrowIndiaType;//借印类别
	private  String  imporContentDesc;//重要内容说明
	private  String  useScope;//使用范围
	
	private  String  indiaPromise;//用印承诺
	private  String  indiaContent;//用印内容
	private  String  indiaWitnByCode;//用印见证人
	
	private  String  indiaWitnBy;//用印见证人
	private  String  remark;//
	
	
	public String getSealCode() {
		return sealCode;
	}
	public void setSealCode(String sealCode) {
		this.sealCode = sealCode;
	}
	public String getBorrowDeptCode() {
		return borrowDeptCode;
	}
	public void setBorrowDeptCode(String borrowDeptCode) {
		this.borrowDeptCode = borrowDeptCode;
	}
	public String getBorrowDept() {
		return borrowDept;
	}
	public void setBorrowDept(String borrowDept) {
		this.borrowDept = borrowDept;
	}
	public String getHandleByCode() {
		return handleByCode;
	}
	public void setHandleByCode(String handleByCode) {
		this.handleByCode = handleByCode;
	}
	public String getHandleByName() {
		return handleByName;
	}
	public void setHandleByName(String handleByName) {
		this.handleByName = handleByName;
	}
	public String getBorrowIndiaByCode() {
		return borrowIndiaByCode;
	}
	public void setBorrowIndiaByCode(String borrowIndiaByCode) {
		this.borrowIndiaByCode = borrowIndiaByCode;
	}
	public String getBorrowIndiaByName() {
		return borrowIndiaByName;
	}
	public void setBorrowIndiaByName(String borrowIndiaByName) {
		this.borrowIndiaByName = borrowIndiaByName;
	}
	public String getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
	}
	public String getUseTerm() {
		return useTerm;
	}
	public void setUseTerm(String useTerm) {
		this.useTerm = useTerm;
	}
	public String getBorrowIndiaType() {
		return borrowIndiaType;
	}
	public void setBorrowIndiaType(String borrowIndiaType) {
		this.borrowIndiaType = borrowIndiaType;
	}
	public String getImporContentDesc() {
		return imporContentDesc;
	}
	public void setImporContentDesc(String imporContentDesc) {
		this.imporContentDesc = imporContentDesc;
	}
	public String getUseScope() {
		return useScope;
	}
	public void setUseScope(String useScope) {
		this.useScope = useScope;
	}
	public String getIndiaPromise() {
		return indiaPromise;
	}
	public void setIndiaPromise(String indiaPromise) {
		this.indiaPromise = indiaPromise;
	}
	public String getIndiaContent() {
		return indiaContent;
	}
	public void setIndiaContent(String indiaContent) {
		this.indiaContent = indiaContent;
	}
	public String getIndiaWitnByCode() {
		return indiaWitnByCode;
	}
	public void setIndiaWitnByCode(String indiaWitnByCode) {
		this.indiaWitnByCode = indiaWitnByCode;
	}
	public String getIndiaWitnBy() {
		return indiaWitnBy;
	}
	public void setIndiaWitnBy(String indiaWitnBy) {
		this.indiaWitnBy = indiaWitnBy;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
