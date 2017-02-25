package com.hc.scm.uc.dao.administration.model;
/**
 * Description: 日程管理
 * All rights Reserved, Designed Byhcopyright:   Copyright(C) 2016-2017
 * Company:     hc.
 * @author:     jinxi.li
 * @date:  2017年02月25日
 * @version 1.0.0
 */
public class HcAgendaForDay {
     private  String   agendaForDayCode;//日程編碼
	 private  String   agendaForDayType;//日程类型[actypes]
     private  String   agendaForDayName;//日程名称[coname]

     private  String   agendaForDayEmployCode;//员工编码
     private  String   agendaForDayEmploy;//员工名称[name]
     private  String   startDate;//开始时间[clewtime]
     
     private  String   endDate;//结束时间[ytime]
     private  String   orNotRemind;//是否提醒[iftx]
     private  String   remindDate;//提醒时间[txtime]
     
     private  String   locationDeptCode;//所在部门编码[state]
     private  String   locationDept;//所在部门名称
     private  String   orNotShare;//是否共享[pri]
     
     private  String   agendaForDayDescribe;//日程描述 [descripta]
     private  String   remark;//备注[remark]
     
        public String getAgendaForDayCode() {
 		    return agendaForDayCode;
	 	}
	 	public void setAgendaForDayCode(String agendaForDayCode) {
	 		this.agendaForDayCode = agendaForDayCode;
	 	}
	 	public String getAgendaForDayType() {
	 		return agendaForDayType;
	 	}
	 	public void setAgendaForDayType(String agendaForDayType) {
	 		this.agendaForDayType = agendaForDayType;
	 	}
	 	public String getAgendaForDayName() {
	 		return agendaForDayName;
	 	}
	 	public void setAgendaForDayName(String agendaForDayName) {
	 		this.agendaForDayName = agendaForDayName;
	 	}
	 	public String getAgendaForDayEmployCode() {
	 		return agendaForDayEmployCode;
	 	}
	 	public void setAgendaForDayEmployCode(String agendaForDayEmployCode) {
	 		this.agendaForDayEmployCode = agendaForDayEmployCode;
	 	}
	 	public String getAgendaForDayEmploy() {
	 		return agendaForDayEmploy;
	 	}
	 	public void setAgendaForDayEmploy(String agendaForDayEmploy) {
	 		this.agendaForDayEmploy = agendaForDayEmploy;
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
	 	public String getOrNotRemind() {
	 		return orNotRemind;
	 	}
	 	public void setOrNotRemind(String orNotRemind) {
	 		this.orNotRemind = orNotRemind;
	 	}
	 	public String getRemindDate() {
	 		return remindDate;
	 	}
	 	public void setRemindDate(String remindDate) {
	 		this.remindDate = remindDate;
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
	 	public String getOrNotShare() {
	 		return orNotShare;
	 	}
	 	public void setOrNotShare(String orNotShare) {
	 		this.orNotShare = orNotShare;
	 	}
	 	public String getAgendaForDayDescribe() {
	 		return agendaForDayDescribe;
	 	}
	 	public void setAgendaForDayDescribe(String agendaForDayDescribe) {
	 		this.agendaForDayDescribe = agendaForDayDescribe;
	 	}
	 	public String getRemark() {
	 		return remark;
	 	}
	 	public void setRemark(String remark) {
	 		this.remark = remark;
	 	}
}
