package com.navnbp.radar.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@ComponentScan(basePackages = "com.mckesson.radar.controller")
@Controller
public class LoginController {
	
	@RequestMapping(value = "/hello", method = { RequestMethod.GET, RequestMethod.POST })
	public String defaultPage(ModelMap model, HttpServletRequest httpRequest) {
		return "hello";
}

}
