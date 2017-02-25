package com.hc.scm.uc.dao.administration.model;
/**
 * Description: 事物项目管理 view
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
public class HcThingItem {
	private  String  thingItemCode;//事物项目编码
	private  String  projtApprByCode;//立项人
	private  String  projtApprByName;//立项人
	
	private  String  projtApprDate;//立项日期
	private  String  startDate;//开始日期
	private  String  expecCompletDate;//预计完成日期
	
	private  String  projectCode;//项目
	private  String  projectName;//项目
	private  String  urgencyLevel;//紧急程度
	
	private  String  projtPerCharges;//项目负责人
	private  String  partakeBys;//参与人员
	private  String  assistBys;//协助人员
	
	private  String  projtSynopsis;//项目简介
	private  String  remark;//
	public String getThingItemCode() {
		return thingItemCode;
	}
	public void setThingItemCode(String thingItemCode) {
		this.thingItemCode = thingItemCode;
	}
	public String getProjtApprByCode() {
		return projtApprByCode;
	}
	public void setProjtApprByCode(String projtApprByCode) {
		this.projtApprByCode = projtApprByCode;
	}
	public String getProjtApprByName() {
		return projtApprByName;
	}
	public void setProjtApprByName(String projtApprByName) {
		this.projtApprByName = projtApprByName;
	}
	public String getProjtApprDate() {
		return projtApprDate;
	}
	public void setProjtApprDate(String projtApprDate) {
		this.projtApprDate = projtApprDate;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getExpecCompletDate() {
		return expecCompletDate;
	}
	public void setExpecCompletDate(String expecCompletDate) {
		this.expecCompletDate = expecCompletDate;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getUrgencyLevel() {
		return urgencyLevel;
	}
	public void setUrgencyLevel(String urgencyLevel) {
		this.urgencyLevel = urgencyLevel;
	}
	public String getProjtPerCharges() {
		return projtPerCharges;
	}
	public void setProjtPerCharges(String projtPerCharges) {
		this.projtPerCharges = projtPerCharges;
	}
	public String getPartakeBys() {
		return partakeBys;
	}
	public void setPartakeBys(String partakeBys) {
		this.partakeBys = partakeBys;
	}
	public String getAssistBys() {
		return assistBys;
	}
	public void setAssistBys(String assistBys) {
		this.assistBys = assistBys;
	}
	public String getProjtSynopsis() {
		return projtSynopsis;
	}
	public void setProjtSynopsis(String projtSynopsis) {
		this.projtSynopsis = projtSynopsis;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
