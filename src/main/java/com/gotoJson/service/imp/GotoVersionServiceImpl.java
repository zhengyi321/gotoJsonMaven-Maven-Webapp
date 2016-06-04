package com.gotoJson.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotoJson.dao.GotoVersionMapper;
import com.gotoJson.entity.GotoVersion;
import com.gotoJson.service.GotoVersionService;

@Service
public class GotoVersionServiceImpl implements GotoVersionService{

	
	@Autowired
	private GotoVersionMapper gotoVersionMapper;
	
	public GotoVersion selectByNew(Boolean isNew) {
		// TODO Auto-generated method stub
		return gotoVersionMapper.selectByNew(isNew);
	}

	public int deleteByPrimaryKey(String guid) {
		// TODO Auto-generated method stub
		return gotoVersionMapper.deleteByPrimaryKey(guid);
	}

	public int insert(GotoVersion record) {
		// TODO Auto-generated method stub
		return gotoVersionMapper.insert(record);
	}

	public int insertSelective(GotoVersion record) {
		// TODO Auto-generated method stub
		return gotoVersionMapper.insertSelective(record);
	}

	public GotoVersion selectByPrimaryKey(String guid) {
		// TODO Auto-generated method stub
		return gotoVersionMapper.selectByPrimaryKey(guid);
	}

	public int updateByPrimaryKeySelective(GotoVersion record) {
		// TODO Auto-generated method stub
		return gotoVersionMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(GotoVersion record) {
		// TODO Auto-generated method stub
		return gotoVersionMapper.updateByPrimaryKey(record);
	}

}
