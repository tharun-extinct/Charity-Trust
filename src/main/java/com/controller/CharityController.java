package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.exception.NoFundsRaisedException;
import com.model.Sponsor;
import com.service.CharityService;

//use appropriate annotation to configure CharityController as Controller
@Controller
public class CharityController {

	// use appropriate annotation
	@Autowired
	private CharityService service;

	// invoke the service class - addFundDetails method.
	@RequestMapping("/addFund")
	public String addFundDetails(@ModelAttribute("donate") Sponsor sponsor, BindingResult result, ModelMap model) {

		// Fill the code
		service.addFundDetails(sponsor);
		model.addAttribute("donate", new Sponsor());
		return "showPage";
	}

	// invoke the service class - viewFundList method.
	@RequestMapping("/viewList")
	public String viewFundList(ModelMap model) throws NoFundsRaisedException {
		// Fill the code
		if (service.viewFundList().isEmpty()) {
			throw new NoFundsRaisedException("No funds raised till now");
		}
		model.addAttribute("fundList", service.viewFundList());
		return "viewList";

	}

	@RequestMapping("/index")
	public String home() {
		return "index";
	}

	@RequestMapping("/showPage")
	public String showPage(ModelMap model) {
		model.addAttribute("donate", new Sponsor());
		return "showPage";
	}

	// Use appropriate annotation
	@ExceptionHandler(NoFundsRaisedException.class)
	public ModelAndView exceptionHandler(Exception e) {

		// Fill the code
		ModelAndView mv = new ModelAndView("exceptionPage");
		mv.addObject("errorMessage", e.getMessage());
		return mv;
	}

}
