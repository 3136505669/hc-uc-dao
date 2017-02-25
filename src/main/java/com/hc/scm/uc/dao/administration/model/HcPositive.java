package com.hc.scm.uc.dao.administration.model;
/**
 * Description: 转正申请管理 view
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
public class HcPositive {
	private  String  positApplyCode;//转正申请编码
	private  String  PositiEmploCode;//转正员工
	private  String  PositiEmploName;//转正员工
	
	private  String  drawByCode;//提请人
	private  String  drawBy;//提请人
	private  String  position;//职位
	
	private  String  toGangDate;//到岗日期
	private  String  applyDate;//申请日期
	private  String  shouPosiDate;//应转正日期
	
	private  String  posiApplyContents;//转正申请内容
	private  String  positiveState;//转正状态 
	private  String  remark;//
	
	
	public String getPositApplyCode() {
		return positApplyCode;
	}
	public void setPositApplyCode(String positApplyCode) {
		this.positApplyCode = positApplyCode;
	}
	public String getPositiEmploCode() {
		return PositiEmploCode;
	}
	public void setPositiEmploCode(String positiEmploCode) {
		PositiEmploCode = positiEmploCode;
	}
	public String getPositiEmploName() {
		return PositiEmploName;
	}
	public void setPositiEmploName(String positiEmploName) {
		PositiEmploName = positiEmploName;
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
	public String getToGangDate() {
		return toGangDate;
	}
	public void setToGangDate(String toGangDate) {
		this.toGangDate = toGangDate;
	}
	public String getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}
	public String getShouPosiDate() {
		return shouPosiDate;
	}
	public void setShouPosiDate(String shouPosiDate) {
		this.shouPosiDate = shouPosiDate;
	}
	public String getPosiApplyContents() {
		return posiApplyContents;
	}
	public void setPosiApplyContents(String posiApplyContents) {
		this.posiApplyContents = posiApplyContents;
	}
	public String getPositiveState() {
		return positiveState;
	}
	public void setPositiveState(String positiveState) {
		this.positiveState = positiveState;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
