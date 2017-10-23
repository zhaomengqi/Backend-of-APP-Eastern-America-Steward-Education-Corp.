package com.ease.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
 
	@RequestMapping(value = "hello")
	public String showForm(Model model) {
		if (schedulerFactory.isRunning())
		{
			model.addAttribute("msg", " job started");
		}
		else
		{
			model.addAttribute("msg", "job stopped");
		}
		return "hello";
	}
 
	@Autowired
	private SchedulerFactoryBean schedulerFactory;
	
	@RequestMapping(value = "hello", method = RequestMethod.POST)
	public String runJob(Model model) {
 
		if (schedulerFactory.isRunning())
		{
			schedulerFactory.stop();
			model.addAttribute("msg", "job stopped");
		}
		else
		{
			schedulerFactory.start();
			model.addAttribute("msg", "job started");
		}
		return "hello";
	}
 
}