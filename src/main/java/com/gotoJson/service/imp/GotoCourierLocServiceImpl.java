package com.gotoJson.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotoJson.dao.GotoCourierLocMapper;
import com.gotoJson.entity.GotoCourierLoc;
import com.gotoJson.service.GotoCourierLocService;

@Service
public class GotoCourierLocServiceImpl implements GotoCourierLocService {

	@Autowired
	private GotoCourierLocMapper gotoCourierLocMapper;
	
	public int deleteByPrimaryKey(String guid) {
		// TODO Auto-generated method stub
		return gotoCourierLocMapper.deleteByPrimaryKey(guid);
	}

	public int insert(GotoCourierLoc record) {
		// TODO Auto-generated method stub
		return gotoCourierLocMapper.insert(record);
	}

	public int insertSelective(GotoCourierLoc record) {
		// TODO Auto-generated method stub
		return gotoCourierLocMapper.insertSelective(record);
	}

	public GotoCourierLoc selectByPrimaryKey(String guid) {
		// TODO Auto-generated method stub
		return gotoCourierLocMapper.selectByPrimaryKey(guid);
	}

	public int updateByPrimaryKeySelective(GotoCourierLoc record) {
		// TODO Auto-generated method stub
		return gotoCourierLocMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(GotoCourierLoc record) {
		// TODO Auto-generated method stub
		return gotoCourierLocMapper.updateByPrimaryKey(record);
	}

	public GotoCourierLoc selectByPhone(String phone) {
		// TODO Auto-generated method stub
		return gotoCourierLocMapper.selectByPhone(phone);
	}

	public List<GotoCourierLoc> selectAllList() {
		// TODO Auto-generated method stub
		return gotoCourierLocMapper.selectAllList();
	}

	public GotoCourierLoc selectByMac(String mac) {
		// TODO Auto-generated method stub
		return gotoCourierLocMapper.selectByMac(mac);
	}

}
