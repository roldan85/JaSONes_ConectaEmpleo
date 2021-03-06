package com.JaSONes.ProyectoFinalConectaEmpleo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/hello")
	public ModelAndView hello(@RequestParam(required=false, 
		defaultValue="World") String name) {
		return new ModelAndView("home", "name", name);
	}
}
