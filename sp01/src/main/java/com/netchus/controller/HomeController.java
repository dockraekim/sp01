package com.netchus.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	public String getSensorData(Model model) {
		model.addAttribute("sensorList", service.getResponse());
		return "sensor";
	}
	
}
