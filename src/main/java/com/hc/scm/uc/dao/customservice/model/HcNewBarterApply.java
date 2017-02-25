package com.hc.scm.uc.dao.customservice.model;
/**
 * Description:新品换货管理 view
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
public class HcNewBarterApply {
	private  String  newBarApplyCode;//新品换货申请单编码 
	private  String  applyEmployeeCode;//申请员工
	private  String  applyEmployeeName;//申请员工

	private  String  locationDeptCode;//所在部门
	private  String  locationDept;//所在部门
	private  String  applyDate;//申请日期
	
	private  String  fromCompCode;//从哪个公司编码
	private  String  fromCompName;//从哪个公司编码
	private  String  toCompCode;//到哪个公司
	
	private  String  toCompName;//到哪个公司
	private  String  fromCompTel;//从哪个公司联系电话
	private  String  fromCompFax;//从哪个公司联系传真
	
	private  String  fromCompAddr;//从哪个公司地址
	private  String  fromCompZip;//从哪个公司邮编
	private  String  fromCompContastByCode;//从哪个公司联系人
	
	private  String  fromCompContastBy;//从哪个公司联系人
	private  String  toCompTel;//到哪个公司联系电话
	private  String  toCompFax;//到哪个公司联系传真
	
	private  String  toCompZip;//到哪个公司邮编
	private  String  toCompContastByCode;//到哪个公司联系人
	private  String  toCompContastBy;//到哪个公司联系人
	
	private  String  piOrderNo;//PI单号
	private  String  consigneeDate;//收件日期
	private  String  salesDate;//销货日期
	
	private  String  checkoutDate;//检验日期
	private  String  PhenomenonDesc;//现象描述
	private  String  conclusion;//结论
	
	private  String  techOpinion;//技术工程师意见
	private  String  managerOpinion;//分公司经理意见
	private  String  chargeOpinion;//总公司技术主管意见
	
	private  String  orNotGetBad;//是否收到坏品
	private  String  opHandleOpinion;//OP处理意见
	private  String  remark;//
	
	
	public String getNewBarApplyCode() {
		return newBarApplyCode;
	}
	public void setNewBarApplyCode(String newBarApplyCode) {
		this.newBarApplyCode = newBarApplyCode;
	}
	public String getApplyEmployeeCode() {
		return applyEmployeeCode;
	}
	public void setApplyEmployeeCode(String applyEmployeeCode) {
		this.applyEmployeeCode = applyEmployeeCode;
	}
	public String getApplyEmployeeName() {
		return applyEmployeeName;
	}
	public void setApplyEmployeeName(String applyEmployeeName) {
		this.applyEmployeeName = applyEmployeeName;
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
	public String getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}
	public String getFromCompCode() {
		return fromCompCode;
	}
	public void setFromCompCode(String fromCompCode) {
		this.fromCompCode = fromCompCode;
	}
	public String getFromCompName() {
		return fromCompName;
	}
	public void setFromCompName(String fromCompName) {
		this.fromCompName = fromCompName;
	}
	public String getToCompCode() {
		return toCompCode;
	}
	public void setToCompCode(String toCompCode) {
		this.toCompCode = toCompCode;
	}
	public String getToCompName() {
		return toCompName;
	}
	public void setToCompName(String toCompName) {
		this.toCompName = toCompName;
	}
	public String getFromCompTel() {
		return fromCompTel;
	}
	public void setFromCompTel(String fromCompTel) {
		this.fromCompTel = fromCompTel;
	}
	public String getFromCompFax() {
		return fromCompFax;
	}
	public void setFromCompFax(String fromCompFax) {
		this.fromCompFax = fromCompFax;
	}
	public String getFromCompAddr() {
		return fromCompAddr;
	}
	public void setFromCompAddr(String fromCompAddr) {
		this.fromCompAddr = fromCompAddr;
	}
	public String getFromCompZip() {
		return fromCompZip;
	}
	public void setFromCompZip(String fromCompZip) {
		this.fromCompZip = fromCompZip;
	}
	public String getFromCompContastByCode() {
		return fromCompContastByCode;
	}
	public void setFromCompContastByCode(String fromCompContastByCode) {
		this.fromCompContastByCode = fromCompContastByCode;
	}
	public String getFromCompContastBy() {
		return fromCompContastBy;
	}
	public void setFromCompContastBy(String fromCompContastBy) {
		this.fromCompContastBy = fromCompContastBy;
	}
	public String getToCompTel() {
		return toCompTel;
	}
	public void setToCompTel(String toCompTel) {
		this.toCompTel = toCompTel;
	}
	public String getToCompFax() {
		return toCompFax;
	}
	public void setToCompFax(String toCompFax) {
		this.toCompFax = toCompFax;
	}
	public String getToCompZip() {
		return toCompZip;
	}
	public void setToCompZip(String toCompZip) {
		this.toCompZip = toCompZip;
	}
	public String getToCompContastByCode() {
		return toCompContastByCode;
	}
	public void setToCompContastByCode(String toCompContastByCode) {
		this.toCompContastByCode = toCompContastByCode;
	}
	public String getToCompContastBy() {
		return toCompContastBy;
	}
	public void setToCompContastBy(String toCompContastBy) {
		this.toCompContastBy = toCompContastBy;
	}
	public String getPiOrderNo() {
		return piOrderNo;
	}
	public void setPiOrderNo(String piOrderNo) {
		this.piOrderNo = piOrderNo;
	}
	public String getConsigneeDate() {
		return consigneeDate;
	}
	public void setConsigneeDate(String consigneeDate) {
		this.consigneeDate = consigneeDate;
	}
	public String getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(String salesDate) {
		this.salesDate = salesDate;
	}
	public String getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(String checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public String getPhenomenonDesc() {
		return PhenomenonDesc;
	}
	public void setPhenomenonDesc(String phenomenonDesc) {
		PhenomenonDesc = phenomenonDesc;
	}
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	public String getTechOpinion() {
		return techOpinion;
	}
	public void setTechOpinion(String techOpinion) {
		this.techOpinion = techOpinion;
	}
	public String getManagerOpinion() {
		return managerOpinion;
	}
	public void setManagerOpinion(String managerOpinion) {
		this.managerOpinion = managerOpinion;
	}
	public String getChargeOpinion() {
		return chargeOpinion;
	}
	public void setChargeOpinion(String chargeOpinion) {
		this.chargeOpinion = chargeOpinion;
	}
	public String getOrNotGetBad() {
		return orNotGetBad;
	}
	public void setOrNotGetBad(String orNotGetBad) {
		this.orNotGetBad = orNotGetBad;
	}
	public String getOpHandleOpinion() {
		return opHandleOpinion;
	}
	public void setOpHandleOpinion(String opHandleOpinion) {
		this.opHandleOpinion = opHandleOpinion;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
