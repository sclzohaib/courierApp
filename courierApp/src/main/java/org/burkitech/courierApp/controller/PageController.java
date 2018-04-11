package org.burkitech.courierApp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.burkitech.courierApp.dao.EmployeeDAO;
import org.burkitech.courierApp.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		return mv;

	}

	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;

	}

	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;

	}

	@RequestMapping(value = "/services")
	public ModelAndView services() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Services");
		mv.addObject("userClickServices", true);
		return mv;

	}

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public ModelAndView employee() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Employee");
		mv.addObject("userClickEmployee", true);
		Employee nEmployee = new Employee();
		mv.addObject("employee", nEmployee);
		return mv;
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public String addemployee(@Valid @ModelAttribute("employee") Employee mEmployee, BindingResult results,
			Model model, HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickEmployee", true);
			model.addAttribute("title", "Employee");
			return "page";
		}
		if(mEmployee.getId()==0) {
			System.out.println(mEmployee.getName());
			// create a new record of product
			employeeDAO.add(mEmployee);
			return "redirect:/employee";
		}
		return "redirect:/employee";
	}

	@RequestMapping(value = "/menifest")
	public ModelAndView menifest() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Menifest");
		mv.addObject("userClickMenifest", true);
		return mv;

	}
	@RequestMapping(value = "/delivery")
	public ModelAndView delivery() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Delivery");
		mv.addObject("userClickDelivery", true);
		return mv;

	}
}
