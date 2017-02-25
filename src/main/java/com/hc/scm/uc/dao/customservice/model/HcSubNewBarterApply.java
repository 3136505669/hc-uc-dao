package com.hc.scm.uc.dao.customservice.model;
/**
 * Description: 新品换货管理子表 view
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
public class HcSubNewBarterApply {
	private  String  id;//id
	private  String  model;//型号
	private  String  serialNo;//序列号
	
	private  String  requiBartReason;//要求换货原因
	private  String  jre;//运行环境 
	private  String  buyDate;//购买日期
	
	private  String  remark;//
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getRequiBartReason() {
		return requiBartReason;
	}

	public void setRequiBartReason(String requiBartReason) {
		this.requiBartReason = requiBartReason;
	}

	public String getJre() {
		return jre;
	}

	public void setJre(String jre) {
		this.jre = jre;
	}

	public String getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(String buyDate) {
		this.buyDate = buyDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
