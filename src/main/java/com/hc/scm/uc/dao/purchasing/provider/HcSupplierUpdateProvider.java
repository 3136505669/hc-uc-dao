package com.hc.scm.uc.dao.purchasing.provider;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.jdbc.SQL;

import com.hc.scm.uc.dao.purchasing.model.HcSupplier;

public class HcSupplierUpdateProvider {
	
     public <ModelType> String  updateSql(final ModelType record){
    	// System.out.println(((HcSupplier)record));
    	 return  new  SQL(){
    		 {
    			 UPDATE("supplier");
    			 if(((HcSupplier)record)!=null){
    				if(((HcSupplier)record).getCompanyName()!=null&&!"".equals(((HcSupplier)record).getCompanyName())){
    					SET("coname=#{companyName}");
    				}
    				if(((HcSupplier)record).getCompanyAddr()!=null&&!"".equals(((HcSupplier)record).getCompanyAddr())){
    					SET("coaddr=#{companyAddr}");
    				}
    				if(((HcSupplier)record).getCompanyZipCode()!=null&&!"".equals(((HcSupplier)record).getCompanyZipCode())){
    					SET("copost=#{companyZipCode}");
    				}
    				if(((HcSupplier)record).getCity()!=null&&!"".equals(((HcSupplier)record).getCity())){
    					SET("city=#{city}");
    				}
    				if(((HcSupplier)record).getCountry()!=null&&!"".equals(((HcSupplier)record).getCountry())){
    					SET("country=#{country}");
    				}
    				if(((HcSupplier)record).getProvince()!=null&&!"".equals(((HcSupplier)record).getProvince())){
    					SET("province=#{province}");
    				}
    				if(((HcSupplier)record).getLegalRepresentative()!=null&&!"".equals(((HcSupplier)record).getLegalRepresentative())){
    					SET("cofrdb=#{legalRepresentative}");
    				}
    				if(((HcSupplier)record).getOrganizationForm()!=null&&!"".equals(((HcSupplier)record).getOrganizationForm())){
    					SET("cozzxs=#{organizationForm}");
    				}
    				if(((HcSupplier)record).getRegisteredCapital()!=null&&!"".equals(((HcSupplier)record).getRegisteredCapital())){
    					SET("cozczb=#{registeredCapital}");
    				}
    				if(((HcSupplier)record).getBusinessLicense()!=null&&!"".equals(((HcSupplier)record).getBusinessLicense())){
    					SET("coyyzz=#{businessLicense}");
    				}
    				if(((HcSupplier)record).getSupplierTypes()!=null&&!"".equals(((HcSupplier)record).getSupplierTypes())){
    					SET("cotypes=#{supplierTypes}");
    				}
    				if(((HcSupplier)record).getSupplierTypes()!=null&&!"".equals(((HcSupplier)record).getSupplierTypes())){
    					SET("tradetypes=#{industryTypes}");
    				}
    				if(((HcSupplier)record).getSupplierLevel()!=null&&!"".equals(((HcSupplier)record).getSupplierLevel())){
    					SET("cokhjb=#{supplierLevel}");
    				}
    				if(((HcSupplier)record).getBankOfDeposit()!=null&&!"".equals(((HcSupplier)record).getBankOfDeposit())){
    					SET("cokhyh=#{bankOfDeposit}");
    				}
    				if(((HcSupplier)record).getBankAccount()!=null&&!"".equals(((HcSupplier)record).getBankAccount())){
    					SET("coyhzh=#{bankAccount}");
    				}
    				if(((HcSupplier)record).getDateOfEstablishment()!=null&&!"".equals(((HcSupplier)record).getDateOfEstablishment())){
    					SET("coclrq=#{dateOfEstablishment}");
    				}
    				if(((HcSupplier)record).getPaymentMethod()!=null&&!"".equals(((HcSupplier)record).getPaymentMethod())){
    					SET("ifjckq=#{paymentMethod}");
    				}
    				if(((HcSupplier)record).getCompanyTel()!=null&&!"".equals(((HcSupplier)record).getCompanyTel())){
    					SET("cotel=#{companyTel}");
    				}
    				if(((HcSupplier)record).getCompanyFax()!=null&&!"".equals(((HcSupplier)record).getCompanyFax())){
    					SET("cofax=#{companyFax}");
    				}
    				if(((HcSupplier)record).getEmail()!=null&&!"".equals(((HcSupplier)record).getEmail())){
    					SET("codzyj=#{email}");
    				}
    				if(((HcSupplier)record).getCompanyNet()!=null&&!"".equals(((HcSupplier)record).getCompanyNet())){
    					SET("conet=#{companyNet}");
    				}
    				if(((HcSupplier)record).getUseCurrency()!=null&&!"".equals(((HcSupplier)record).getUseCurrency())){
    					SET("cosyhb=#{useCurrency}");
    				}
    				if(((HcSupplier)record).getLinkMan()!=null&&!"".equals(((HcSupplier)record).getLinkMan())){
    					SET("cojsfs=#{linkMan}");
    				}
    				if(((HcSupplier)record).getLinkManTel()!=null&&!"".equals(((HcSupplier)record).getLinkManTel())){
    					SET("nshm=#{linkManTel}");
    				}
    				if(((HcSupplier)record).getDocPurchasing()!=null&&!"".equals(((HcSupplier)record).getDocPurchasing())){
    					SET("number=#{docPurchasing}");
    				}
    				if(((HcSupplier)record).getCreateUser()!=null&&!"".equals(((HcSupplier)record).getCreateUser())){
    					SET("username=#{createUser}");
    				}
    				if(((HcSupplier)record).getLocalDepartment()!=null&&!"".equals(((HcSupplier)record).getLocalDepartment())){
    					SET("dept=#{localDepartment}");
    				}
    				//if(((HcSupplier)record).getModifyUser()!=null&&!"".equals(((HcSupplier)record).getModifyUser())){
    					SET("modman='admin'");
    				//}
    				//if(((HcSupplier)record).getModifyDate()!=null&&!"".equals(((HcSupplier)record).getModifyDate())){
    					SET("mod_date='"+(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date())+"'");
    				//}
    				if(((HcSupplier)record).getWhetherToShare()!=null&&!"".equals(((HcSupplier)record).getWhetherToShare())){
    					SET("share=#{whetherToShare}");
    				}
    				if(((HcSupplier)record).getYearEarning()!=null&&!"".equals(((HcSupplier)record).getYearEarning())){
    					SET("yearearning=#{yearEarning}");
    				}
    				if(((HcSupplier)record).getValueCategory()!=null&&!"".equals(((HcSupplier)record).getValueCategory())){
    					SET("valueco=#{valueCategory}");
    				}
    				if(((HcSupplier)record).getLoginDate()!=null&&!"".equals(((HcSupplier)record).getLoginDate())){
    					SET("rg_date=#{loginDate}");
    				}
    				if(((HcSupplier)record).getCompanyScale()!=null&&!"".equals(((HcSupplier)record).getCompanyScale())){
    					SET("annual_sales=#{companyScale}");
    				}
    				if(((HcSupplier)record).getAbilityToSell()!=null&&!"".equals(((HcSupplier)record).getAbilityToSell())){
    					SET("sales_ability=#{abilityToSell}");
    				}
    				if(((HcSupplier)record).getQualityControl()!=null&&!"".equals(((HcSupplier)record).getQualityControl())){
    					SET("qlty_control=#{qualityControl}");
    				}
    				if(((HcSupplier)record).getCompanyProfile()!=null&&!"".equals(((HcSupplier)record).getCompanyProfile())){
    					SET("companymt=#{companyProfile}");
    				}
    				if(((HcSupplier)record).getCategoryOfTheProduct()!=null&&!"".equals(((HcSupplier)record).getCategoryOfTheProduct())){
    					SET("scale=#{categoryOfTheProduct}");
    				}
    				if(((HcSupplier)record).getCooperationOpportunities()!=null&&!"".equals(((HcSupplier)record).getCooperationOpportunities())){
    					SET("warehouse=#{cooperationOpportunities}");
    				}
    				
    				if(((HcSupplier)record).getDescribee()!=null&&!"".equals(((HcSupplier)record).getDescribee())){
    					SET("describee=#{describee}");
    				}
    				
    			 }
        		 WHERE("co_number=#{companyNo}");
    		 }
    	 }.toString();
     }
}



