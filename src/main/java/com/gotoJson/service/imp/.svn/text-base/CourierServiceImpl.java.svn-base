package com.gotoJson.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotoJson.dao.CourierMapper;
import com.gotoJson.entity.Courier;
import com.gotoJson.entity.GotoCourierLoc;
import com.gotoJson.service.CourierService;

@Service
public class CourierServiceImpl implements CourierService{

	@Autowired
	private CourierMapper courierMapper;

	public int deleteByPrimaryKey(String guid) {
		// TODO Auto-generated method stub
		return courierMapper.deleteByPrimaryKey(guid);
	}

	public int insert(Courier record) {
		// TODO Auto-generated method stub
		return courierMapper.insert(record);
	}

	public int insertSelective(Courier record) {
		// TODO Auto-generated method stub
		return courierMapper.insertSelective(record);
	}

	public Courier selectByPrimaryKey(String guid) {
		// TODO Auto-generated method stub
		return courierMapper.selectByPrimaryKey(guid);
	}

	public int updateByPrimaryKeySelective(Courier record) {
		// TODO Auto-generated method stub
		return courierMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Courier record) {
		// TODO Auto-generated method stub
		return courierMapper.updateByPrimaryKey(record);
	}

	public Courier selectByPhone(String phone) {
		// TODO Auto-generated method stub
		return courierMapper.selectByPhone(phone);
	}

	public Courier selectByMac(String mac) {
		// TODO Auto-generated method stub
		return courierMapper.selectByMac(mac);
	}


}
