package com.hc.scm.uc.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import com.hc.scm.common.base.mapper.BaseCrudMapper;

/**
 * Description: 请写出类的用途
 * All rights Reserved, Designed By hcopyright:   Copyright(C) 2014-2015
 * Company:     Wonhigh.
 * @author:     user
 * @date:  2015-03-25 08:39:49
 * @version 1.0.0
 */
public interface ItgCommonLogMapper extends BaseCrudMapper {
	
	 @Insert("INSERT INTO [itg_common_log]([logTime],[logUser],[logModelType],[logContent])" +
		 		" VALUES" +
		 		"(#{logTime},#{logUser},#{logModelType},#{logContent})")
	 @Options(useGeneratedKeys = true, keyProperty = "log_id")
	public <ModelType> int insertSelective(ModelType record);
}