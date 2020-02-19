package com.newmaven.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewController {

	@RequestMapping(value = "/helo", method = RequestMethod.GET)
	public String showNewPage() {

		System.out.println("I just built a new Project!");
		return "showpage";
	}

}
