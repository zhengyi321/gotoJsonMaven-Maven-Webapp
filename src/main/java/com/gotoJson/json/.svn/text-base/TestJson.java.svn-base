package com.gotoJson.json;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gotoJson.entity.Test;
import com.gotoJson.util.JSONResult;



@RequestMapping(value = "test")
@Controller
public class TestJson<T> {

	@RequestMapping(value = "test")
	@ResponseBody
	public JSONResult<T> test(HttpServletRequest request){
		List<Test> testList = new ArrayList<Test>();
		Test test = new Test();
		test.setTest("hhhhhhhhhhhh");
		testList.add(test);

		
		T obj = (T)testList;
		JSONResult<T> jsonResultObj = new JSONResult<T>(obj, null, false);
		return jsonResultObj;
	}
	
	@RequestMapping(value = "test2")
	@ResponseBody
	public String test2(HttpServletRequest request){
		String address = request.getParameter("address");
		System.out.println(address);
		return address;
	}
}
