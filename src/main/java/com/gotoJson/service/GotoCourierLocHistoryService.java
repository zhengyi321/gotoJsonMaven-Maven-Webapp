package com.gotoJson.service;

import com.gotoJson.entity.GotoCourierLocHistory;

public interface GotoCourierLocHistoryService {
    int deleteByPrimaryKey(String guid);

    int insert(GotoCourierLocHistory record);

    int insertSelective(GotoCourierLocHistory record);

    GotoCourierLocHistory selectByPrimaryKey(String guid);

    int updateByPrimaryKeySelective(GotoCourierLocHistory record);

    int updateByPrimaryKey(GotoCourierLocHistory record);

}
