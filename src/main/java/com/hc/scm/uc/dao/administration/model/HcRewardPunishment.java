package com.hc.scm.uc.dao.administration.model;
/**
 * Description: 奖惩管理 view
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
public class HcRewardPunishment {
	private  String  rewardPunishCode;//奖惩编码 
	private  String  employCode;//员工
	private  String  employName;//员工
	
	private  String  compCode;//公司
	private  String  compName;//公司
	private  String  deptCode;//部门
	
	private  String  dept;//部门
	private  String  position;//职位
	private  String  rewardPunishSpec;//奖惩种类
	
	private  String  rewardPunSpecAccTo;//奖惩依据
	private  String  drawByCode;//提请人
	private  String  drawBy;//提请人
	
	private  String  locaDeptCode;//所在部门提请人
	private  String  locaDept;//所在部门
	private  String  registerDate;//登记日期
	
	private  String  rewardPunishReason;//奖惩原因
	private  String  remark;//
	
	
	public String getRewardPunishCode() {
		return rewardPunishCode;
	}
	public void setRewardPunishCode(String rewardPunishCode) {
		this.rewardPunishCode = rewardPunishCode;
	}
	public String getEmployCode() {
		return employCode;
	}
	public void setEmployCode(String employCode) {
		this.employCode = employCode;
	}
	public String getEmployName() {
		return employName;
	}
	public void setEmployName(String employName) {
		this.employName = employName;
	}
	public String getCompCode() {
		return compCode;
	}
	public void setCompCode(String compCode) {
		this.compCode = compCode;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getRewardPunishSpec() {
		return rewardPunishSpec;
	}
	public void setRewardPunishSpec(String rewardPunishSpec) {
		this.rewardPunishSpec = rewardPunishSpec;
	}
	public String getRewardPunSpecAccTo() {
		return rewardPunSpecAccTo;
	}
	public void setRewardPunSpecAccTo(String rewardPunSpecAccTo) {
		this.rewardPunSpecAccTo = rewardPunSpecAccTo;
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
	public String getLocaDeptCode() {
		return locaDeptCode;
	}
	public void setLocaDeptCode(String locaDeptCode) {
		this.locaDeptCode = locaDeptCode;
	}
	public String getLocaDept() {
		return locaDept;
	}
	public void setLocaDept(String locaDept) {
		this.locaDept = locaDept;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	public String getRewardPunishReason() {
		return rewardPunishReason;
	}
	public void setRewardPunishReason(String rewardPunishReason) {
		this.rewardPunishReason = rewardPunishReason;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
