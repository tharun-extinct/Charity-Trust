package com.controller;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import com.model.Sponsor;
import com.service.CharityService;

//use appropriate annotation to configure CharityController as Controller
public class CharityController {

	// use appropriate annotation
	private CharityService service;

	// invoke the service class - addFundDetails method.
	public String addFundDetails(@ModelAttribute("donate") Sponsor sponsor, BindingResult result, ModelMap model) {

		// Fill the code

		return null;
	}

	// invoke the service class - viewFundList method.
	public String viewFundList(ModelMap model) {
		// Fill the code

		return null;

	}

	// Use appropriate annotation
	public ModelAndView exceptionHandler(Exception e) {

		// Fill the code

		return null;
	}

}
