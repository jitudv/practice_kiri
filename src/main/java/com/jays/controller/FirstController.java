package com.jays.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller("/")
public class FirstController {

	@RequestMapping("/")
	public String rootView()
	{
		return "index";
	}
	
}
