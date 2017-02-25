package com.hc.scm.uc.dao.sales.model;
/**
 * Description: 合同管理 view
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
public class HcContract {
	private  String  contractCode;//合同编码
	private  String  buyCode;//购买方（甲方）
	private  String  buyName;//购买方（甲方）
	
	private  String  buyAddr;//购买方（甲方）地址
	private  String  buyTel;//购买方（甲方）电话
	private  String  buyFax;//购买方（甲方）传真
	
	private  String  buyContactByCode;//购买方（甲方）联系人 
	private  String  buyContactBy;//购买方（甲方）联系人 
	private  String  salesCode;//销售方（乙方）
	
	private  String  salesName;//销售方（乙方）
	private  String  salesAddr;//销售方（乙方）地址
	private  String  salesTel;//销售方（乙方）电话
	
	private  String  salesFax;//销售方（乙方）传真
	private  String  salesContactByCode;//销售方（乙方）联系人
	private  String  salesContactBy;//销售方（乙方）联系人
	
	private  String  contractContent;//合同内容
	private  String  contractFile;//合同文件
	private  String  contractFile1;//合同文件
	
	private  String  contractFile2;//合同文件
	private  String  contractImage1;//合同图片
	private  String  contractImage2;//合同图片
	
	private  String  contractImage3;//合同图片
	private  String  buyRepreCode;//购买方（甲方）代表
	private  String  buyRepreName;//购买方（甲方）代表
	
	private  String  buySignDate;//购买方（甲方）签字日期
	private  String  salesRepreCode;//销售方（乙方）代表
	private  String  salesRepreName;//销售方（乙方）代表
	
	private  String  salesSignDate;//销售方（乙方）签字日期
	private  String  applByCode;//申请人
	private  String  applByName;//申请人
	
	private  String  examApprByCode;//审批人
	private  String  examApprByName;//审批人
	private  String  examApprOpinion;//审批意见
	
	private  String  FinalJudgeCode;//终审人
	private  String  FinalJudgeName;//终审人
	private  String  reviewOpinion;//复审意见
	
	private  String  remark;//
	
	
	
	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getBuyCode() {
		return buyCode;
	}

	public void setBuyCode(String buyCode) {
		this.buyCode = buyCode;
	}

	public String getBuyName() {
		return buyName;
	}

	public void setBuyName(String buyName) {
		this.buyName = buyName;
	}

	public String getBuyAddr() {
		return buyAddr;
	}

	public void setBuyAddr(String buyAddr) {
		this.buyAddr = buyAddr;
	}

	public String getBuyTel() {
		return buyTel;
	}

	public void setBuyTel(String buyTel) {
		this.buyTel = buyTel;
	}

	public String getBuyFax() {
		return buyFax;
	}

	public void setBuyFax(String buyFax) {
		this.buyFax = buyFax;
	}

	public String getBuyContactByCode() {
		return buyContactByCode;
	}

	public void setBuyContactByCode(String buyContactByCode) {
		this.buyContactByCode = buyContactByCode;
	}

	public String getBuyContactBy() {
		return buyContactBy;
	}

	public void setBuyContactBy(String buyContactBy) {
		this.buyContactBy = buyContactBy;
	}

	public String getSalesCode() {
		return salesCode;
	}

	public void setSalesCode(String salesCode) {
		this.salesCode = salesCode;
	}

	public String getSalesName() {
		return salesName;
	}

	public void setSalesName(String salesName) {
		this.salesName = salesName;
	}

	public String getSalesAddr() {
		return salesAddr;
	}

	public void setSalesAddr(String salesAddr) {
		this.salesAddr = salesAddr;
	}

	public String getSalesTel() {
		return salesTel;
	}

	public void setSalesTel(String salesTel) {
		this.salesTel = salesTel;
	}

	public String getSalesFax() {
		return salesFax;
	}

	public void setSalesFax(String salesFax) {
		this.salesFax = salesFax;
	}

	public String getSalesContactByCode() {
		return salesContactByCode;
	}

	public void setSalesContactByCode(String salesContactByCode) {
		this.salesContactByCode = salesContactByCode;
	}

	public String getSalesContactBy() {
		return salesContactBy;
	}

	public void setSalesContactBy(String salesContactBy) {
		this.salesContactBy = salesContactBy;
	}

	public String getContractContent() {
		return contractContent;
	}

	public void setContractContent(String contractContent) {
		this.contractContent = contractContent;
	}

	public String getContractFile() {
		return contractFile;
	}

	public void setContractFile(String contractFile) {
		this.contractFile = contractFile;
	}

	public String getContractFile1() {
		return contractFile1;
	}

	public void setContractFile1(String contractFile1) {
		this.contractFile1 = contractFile1;
	}

	public String getContractFile2() {
		return contractFile2;
	}

	public void setContractFile2(String contractFile2) {
		this.contractFile2 = contractFile2;
	}

	public String getContractImage1() {
		return contractImage1;
	}

	public void setContractImage1(String contractImage1) {
		this.contractImage1 = contractImage1;
	}

	public String getContractImage2() {
		return contractImage2;
	}

	public void setContractImage2(String contractImage2) {
		this.contractImage2 = contractImage2;
	}

	public String getContractImage3() {
		return contractImage3;
	}

	public void setContractImage3(String contractImage3) {
		this.contractImage3 = contractImage3;
	}

	public String getBuyRepreCode() {
		return buyRepreCode;
	}

	public void setBuyRepreCode(String buyRepreCode) {
		this.buyRepreCode = buyRepreCode;
	}

	public String getBuyRepreName() {
		return buyRepreName;
	}

	public void setBuyRepreName(String buyRepreName) {
		this.buyRepreName = buyRepreName;
	}

	public String getBuySignDate() {
		return buySignDate;
	}

	public void setBuySignDate(String buySignDate) {
		this.buySignDate = buySignDate;
	}

	public String getSalesRepreCode() {
		return salesRepreCode;
	}

	public void setSalesRepreCode(String salesRepreCode) {
		this.salesRepreCode = salesRepreCode;
	}

	public String getSalesRepreName() {
		return salesRepreName;
	}

	public void setSalesRepreName(String salesRepreName) {
		this.salesRepreName = salesRepreName;
	}

	public String getSalesSignDate() {
		return salesSignDate;
	}

	public void setSalesSignDate(String salesSignDate) {
		this.salesSignDate = salesSignDate;
	}

	public String getApplByCode() {
		return applByCode;
	}

	public void setApplByCode(String applByCode) {
		this.applByCode = applByCode;
	}

	public String getApplByName() {
		return applByName;
	}

	public void setApplByName(String applByName) {
		this.applByName = applByName;
	}

	public String getExamApprByCode() {
		return examApprByCode;
	}

	public void setExamApprByCode(String examApprByCode) {
		this.examApprByCode = examApprByCode;
	}

	public String getExamApprByName() {
		return examApprByName;
	}

	public void setExamApprByName(String examApprByName) {
		this.examApprByName = examApprByName;
	}

	public String getExamApprOpinion() {
		return examApprOpinion;
	}

	public void setExamApprOpinion(String examApprOpinion) {
		this.examApprOpinion = examApprOpinion;
	}

	public String getFinalJudgeCode() {
		return FinalJudgeCode;
	}

	public void setFinalJudgeCode(String finalJudgeCode) {
		FinalJudgeCode = finalJudgeCode;
	}

	public String getFinalJudgeName() {
		return FinalJudgeName;
	}

	public void setFinalJudgeName(String finalJudgeName) {
		FinalJudgeName = finalJudgeName;
	}

	public String getReviewOpinion() {
		return reviewOpinion;
	}

	public void setReviewOpinion(String reviewOpinion) {
		this.reviewOpinion = reviewOpinion;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	
}
