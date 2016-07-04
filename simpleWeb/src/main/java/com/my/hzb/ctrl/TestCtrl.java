package com.my.hzb.ctrl;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestCtrl {

	@RequestMapping("/getTest")
	@ResponseBody
	public Map<String,Object> getTest(String name){
		System.out.println("请求的name="+name);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", null==name?"this is empty":name);
		return map;
	}
	
}
