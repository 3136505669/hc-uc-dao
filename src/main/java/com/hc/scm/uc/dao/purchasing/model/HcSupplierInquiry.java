package com.hc.scm.uc.dao.purchasing.model;

public class HcSupplierInquiry {
	
	private  String   inquiryNo;//询价编号
    private  String   contactsName;//联系人名称
    private  String   personInCharge;//负责人
   
    private  String   supplierNo;//供应商编号
    private  String   supplierName;//供应商名称
    private  String   contactsTel;//联系电话
   
    private  String   contactsFax;//联系传真
    private  String   typeOfShipping;//运输方式
    private  String   inquiryDate;//询价日期
   
    private  String   inquiryCurrency;//询价货币

    private  String    subject;//主　　题
 
    private  String    remarks;//备　　注

	public String getInquiryNo() {
		return inquiryNo;
	}

	public void setInquiryNo(String inquiryNo) {
		this.inquiryNo = inquiryNo;
	}

	public String getContactsName() {
		return contactsName;
	}

	public void setContactsName(String contactsName) {
		this.contactsName = contactsName;
	}

	public String getPersonInCharge() {
		return personInCharge;
	}

	public void setPersonInCharge(String personInCharge) {
		this.personInCharge = personInCharge;
	}

	public String getSupplierNo() {
		return supplierNo;
	}

	public void setSupplierNo(String supplierNo) {
		this.supplierNo = supplierNo;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getContactsTel() {
		return contactsTel;
	}

	public void setContactsTel(String contactsTel) {
		this.contactsTel = contactsTel;
	}

	public String getContactsFax() {
		return contactsFax;
	}

	public void setContactsFax(String contactsFax) {
		this.contactsFax = contactsFax;
	}

	public String getTypeOfShipping() {
		return typeOfShipping;
	}

	public void setTypeOfShipping(String typeOfShipping) {
		this.typeOfShipping = typeOfShipping;
	}

	public String getInquiryDate() {
		return inquiryDate;
	}

	public void setInquiryDate(String inquiryDate) {
		this.inquiryDate = inquiryDate;
	}

	public String getInquiryCurrency() {
		return inquiryCurrency;
	}

	public void setInquiryCurrency(String inquiryCurrency) {
		this.inquiryCurrency = inquiryCurrency;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
    
   
}
