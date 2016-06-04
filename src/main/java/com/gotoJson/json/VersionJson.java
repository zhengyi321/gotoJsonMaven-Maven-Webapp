package com.gotoJson.json;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gotoJson.entity.GotoVersion;
import com.gotoJson.service.GotoVersionService;
import com.gotoJson.util.JSONResult;

@RequestMapping(value = "version")
@Controller
public class VersionJson<T> {
	
	@Autowired
	private GotoVersionService gotoVersionService;
	
	@RequestMapping(value = "checknews")
	@ResponseBody
	public JSONResult<T> checkNews(HttpServletRequest request){
		GotoVersion gotoVersion = gotoVersionService.selectByNew(true);

		System.out.println("this is version");
		T obj = (T)gotoVersion;
		JSONResult<T> jsonResultObj = new JSONResult<T>(obj, null, false);
		return jsonResultObj;
	}
}
