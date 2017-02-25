package com.hc.scm.uc.dao.administration.model;
/**
 * Description: 商品编码申请管理 view
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
public class HcGoodsNoApply {
	private  String  goodsNoApplCode;//商品编码申请单编码
	private  String  applyEmployCode;//申请员工
	private  String  applyEmployName;//申请员工
	
	private  String  locationDeptCode;//所在部门
	private  String  locationDept;//所在部门
	private  String  applyDate;//申请日期
	
	private  String  goodsCode;//物品
	private  String  goodsName;//物品
	private  String  theLargeAssortment;//所属大分类
	
	private  String  specModel;//规格型号
	private  String  specParameters;//具体参数
	private  String  colour;//颜色
	
	private  String  sizeStructure;//尺寸结构
	private  String  venderCode;//厂家
	private  String  venderName;//厂家
	
	private  String  imageLog;//图片
	private  String  remark;//
	
	
	public String getGoodsNoApplCode() {
		return goodsNoApplCode;
	}
	public void setGoodsNoApplCode(String goodsNoApplCode) {
		this.goodsNoApplCode = goodsNoApplCode;
	}
	public String getApplyEmployCode() {
		return applyEmployCode;
	}
	public void setApplyEmployCode(String applyEmployCode) {
		this.applyEmployCode = applyEmployCode;
	}
	public String getApplyEmployName() {
		return applyEmployName;
	}
	public void setApplyEmployName(String applyEmployName) {
		this.applyEmployName = applyEmployName;
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
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getTheLargeAssortment() {
		return theLargeAssortment;
	}
	public void setTheLargeAssortment(String theLargeAssortment) {
		this.theLargeAssortment = theLargeAssortment;
	}
	public String getSpecModel() {
		return specModel;
	}
	public void setSpecModel(String specModel) {
		this.specModel = specModel;
	}
	public String getSpecParameters() {
		return specParameters;
	}
	public void setSpecParameters(String specParameters) {
		this.specParameters = specParameters;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getSizeStructure() {
		return sizeStructure;
	}
	public void setSizeStructure(String sizeStructure) {
		this.sizeStructure = sizeStructure;
	}
	public String getVenderCode() {
		return venderCode;
	}
	public void setVenderCode(String venderCode) {
		this.venderCode = venderCode;
	}
	public String getVenderName() {
		return venderName;
	}
	public void setVenderName(String venderName) {
		this.venderName = venderName;
	}
	public String getImageLog() {
		return imageLog;
	}
	public void setImageLog(String imageLog) {
		this.imageLog = imageLog;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
