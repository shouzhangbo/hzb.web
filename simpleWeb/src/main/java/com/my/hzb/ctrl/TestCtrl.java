package com.my.hzb.ctrl;

import java.util.*;

import com.my.hzb.mq.MqSender2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.hzb.mq.MqSender;

@Controller
//@RequestMapping("/test")
public class TestCtrl {

	@RequestMapping("/getTest")
	@ResponseBody
	public Map<String,Object> getTest(String name){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", null==name?"this is empty":name);
		return map;
	}
	
}
