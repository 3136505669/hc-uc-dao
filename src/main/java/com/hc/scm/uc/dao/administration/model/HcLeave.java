package com.hc.scm.uc.dao.administration.model;
/**
 * Description: 请假管理 view
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
public class HcLeave {
	private  String  leaveCode;//请假单编码 
	private  String  leaveByCode;//请假人
	private  String  leaveByName;//请假人
	
	private  String  leaveType;//请假类别 
	private  String  drawByCode;//提请人
	private  String  drawByName;//提请人
	
	private  String  leaveStartDate;//请假开始时间
	private  String  leaveEndDate;//结束时间
	private  String  totalLeaveDate;//总共请假时间
	
	private  String  leaveReason;//请假事由
	private  String  remark;//
	
	
	public String getLeaveCode() {
		return leaveCode;
	}
	public void setLeaveCode(String leaveCode) {
		this.leaveCode = leaveCode;
	}
	public String getLeaveByCode() {
		return leaveByCode;
	}
	public void setLeaveByCode(String leaveByCode) {
		this.leaveByCode = leaveByCode;
	}
	public String getLeaveByName() {
		return leaveByName;
	}
	public void setLeaveByName(String leaveByName) {
		this.leaveByName = leaveByName;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
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
	public String getLeaveStartDate() {
		return leaveStartDate;
	}
	public void setLeaveStartDate(String leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}
	public String getLeaveEndDate() {
		return leaveEndDate;
	}
	public void setLeaveEndDate(String leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}
	public String getTotalLeaveDate() {
		return totalLeaveDate;
	}
	public void setTotalLeaveDate(String totalLeaveDate) {
		this.totalLeaveDate = totalLeaveDate;
	}
	public String getLeaveReason() {
		return leaveReason;
	}
	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
