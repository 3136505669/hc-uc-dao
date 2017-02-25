package com.hc.scm.uc.dao.administration.model;
/**
 * Description: 任务管理 view
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
public class HcTask {
	private  String  taskCode;//任务编码[rwnumber]
	private  String  issuedTaskDate;//下达任务日期[rwdate]
	private  String  finishTaskDate;//任务完成日期[fdate]
	
	private  String  taskSubject;//任务主题[rwcontent]
	private  String  taskContent;//任务内容[rwnr]
	private  String  taskRespByCode;//任务负责人[rwzman]
	
	private  String  taskRespBy;//任务负责人
	private  String  taskInvolvByCode;//任务参与人[rwman]
	private  String  taskInvolvBy;//任务参与人
	
	private  String  associatedByCode;//关联着 [rwgman]
	private  String  associatedBy;//关联着 
	private  String  issuedTaskByCode;//下达任务者[man]

	private  String  issuedTaskBy;//下达任务者
	private  String  taskFinSituation;//任务完成情况[rwjg]
	private  String  remart;//[remark]
	
	
	public String getTaskCode() {
		return taskCode;
	}
	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}
	public String getIssuedTaskDate() {
		return issuedTaskDate;
	}
	public void setIssuedTaskDate(String issuedTaskDate) {
		this.issuedTaskDate = issuedTaskDate;
	}
	public String getFinishTaskDate() {
		return finishTaskDate;
	}
	public void setFinishTaskDate(String finishTaskDate) {
		this.finishTaskDate = finishTaskDate;
	}
	public String getTaskSubject() {
		return taskSubject;
	}
	public void setTaskSubject(String taskSubject) {
		this.taskSubject = taskSubject;
	}
	public String getTaskContent() {
		return taskContent;
	}
	public void setTaskContent(String taskContent) {
		this.taskContent = taskContent;
	}
	public String getTaskRespByCode() {
		return taskRespByCode;
	}
	public void setTaskRespByCode(String taskRespByCode) {
		this.taskRespByCode = taskRespByCode;
	}
	public String getTaskRespBy() {
		return taskRespBy;
	}
	public void setTaskRespBy(String taskRespBy) {
		this.taskRespBy = taskRespBy;
	}
	public String getTaskInvolvByCode() {
		return taskInvolvByCode;
	}
	public void setTaskInvolvByCode(String taskInvolvByCode) {
		this.taskInvolvByCode = taskInvolvByCode;
	}
	public String getTaskInvolvBy() {
		return taskInvolvBy;
	}
	public void setTaskInvolvBy(String taskInvolvBy) {
		this.taskInvolvBy = taskInvolvBy;
	}
	public String getAssociatedByCode() {
		return associatedByCode;
	}
	public void setAssociatedByCode(String associatedByCode) {
		this.associatedByCode = associatedByCode;
	}
	public String getAssociatedBy() {
		return associatedBy;
	}
	public void setAssociatedBy(String associatedBy) {
		this.associatedBy = associatedBy;
	}
	public String getIssuedTaskByCode() {
		return issuedTaskByCode;
	}
	public void setIssuedTaskByCode(String issuedTaskByCode) {
		this.issuedTaskByCode = issuedTaskByCode;
	}
	public String getIssuedTaskBy() {
		return issuedTaskBy;
	}
	public void setIssuedTaskBy(String issuedTaskBy) {
		this.issuedTaskBy = issuedTaskBy;
	}
	public String getTaskFinSituation() {
		return taskFinSituation;
	}
	public void setTaskFinSituation(String taskFinSituation) {
		this.taskFinSituation = taskFinSituation;
	}
	public String getRemart() {
		return remart;
	}
	public void setRemart(String remart) {
		this.remart = remart;
	}
	
}
