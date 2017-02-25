package com.hc.scm.uc.dao.administration.model;
/**
 * Description: 内部签呈管理 view
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
public class HcInsidePetition {
	private  String  insiPetiCode;//内部签呈编码
	private  String  applyEmployCode;//申请员工
	private  String  applyEmployName;//申请员工
	
	private  String  locationDeptCode;//所在部门
	private  String  locationDept;//所在部门
	private  String  applyDate;//申请日期
	
	private  String  dense;//密级
	private  String  urgenTimeLimit;//缓急时限
	private  String  fileName;//文件名称
	
	private  String  fileSend;//文件递送
	private  String  postTo;//张贴至
	private  String  forwardTo;//转发至
	
	private  String  ccTo;//抄送至
	private  String  circulatTo;//传阅至
	private  String  emailTo;//Email至
	
	private  String  content;//内容
	private  String  remark;//
	
	
	public String getInsiPetiCode() {
		return insiPetiCode;
	}
	public void setInsiPetiCode(String insiPetiCode) {
		this.insiPetiCode = insiPetiCode;
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
	public String getDense() {
		return dense;
	}
	public void setDense(String dense) {
		this.dense = dense;
	}
	public String getUrgenTimeLimit() {
		return urgenTimeLimit;
	}
	public void setUrgenTimeLimit(String urgenTimeLimit) {
		this.urgenTimeLimit = urgenTimeLimit;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileSend() {
		return fileSend;
	}
	public void setFileSend(String fileSend) {
		this.fileSend = fileSend;
	}
	public String getPostTo() {
		return postTo;
	}
	public void setPostTo(String postTo) {
		this.postTo = postTo;
	}
	public String getForwardTo() {
		return forwardTo;
	}
	public void setForwardTo(String forwardTo) {
		this.forwardTo = forwardTo;
	}
	public String getCcTo() {
		return ccTo;
	}
	public void setCcTo(String ccTo) {
		this.ccTo = ccTo;
	}
	public String getCirculatTo() {
		return circulatTo;
	}
	public void setCirculatTo(String circulatTo) {
		this.circulatTo = circulatTo;
	}
	public String getEmailTo() {
		return emailTo;
	}
	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
