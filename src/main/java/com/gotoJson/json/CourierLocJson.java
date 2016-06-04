package com.gotoJson.json;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gotoJson.entity.Courier;
import com.gotoJson.entity.GotoCourierLoc;
import com.gotoJson.entity.GotoCourierLocHistory;
import com.gotoJson.service.CourierService;
import com.gotoJson.service.GotoCourierLocHistoryService;
import com.gotoJson.service.GotoCourierLocService;
import com.gotoJson.util.MD5;
import com.gotoJson.util.TimeUtil;

@RequestMapping(value = "courierloc")
@Controller
public class CourierLocJson {

	@Autowired
	private CourierService courierService;
	@Autowired
	private GotoCourierLocService gotoCourierLocService;
	
	@Autowired
	private GotoCourierLocHistoryService gotoCourierLocHistoryService;
	
	@RequestMapping(value = "loc")
	@ResponseBody
	public boolean loc(HttpServletRequest request){
		String address = request.getParameter("address");
		String latitude = request.getParameter("latitude");
		String longitude = request.getParameter("longitude");
		String mac = request.getParameter("mac");
		System.out.println(address);
		System.out.println(latitude);
		System.out.println(longitude);
		System.out.println(mac);
		if((!longitude.isEmpty()) && (longitude != null) &&(longitude.length() > 3)){
		String effectiveData = longitude.substring(0, 3);
			if(!effectiveData.equals("120")){
				return false;
			}
		}else{
			return false;
		}
		
		if(mac == null || mac.isEmpty()){
			return false;
		}
		Courier courier = courierService.selectByMac(mac);
		GotoCourierLoc gotoCourierLoc = gotoCourierLocService.selectByMac(mac);
		System.out.println(mac);
		if(gotoCourierLoc != null){
			if(courier != null){
				gotoCourierLoc.setAddress(address);
				gotoCourierLoc.setLatitude(latitude);
				gotoCourierLoc.setLontitude(longitude);
				gotoCourierLoc.setModifyDate(TimeUtil.getCurrentTimeDate());
				gotoCourierLoc.setCourierId(courier.getGuid());
				gotoCourierLoc.setAvatar(courier.getAvatar());
				gotoCourierLoc.setName(courier.getName());
				gotoCourierLoc.setTel(courier.getTel());
				
			}else{
				courier = new Courier();
				courier.setGuid(MD5.getGuid());
				courier.setMobileMac(mac);
				gotoCourierLoc.setCourierId(courier.getGuid());
				gotoCourierLoc.setAddress(address);
				gotoCourierLoc.setLatitude(latitude);
				gotoCourierLoc.setLontitude(longitude);
				gotoCourierLoc.setModifyDate(TimeUtil.getCurrentTimeDate());
				courierService.insert(courier);
			}
			System.out.println("this is not null");
			GotoCourierLocHistory gotoCourierLocHistory =  new GotoCourierLocHistory();
			gotoCourierLocHistory.setGuid(MD5.getGuid());
			gotoCourierLocHistory.setAddress(gotoCourierLoc.getAddress());
			gotoCourierLocHistory.setLatitude(gotoCourierLoc.getLatitude());
			gotoCourierLocHistory.setLontitude(gotoCourierLoc.getLontitude());
			gotoCourierLocHistory.setMac(gotoCourierLoc.getMac());
			gotoCourierLocHistory.setCreateDate(gotoCourierLoc.getCreateDate());
			gotoCourierLocHistory.setModifyDate(gotoCourierLoc.getModifyDate());
			gotoCourierLocHistory.setTel(gotoCourierLoc.getTel());
			gotoCourierLocHistory.setAvatar(gotoCourierLoc.getAvatar());
			gotoCourierLocHistory.setName(gotoCourierLoc.getName());
			gotoCourierLocHistory.setCourierId(gotoCourierLoc.getCourierId());
			gotoCourierLocHistoryService.insert(gotoCourierLocHistory);
			gotoCourierLocService.updateByPrimaryKey(gotoCourierLoc);
		}else{
			System.out.println("this is null");
			if(courier != null){
				gotoCourierLoc = new GotoCourierLoc();
				gotoCourierLoc.setGuid(MD5.getGuid());
				gotoCourierLoc.setAddress(address);
				gotoCourierLoc.setLatitude(latitude);
				gotoCourierLoc.setLontitude(longitude);
				gotoCourierLoc.setMac(mac);
				gotoCourierLoc.setModifyDate(TimeUtil.getCurrentTimeDate());
				gotoCourierLoc.setTel(courier.getTel());
				gotoCourierLoc.setCourierId(courier.getGuid());
				gotoCourierLoc.setAvatar(courier.getAvatar());
				gotoCourierLoc.setCreateDate(TimeUtil.getCurrentTimeDate());
				gotoCourierLoc.setName(courier.getName());
			}else{
				courier = new Courier();
				courier.setGuid(MD5.getGuid());
				courier.setMobileMac(mac);
				gotoCourierLoc = new GotoCourierLoc();
				gotoCourierLoc.setGuid(MD5.getGuid());
				gotoCourierLoc.setAddress(address);
				gotoCourierLoc.setLatitude(latitude);
				gotoCourierLoc.setLontitude(longitude);
				gotoCourierLoc.setMac(mac);
				gotoCourierLoc.setModifyDate(TimeUtil.getCurrentTimeDate());
				gotoCourierLoc.setCreateDate(TimeUtil.getCurrentTimeDate());
				courierService.insert(courier);
			}
			GotoCourierLocHistory gotoCourierLocHistory =  new GotoCourierLocHistory();
			gotoCourierLocHistory.setGuid(MD5.getGuid());
			gotoCourierLocHistory.setAddress(gotoCourierLoc.getAddress());
			gotoCourierLocHistory.setLatitude(gotoCourierLoc.getLatitude());
			gotoCourierLocHistory.setLontitude(gotoCourierLoc.getLontitude());
			gotoCourierLocHistory.setMac(gotoCourierLoc.getMac());
			gotoCourierLocHistory.setCreateDate(gotoCourierLoc.getCreateDate());
			gotoCourierLocHistory.setModifyDate(gotoCourierLoc.getModifyDate());
			gotoCourierLocHistory.setTel(gotoCourierLoc.getTel());
			gotoCourierLocHistory.setAvatar(gotoCourierLoc.getAvatar());
			gotoCourierLocHistory.setName(gotoCourierLoc.getName());
			gotoCourierLocHistory.setCourierId(gotoCourierLoc.getCourierId());
			gotoCourierLocHistoryService.insert(gotoCourierLocHistory);
			gotoCourierLocService.insert(gotoCourierLoc);
		}
		return true;
	}
	

}
