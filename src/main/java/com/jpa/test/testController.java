package com.jpa.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		int a=90;
		int b=900;
		return ("this is just a test"+(a+b));
		
	}
}
