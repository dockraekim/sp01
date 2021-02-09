package com.netchus.controller;

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
	
}
