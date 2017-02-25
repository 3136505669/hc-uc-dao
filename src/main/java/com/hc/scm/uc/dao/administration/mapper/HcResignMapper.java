package com.hc.scm.uc.dao.administration.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import com.hc.scm.common.base.mapper.BaseCrudMapper;
import com.hc.scm.uc.dao.purchasing.model.HcSupplierContacts;
import com.hc.scm.uc.dao.purchasing.provider.HcSupplierContactsInsertProvider;
import com.hc.scm.uc.dao.purchasing.provider.HcSupplierContactsSelectParamterProvider;
import com.hc.scm.uc.dao.purchasing.provider.HcSupplierContactsUpdateProvider;


/**
 * Description: 请写出类的用途
 * All rights Reserved, Designed Byhcopyright:   Copyright(C) 2016-2017
 * Company:     hc.
 * @author:     jinxi.li
 * @date:  2016年8月21日
 * @version 1.0.0
 */
public interface HcResignMapper extends BaseCrudMapper {
	 public final static String  databaseName="qlinkman";
	 public final static String  updateWhere="contactsNo";
	 public final static String  sortOrderByColumn="loginDate";
	 
	/* @ResultMap("com.hc.scm.uc.dao.purchasing.mapper.HcSupplierContactsManagementMapper.BaseResultMapHcSupplierContactsManagementMapper")
	 public  List<HcSupplierContacts> selectByParams(@Param("params")Map<String,Object> params);*/
	 
	 
	 @InsertProvider(type = HcSupplierContactsInsertProvider.class, method = "insertSql")
	 public <ModelType> int insertSelective(ModelType record);
	 
	 @UpdateProvider(type = HcSupplierContactsUpdateProvider.class, method = "updateSql")
	 public <ModelType> int updateByPrimaryKeySelective(ModelType record);

	 
	 @Delete("DELETE FROM qlinkman WHERE linkman_no=#{contactsNo}")
	 public <ModelType> int deleteByPrimarayKeyForModel(ModelType record);
	 
	 
	 @SelectProvider(type=HcSupplierContactsSelectParamterProvider.class, method = "findSelecttByParamsSql")
	 @ResultMap("com.hc.scm.uc.dao.purchasing.mapper.HcSupplierContactsManagementMapper.BaseResultMapHcSupplierContactsManagementMapper")
	 public   List<HcSupplierContacts> selectByPage(@Param("orderByField") String orderByField,@Param("orderBy") String orderBy,@Param("params")Map<String,Object> params);


}
