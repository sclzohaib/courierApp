package org.burkitech.courierApp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.burkitech.courierApp.dao.BookInfoDAO;
import org.burkitech.courierApp.dao.ProductDAO;
import org.burkitech.courierApp.dto.BookInfo;
import org.burkitech.courierApp.dto.NewBookInfo;
import org.burkitech.courierApp.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NewPageController {
	@Autowired
	private BookInfoDAO bookInfoDAO;
	@Autowired
	private ProductDAO productDAO;
		// ------------------------------------------------------------
		// book info form
		// ------------------------------------------------------------
		@RequestMapping(value = "/book-info", method = RequestMethod.GET)
		public ModelAndView bookInfo(@RequestParam(name = "dim", required = false) String dim) {
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title", "Book Info");
			mv.addObject("userClickBookInfo", true);
			NewBookInfo nBookInfo = new NewBookInfo();
			mv.addObject("bookInfo", nBookInfo);
			mv.addObject("dim", dim);
			return mv;

		}

		@RequestMapping(value = "/book-info", method = RequestMethod.POST)
		public String addBookInfo(@Valid @ModelAttribute("bookInfo") NewBookInfo mBookInfo, BindingResult results, Model model,
				HttpServletRequest request) {
			if (results.hasErrors()) {
				System.out.println(results.toString());
				model.addAttribute("userClickBookInfo", true);
				model.addAttribute("title", "Book Info");
				return "page";
			}
			bookInfoDAO.add(mBookInfo);
			return "redirect:/book-info";
		}
		//---------------------------------------------------------------------------------
		// returning categories for all request mapping
		@ModelAttribute("products")
		public List<Product> getProducts() {
			return productDAO.productList();
		}
		@ModelAttribute("product")
		public Product getProduct() {
			return new Product();
		}
		
		//---------------------------------------------------------------------------------
		//handling dimensions
		@RequestMapping(value= "/dimensions" ,method=RequestMethod.POST)
		public String HandleDimensions(@RequestParam("length") long length,@RequestParam("width") long width,@RequestParam("height") long height) {
			long dim=(length * width * height) / 5000;
			System.out.println(length+" "+width+" "+height+" "+dim);
			return "redirect:/book-info?dim="+dim;
		}

}
