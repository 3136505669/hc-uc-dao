package com.hc.scm.uc.dao.purchasing.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import com.hc.scm.common.base.mapper.BaseCrudMapper;
import com.hc.scm.uc.dao.purchasing.model.HcSupplierInquiryProduct;
import com.hc.scm.uc.dao.purchasing.model.HcSupplierContacts;
import com.hc.scm.uc.dao.purchasing.provider.HcSupplierContactsUpdateProvider;
import com.hc.scm.uc.dao.purchasing.provider.HcSupplierInquiryInsertProvider;
import com.hc.scm.uc.dao.purchasing.provider.HcSupplierInquiryProductSelectParamterProvider;
import com.hc.scm.uc.dao.purchasing.provider.HcSupplierInquirySelectParamterProvider;
import com.hc.scm.uc.dao.purchasing.sub.provider.HcSupplierInquiryProductInsertProvider;


/**
 * Description: 请写出类的用途
 * All rights Reserved, Designed Byhcopyright:   Copyright(C) 2016-2017
 * Company:     hc.
 * @author:     jinxi.li
 * @date:  2016年8月21日
 * @version 1.0.0
 */
public interface HcSupplierInquiryManagementMapper extends BaseCrudMapper {
	 public final static String  databaseName="procure_xj";
	 public final static String  subDatabaseName="xjpro";
	 
	 public final static String  updateWhere="inquiryNo";
	 
	 public final static String  sortOrderByColumn="inquiryDate";
	 public final static String  subSortOrderByColumn="inquiryNo";
			 
	 @SelectProvider(type=HcSupplierInquiryProductSelectParamterProvider.class, method = "findSelecttByParamsSql")
	 @ResultMap("com.hc.scm.uc.dao.purchasing.mapper.HcSupplierInquiryManagementMapper.BaseResultMapHcSupplierInquiryProductManagementMapper")
	 public  List<HcSupplierInquiryProduct> selectByParams(@Param("params")Map<String,Object> params);
	 
	 
	 @InsertProvider(type = HcSupplierInquiryInsertProvider.class, method = "insertSql")
	 public <ModelType> int insertSelective(ModelType record);
	 
	 @InsertProvider(type = HcSupplierInquiryProductInsertProvider.class, method = "insertSql")
	 public <ModelType> int inserSubtSelective(ModelType record);
	 
	 @UpdateProvider(type = HcSupplierContactsUpdateProvider.class, method = "updateSql")
	 public <ModelType> int updateByPrimaryKeySelective(ModelType record);

	 
	 @Delete("DELETE FROM procure_xj WHERE [number]=#{inquiryNo}")
	 public <ModelType> int deleteByPrimarayKeyForModel(ModelType record);
	 
	 @Delete("DELETE FROM xjpro WHERE number=#{inquiryNo}")
	 public <ModelType> int deleteSubByPrimarayKeyForModel(ModelType record);
	 
	 
	 @SelectProvider(type=HcSupplierInquirySelectParamterProvider.class, method = "findSelecttByParamsSql")
	 @ResultMap("com.hc.scm.uc.dao.purchasing.mapper.HcSupplierInquiryManagementMapper.BaseResultMapHcSupplierInquiryManagementMapper")
	 public  List<HcSupplierContacts> selectByPage(@Param("orderByField") String orderByField,@Param("orderBy") String orderBy,@Param("params")Map<String,Object> params);


}
