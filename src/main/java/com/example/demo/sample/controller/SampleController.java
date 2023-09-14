package com.example.demo.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.sample.service.SampleService;

@Controller
public class SampleController {
	
	@Autowired
	SampleService sampleService;

	@GetMapping("/")
	public String sample() {
		int successInteger = sampleService.insertSampleSvc();
		return "index";
	}
}
