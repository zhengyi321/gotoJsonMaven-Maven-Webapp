package com.gotoJson.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotoJson.dao.GotoCourierLocHistoryMapper;
import com.gotoJson.entity.GotoCourierLocHistory;
import com.gotoJson.service.GotoCourierLocHistoryService;

@Service
public class GotoCourierLocHistoryServiceImpl implements GotoCourierLocHistoryService{

	@Autowired
	private GotoCourierLocHistoryMapper gotoCourierLocHistoryMapper;
	
	public int deleteByPrimaryKey(String guid) {
		// TODO Auto-generated method stub
		return gotoCourierLocHistoryMapper.deleteByPrimaryKey(guid);
	}

	public int insert(GotoCourierLocHistory record) {
		// TODO Auto-generated method stub
		return gotoCourierLocHistoryMapper.insert(record);
	}

	public int insertSelective(GotoCourierLocHistory record) {
		// TODO Auto-generated method stub
		return gotoCourierLocHistoryMapper.insertSelective(record);
	}

	public GotoCourierLocHistory selectByPrimaryKey(String guid) {
		// TODO Auto-generated method stub
		return gotoCourierLocHistoryMapper.selectByPrimaryKey(guid);
	}

	public int updateByPrimaryKeySelective(GotoCourierLocHistory record) {
		// TODO Auto-generated method stub
		return gotoCourierLocHistoryMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(GotoCourierLocHistory record) {
		// TODO Auto-generated method stub
		return gotoCourierLocHistoryMapper.updateByPrimaryKey(record);
	}

}
