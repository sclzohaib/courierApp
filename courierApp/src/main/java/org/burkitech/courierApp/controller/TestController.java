package org.burkitech.courierApp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.burkitech.courierApp.dao.MasterDAO;
import org.burkitech.courierApp.dto.Master;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@Autowired
	private MasterDAO masterDAO;

	// ------------------------------------------------------------
	// book info form
	// ------------------------------------------------------------
	@RequestMapping(value = "/md", method = RequestMethod.GET)
	public ModelAndView bookInfo() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Master Detail");
		mv.addObject("userClickMasterDetail", true);
		Master nMaster = new Master();
		mv.addObject("md", nMaster);
		return mv;

	}

	@RequestMapping(value = "/md", method = RequestMethod.POST)
	public String addBookInfo(@Valid @ModelAttribute("md") Master mMaster, BindingResult results, Model model,
			HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickMasterDetail", true);
			model.addAttribute("title", "Master Detail");
			return "page";
		}
//		Detail mDetail = new Detail();
//		mDetail.setMaster(mMaster);
//		mMaster.setDetail(mDetail);
		masterDAO.add(mMaster);
		masterDAO.addDetail(mMaster.getDetail());
		return "redirect:/md";
	}
}
