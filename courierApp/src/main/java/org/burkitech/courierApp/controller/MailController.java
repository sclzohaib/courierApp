package org.burkitech.courierApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class MailController {
	@Autowired
	MailSender mailSender;

	@RequestMapping(path="emailTest", method = {RequestMethod.GET})
	    public void emailTest(){
	        SimpleMailMessage smm = new SimpleMailMessage();
	        smm.setFrom("email@gmail.com");
	        smm.setTo("email@gmail.com");
	        smm.setSubject("title");
	        smm.setText("text");
	        mailSender.send(smm);

	    }
}
