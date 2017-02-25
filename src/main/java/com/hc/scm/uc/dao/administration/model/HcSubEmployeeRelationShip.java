package com.hc.scm.uc.dao.administration.model;
/**
 * Description: 员工家庭关系管理子表 view
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
public class HcSubEmployeeRelationShip {
	private  String  id;//id
	private  String  membersId;//家庭成员ID
	private  String  name;//姓名
	
	private  String  relationship;//关系
	private  String  workUnits;//工作单位
	private  String  holdOffice;//担任职位
	
	private  String  contactPhone;//联系电话
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMembersId() {
		return membersId;
	}

	public void setMembersId(String membersId) {
		this.membersId = membersId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getWorkUnits() {
		return workUnits;
	}

	public void setWorkUnits(String workUnits) {
		this.workUnits = workUnits;
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
