package com.hc.scm.uc.dao.administration.model;
/**
 * Description: 员工经历管理子表 view
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
public class HcSubEmployeeExperience {
    private  String  id;//id
    private  String  experienceId;//工作經歷ID
    private  String  startDate;//开始时间
    
    private  String  endDate;//终止时间
    private  String  workUnitsDept;//工作单位及部门
    private  String  holdOffice;//担任职务
    
    private  String  contactPhone;//联系电话
    
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getExperienceId() {
		return experienceId;
	}

	public void setExperienceId(String experienceId) {
		this.experienceId = experienceId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getWorkUnitsDept() {
		return workUnitsDept;
	}

	public void setWorkUnitsDept(String workUnitsDept) {
		this.workUnitsDept = workUnitsDept;
	}

	public String getHoldOffice() {
		return holdOffice;
	}

	public void setHoldOffice(String holdOffice) {
		this.holdOffice = holdOffice;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
}
