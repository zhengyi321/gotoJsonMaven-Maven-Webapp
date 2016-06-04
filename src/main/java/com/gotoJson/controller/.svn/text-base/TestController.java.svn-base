package com.gotoJson.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value = "test")
@Controller
public class TestController {
	
	
	@RequestMapping(value = "test")
	@ResponseBody
	public List<String> test(HttpServletRequest request){
		List<String> testList = new ArrayList<String>();
		testList.add("1");
		testList.add("1");
		testList.add("1");
		testList.add("1");
		testList.add("1");
		testList.add("1");
		testList.add("1");
		testList.add("1");
		return testList;
	}
	
	@RequestMapping(value = "test2")
	@ResponseBody
	public boolean test2(HttpServletRequest request){
		String address = request.getParameter("address");
		System.out.println(address);
		return true;
	}
}
