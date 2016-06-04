package com.gotoJson.service;

import com.gotoJson.entity.GotoVersion;

public interface GotoVersionService {
	
	GotoVersion selectByNew(Boolean isNew);
	
    int deleteByPrimaryKey(String guid);

    int insert(GotoVersion record);

    int insertSelective(GotoVersion record);

    GotoVersion selectByPrimaryKey(String guid);

    int updateByPrimaryKeySelective(GotoVersion record);

    int updateByPrimaryKey(GotoVersion record);
}
