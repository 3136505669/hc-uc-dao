package com.hc.scm.uc.dal.purchasing.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.hc.scm.common.base.dal.BaseCrudDaoImpl;
import com.hc.scm.common.base.mapper.BaseCrudMapper;
import com.hc.scm.common.exception.DaoException;
import com.hc.scm.uc.dal.purchasing.dao.HcSupplierInquiryManagementDao;
import com.hc.scm.uc.dao.purchasing.mapper.HcSupplierInquiryManagementMapper;

/**
 * Description: 请写出类的用途
 * All rights Reserved, Designed Byhcopyright:   Copyright(C) 2016-2017
 * Company:     hc.
 * @author:     jinxi.li
 * @date:  2016年8月21日
 * @version 1.0.0
 */

@Repository("hcSupplierInquiryManagementDao")
public class HcSupplierInquiryManagementDaoImpl extends BaseCrudDaoImpl implements HcSupplierInquiryManagementDao {

    @Resource
    private  HcSupplierInquiryManagementMapper  hcSupplierInquiryManagementMapper;
    
    
	@Override
	public BaseCrudMapper init() {
		// TODO Auto-generated method stub
		return hcSupplierInquiryManagementMapper;
	}


	@Override
	public <ModelType> int deleteSubById(ModelType modelType)
			throws DaoException {
		
		return hcSupplierInquiryManagementMapper.deleteSubByPrimarayKeyForModel(modelType);
	}

}
