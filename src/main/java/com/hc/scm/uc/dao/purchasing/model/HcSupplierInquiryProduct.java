package com.hc.scm.uc.dao.purchasing.model;

/**
 * Description: 请写出类的用途
 * All rights Reserved, Designed Byhcopyright:   Copyright(C) 2016-2017
 * Company:     hc.
 * @author:     jinxi.li
 * @date:  2016年8月21日
 * @version 1.0.0
 */
public class HcSupplierInquiryProduct {
	
   private  Integer   ID;//产品编号
   private  String   inquiryNo;//询价编号
   private  String   productModel;//产品型号
   private  String   chineseName;//中文名称
   private  String   inquiredQTY;//询价数量
   private  String   englishName;//英文名称
   private  String   quotedPrice;//报　　价
   private  String   dateOfArrival;//到货日期
   private  String   unit;//单位  
   private  String   inquiredQTY_quotedPrice$;//合计
   private  String   inquiredQTY_unit;//数量加单位
   private  String   remark;//备注

public Integer getID() {
	return ID;
}
public void setID(Integer iD) {
	ID = iD;
}
public String getInquiryNo() {
	return inquiryNo;
}
public void setInquiryNo(String inquiryNo) {
	this.inquiryNo = inquiryNo;
}
public String getProductModel() {
	return productModel;
}
public void setProductModel(String productModel) {
	this.productModel = productModel;
}
public String getChineseName() {
	return chineseName;
}
public void setChineseName(String chineseName) {
	this.chineseName = chineseName;
}
public String getInquiredQTY() {
	return inquiredQTY;
}
public void setInquiredQTY(String inquiredQTY) {
	this.inquiredQTY = inquiredQTY;
}
public String getEnglishName() {
	return englishName;
}
public void setEnglishName(String englishName) {
	this.englishName = englishName;
}
public String getQuotedPrice() {
	return quotedPrice;
}
public void setQuotedPrice(String quotedPrice) {
	this.quotedPrice = quotedPrice;
}
public String getDateOfArrival() {
	return dateOfArrival;
}
public void setDateOfArrival(String dateOfArrival) {
	this.dateOfArrival = dateOfArrival;
}
public String getUnit() {
	return unit;
}
public void setUnit(String unit) {
	this.unit = unit;
}
public String getInquiredQTY_quotedPrice$() {
	return inquiredQTY_quotedPrice$;
}
public void setInquiredQTY_quotedPrice$(String inquiredQTY_quotedPrice$) {
	this.inquiredQTY_quotedPrice$ = inquiredQTY_quotedPrice$;
}
public String getInquiredQTY_unit() {
	return inquiredQTY_unit;
}
public void setInquiredQTY_unit(String inquiredQTY_unit) {
	this.inquiredQTY_unit = inquiredQTY_unit;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}

}
