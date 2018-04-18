package org.burkitech.courierApp.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MailController {
	@Autowired
	MailSender mailSender;

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;

	}

	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public String sendMail(@RequestParam("name") String name, @RequestParam("phone") String phone,
			@RequestParam("email") String email, @RequestParam("message") String message, Model model,
			HttpServletRequest request) {
		SimpleMailMessage smm = new SimpleMailMessage();
		smm.setFrom("sclzohaib@gmail.com");
		smm.setTo("burkitechno@gmail.com");
		smm.setSubject("Spring MVC mail " + name + " " + phone);
		smm.setText(message + email);
		mailSender.send(smm);
		return "redirect:/contact";
	}
}
