package com.hc.scm.uc.dao.administration.model;
/**
 * Description: 薪资异动管理 view
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
public class HcSalaryPunishment {
	private  String  salaryPunishCode;//薪资异动编码
	private  String  employeeCode;//申请员工
	private  String  employeeName;//申请员工
	
	private  String  drawByCode;//提请人 
	private  String  drawBy;//提请人 
	private  String  position;//职位 
	
	private  String  checkDate;//到职日期
	private  String  applyDate;//申请日期
	private  String  serviDate;//现职日期
	
	private  String  noticeMatters;//通知事项
	private  String  originalSalary;//原来薪资
	private  String  adjustRate;// 调整比率
	
	private  String  adjustAmount;//调整金额
	private  String  adjustedAmount;//调整后薪资
	private  String  desc;//说明
	
	private  String  remark;//
	
	
	public String getSalaryPunishCode() {
		return salaryPunishCode;
	}

	public void setSalaryPunishCode(String salaryPunishCode) {
		this.salaryPunishCode = salaryPunishCode;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}

	public String getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getServiDate() {
		return serviDate;
	}

	public void setServiDate(String serviDate) {
		this.serviDate = serviDate;
	}

	public String getNoticeMatters() {
		return noticeMatters;
	}

	public void setNoticeMatters(String noticeMatters) {
		this.noticeMatters = noticeMatters;
	}

	public String getOriginalSalary() {
		return originalSalary;
	}

	public void setOriginalSalary(String originalSalary) {
		this.originalSalary = originalSalary;
	}

	public String getAdjustRate() {
		return adjustRate;
	}

	public void setAdjustRate(String adjustRate) {
		this.adjustRate = adjustRate;
	}

	public String getAdjustAmount() {
		return adjustAmount;
	}

	public void setAdjustAmount(String adjustAmount) {
		this.adjustAmount = adjustAmount;
	}

	public String getAdjustedAmount() {
		return adjustedAmount;
	}

	public void setAdjustedAmount(String adjustedAmount) {
		this.adjustedAmount = adjustedAmount;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	
}
