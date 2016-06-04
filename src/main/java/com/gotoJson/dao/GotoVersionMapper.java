package com.gotoJson.dao;

import com.gotoJson.entity.GotoVersion;

public interface GotoVersionMapper {
	
	GotoVersion selectByNew(Boolean isNew);
	
    int deleteByPrimaryKey(String guid);

    int insert(GotoVersion record);

    int insertSelective(GotoVersion record);

    GotoVersion selectByPrimaryKey(String guid);

    int updateByPrimaryKeySelective(GotoVersion record);

    int updateByPrimaryKey(GotoVersion record);
}