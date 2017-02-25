package com.hc.scm.uc.dao.administration.model;
/**
 * Description: 辞职管理 view
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
public class HcResign {
	private  String  resignCode;//辞职单编码
	private  String  resignByCode;//辞职人
	private  String  resignByName;//辞职人
	
	private  String  resignType;//辞职类别
	private  String  perReasons;//个人原因
	private  String  drawByCode;//提请人
	
	private  String  drawByName;//提请人
	private  String  resignDate;//辞职时间 
	private  String  resignReason;//辞职事由
	
	private  String  remark;//
	
	
	public String getResignCode() {
		return resignCode;
	}

	public void setResignCode(String resignCode) {
		this.resignCode = resignCode;
	}

	public String getResignByCode() {
		return resignByCode;
	}

	public void setResignByCode(String resignByCode) {
		this.resignByCode = resignByCode;
	}

	public String getResignByName() {
		return resignByName;
	}

	public void setResignByName(String resignByName) {
		this.resignByName = resignByName;
	}

	public String getResignType() {
		return resignType;
	}

	public void setResignType(String resignType) {
		this.resignType = resignType;
	}

	public String getPerReasons() {
		return perReasons;
	}

	public void setPerReasons(String perReasons) {
		this.perReasons = perReasons;
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

	public String getResignDate() {
		return resignDate;
	}

	public void setResignDate(String resignDate) {
		this.resignDate = resignDate;
	}

	public String getResignReason() {
		return resignReason;
	}

	public void setResignReason(String resignReason) {
		this.resignReason = resignReason;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	
}
