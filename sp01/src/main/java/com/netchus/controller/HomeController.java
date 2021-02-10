package com.netchus.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.netchus.service.SensorService;

@Controller
public class HomeController {
	@Autowired
	private SensorService service;

	public HomeController(SensorService service) {
		super();
		this.service = service;
	}
	
	// 모델에 담아서 경로 지정하기
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		//model.addAttribute("sensorList", service.getResponse());
		return "home";
	}
	
	
	// 모델에 담아서 경로 지정하기
	@RequestMapping(value = "/sensor", method = RequestMethod.GET)
	public String getSensor(Model model) {
		model.addAttribute("sensorList", service.getResponse());
		return "sensor";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@RequestMapping(value = "/link", method = RequestMethod.GET)
	public String link(Model model) {
		
		return "link";
	}
	
	@RequestMapping(value = "/table", method = RequestMethod.GET)
	public String table(Model model) {
		
		return "table";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String form(Model model) {
		
		return "form";
	}
	
	
	
	@RequestMapping(value = "/js01", method = RequestMethod.GET)
	public String js01(Locale locale, Model model) {
		
		return "js01";
	}
	
	@RequestMapping(value = "/js02", method = RequestMethod.GET)
	public String js02(Locale locale, Model model) {
		
		return "js02";
	}
	
	@RequestMapping(value = "/js03", method = RequestMethod.GET)
	public String js03(Locale locale, Model model) {
		
		return "js03";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/map", method = RequestMethod.GET)
	public String js03(Model model) {
		
		return "map";
	}
	
	
	
	@RequestMapping(value ="/kakao", method = RequestMethod.GET)
	public void kakaoMap(Model model) {
		// void 라 기본 view 경로가 kakap.jsp로 간다.
	}
	
	
	
	
	
}
