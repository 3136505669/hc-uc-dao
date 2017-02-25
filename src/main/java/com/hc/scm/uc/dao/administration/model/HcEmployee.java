package com.hc.scm.uc.dao.administration.model;
/**
 * Description: 员工管理 view
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
public class HcEmployee {
   private  String  employeeCode;//員工編碼
   private  String  employeeName;//員工姓名[name]
   private  String  locationDeptCode;//所在部门[dept]
   
   private  String  locationDept;//所在部门
   private  String  position;//职　　位[business]
   private  String  entryDate;//入职日期 [jiondt]
   
   private  String  dateOfBirth;//出生年月[borndt]
   private  String  sex;//性　　别[sex]
   private  String  politicalStatus;//政治面貌[man_zzmm]
   
   private  String  nation;//民　　族[nation]
   private  String  height;//身　　高[man_h]
   private  String  idCardNo;//身份证号码[idcard]
   
   private  String  specialty;//特　　长[man_tc]
   private  String  placeOfResidence;//户口所在地[nativeplace]
   private  String  presentResidence;//现居住地[xzaddr]
   
   private  String  imageLog;//照片[pic_path]
   private  String  nativePlace;//籍　　贯[born_addr]
   private  String  maritalStatus;//婚姻状况[hunif]
   
   private  String  contactPhone;//联系电话[man_tel]
   private  String  graduateSchool;//毕业院校 [man_school]
   private  String  atDate;//就读时间 [school_date]
   
   private  String  professional;//专　　业[school_zy]
   private  String  lengthSschool;//学　　制[school_year]
   private  String  degree;//学历[school_age]
   
   private  String  degreePosition;//学位[degree]
   private  String  orNotTurnover;//是否离职[ifzz]
   private  String  turnoverDate;//离职时间[dimissiom_date]
   
   private  String  foreignLanLevel;//外语水平[man_english]
   private  String  computerLevel;//计算机水平[man_computator]
   private  String  emergencyByCode;//紧急情况联系人[man_jj_lxr]
   
   private  String  emergencyBy;//紧急情况联系人
   private  String  emergencyTel;//紧急情况联系电话[man_jj_tel]
   private  String  emergencyAddress;//紧急情况联系人地址[man_jj_addr]
   
   private  String  membersId;//家庭成员ID
   private  String  experienceId;//工作經歷ID
   private  String  posiSituation;//转正情况[man_zz]
   
   private  String  insuredSituation;//参保情况[man_cb]
   private  String  contractSignSituat;//合同签订情况[man_ht]
   private  String  remark;//[remark]
   
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
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
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPoliticalStatus() {
		return politicalStatus;
	}
	public void setPoliticalStatus(String politicalStatus) {
		this.politicalStatus = politicalStatus;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getIdCardNo() {
		return idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String getPlaceOfResidence() {
		return placeOfResidence;
	}
	public void setPlaceOfResidence(String placeOfResidence) {
		this.placeOfResidence = placeOfResidence;
	}
	public String getPresentResidence() {
		return presentResidence;
	}
	public void setPresentResidence(String presentResidence) {
		this.presentResidence = presentResidence;
	}
	public String getImageLog() {
		return imageLog;
	}
	public void setImageLog(String imageLog) {
		this.imageLog = imageLog;
	}
	public String getNativePlace() {
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getGraduateSchool() {
		return graduateSchool;
	}
	public void setGraduateSchool(String graduateSchool) {
		this.graduateSchool = graduateSchool;
	}
	public String getAtDate() {
		return atDate;
	}
	public void setAtDate(String atDate) {
		this.atDate = atDate;
	}
	public String getProfessional() {
		return professional;
	}
	public void setProfessional(String professional) {
		this.professional = professional;
	}
	public String getLengthSschool() {
		return lengthSschool;
	}
	public void setLengthSschool(String lengthSschool) {
		this.lengthSschool = lengthSschool;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getDegreePosition() {
		return degreePosition;
	}
	public void setDegreePosition(String degreePosition) {
		this.degreePosition = degreePosition;
	}
	public String getOrNotTurnover() {
		return orNotTurnover;
	}
	public void setOrNotTurnover(String orNotTurnover) {
		this.orNotTurnover = orNotTurnover;
	}
	public String getTurnoverDate() {
		return turnoverDate;
	}
	public void setTurnoverDate(String turnoverDate) {
		this.turnoverDate = turnoverDate;
	}
	public String getForeignLanLevel() {
		return foreignLanLevel;
	}
	public void setForeignLanLevel(String foreignLanLevel) {
		this.foreignLanLevel = foreignLanLevel;
	}
	public String getComputerLevel() {
		return computerLevel;
	}
	public void setComputerLevel(String computerLevel) {
		this.computerLevel = computerLevel;
	}
	public String getEmergencyByCode() {
		return emergencyByCode;
	}
	public void setEmergencyByCode(String emergencyByCode) {
		this.emergencyByCode = emergencyByCode;
	}
	public String getEmergencyBy() {
		return emergencyBy;
	}
	public void setEmergencyBy(String emergencyBy) {
		this.emergencyBy = emergencyBy;
	}
	public String getEmergencyTel() {
		return emergencyTel;
	}
	public void setEmergencyTel(String emergencyTel) {
		this.emergencyTel = emergencyTel;
	}
	public String getEmergencyAddress() {
		return emergencyAddress;
	}
	public void setEmergencyAddress(String emergencyAddress) {
		this.emergencyAddress = emergencyAddress;
	}
	public String getMembersId() {
		return membersId;
	}
	public void setMembersId(String membersId) {
		this.membersId = membersId;
	}
	public String getExperienceId() {
		return experienceId;
	}
	public void setExperienceId(String experienceId) {
		this.experienceId = experienceId;
	}
	public String getPosiSituation() {
		return posiSituation;
	}
	public void setPosiSituation(String posiSituation) {
		this.posiSituation = posiSituation;
	}
	public String getInsuredSituation() {
		return insuredSituation;
	}
	public void setInsuredSituation(String insuredSituation) {
		this.insuredSituation = insuredSituation;
	}
	public String getContractSignSituat() {
		return contractSignSituat;
	}
	public void setContractSignSituat(String contractSignSituat) {
		this.contractSignSituat = contractSignSituat;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
