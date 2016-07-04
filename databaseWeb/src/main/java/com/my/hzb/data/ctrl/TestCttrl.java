package com.my.hzb.data.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestCttrl {

	@RequestMapping("/test")
	@ResponseBody
	public String getTest(String name){
		System.out.println("请求过来的name="+name);
		return name;
	}
}
