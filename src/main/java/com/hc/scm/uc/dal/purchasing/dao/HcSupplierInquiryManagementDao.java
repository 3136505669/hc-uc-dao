package com.hc.scm.uc.dal.purchasing.dao;

import com.hc.scm.common.base.dal.BaseCrudDao;
import com.hc.scm.common.exception.DaoException;

/**
 * Description: 请写出类的用途
 * All rights Reserved, Designed Byhcopyright:   Copyright(C) 2016-2017
 * Company:     hc.
 * @author:     jinxi.li
 * @date:  2016年8月21日
 * @version 1.0.0
 */
public interface HcSupplierInquiryManagementDao extends BaseCrudDao {
	public <ModelType> int deleteSubById(ModelType modelType) throws DaoException ;
}
