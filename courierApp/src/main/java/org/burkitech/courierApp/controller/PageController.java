package org.burkitech.courierApp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.burkitech.courierApp.dao.BookInfoDAO;
import org.burkitech.courierApp.dao.DeliveryDAO;
import org.burkitech.courierApp.dao.EmployeeDAO;
import org.burkitech.courierApp.dao.ManifestDAO;
import org.burkitech.courierApp.dto.BookInfo;
import org.burkitech.courierApp.dto.Delivery;
import org.burkitech.courierApp.dto.DeliveryDetail;
import org.burkitech.courierApp.dto.Employee;
import org.burkitech.courierApp.dto.Manifest;
import org.burkitech.courierApp.dto.ManifestDetail;
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

	@Autowired
	private ManifestDAO manifestDAO;

	@Autowired
	private DeliveryDAO deliveryDAO;
	
	@Autowired
	private BookInfoDAO bookInfoDAO;

	//------------------------------------------------------------
	//Pages
	//------------------------------------------------------------
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

	@RequestMapping(value = "/portfolio-1-col")
	public ModelAndView portfolio_1_col() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Portfolio Column 1");
		mv.addObject("userClickPortfolio1Col", true);
		return mv;

	}

	@RequestMapping(value = "/portfolio-2-col")
	public ModelAndView portfolio_2_col() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Portfolio Column 2");
		mv.addObject("userClickPortfolio2Col", true);
		return mv;

	}

	@RequestMapping(value = "/portfolio-3-col")
	public ModelAndView portfolio_3_col() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Portfolio Column 3");
		mv.addObject("userClickPortfolio3Col", true);
		return mv;

	}

	@RequestMapping(value = "/portfolio-4-col")
	public ModelAndView portfolio_4_col() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Portfolio Column 4");
		mv.addObject("userClickPortfolio4Col", true);
		return mv;

	}

	@RequestMapping(value = "/portfolio-item")
	public ModelAndView portfolio_item() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Portfolio Item");
		mv.addObject("userClickPortfolioItem", true);
		return mv;

	}

	@RequestMapping(value = "/blog-home-1")
	public ModelAndView blog_home_1() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Blog Home 1");
		mv.addObject("userClickBlogHome1", true);
		return mv;

	}

	@RequestMapping(value = "/blog-home-2")
	public ModelAndView blog_home_2() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Blog Home 2");
		mv.addObject("userClickBlogHome2", true);
		return mv;

	}

	@RequestMapping(value = "/blog-post")
	public ModelAndView blog_post() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Blog Post");
		mv.addObject("userClickBlogPost", true);
		return mv;

	}
	//------------------------------------------------------------
		//Employee form
		//------------------------------------------------------------

	@RequestMapping(value = "/fullWidth")
	public ModelAndView fullWidth() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Full Width Page");
		mv.addObject("userClickFullWidth", true);
		return mv;

	}

	@RequestMapping(value = "/sideBar")
	public ModelAndView sideBar() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Side Bar Page");
		mv.addObject("userClickSideBar", true);
		return mv;

	}

	@RequestMapping(value = "/faq")
	public ModelAndView faq() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "FAQ");
		mv.addObject("userClickFaq", true);
		return mv;

	}

	@RequestMapping(value = "/page404")
	public ModelAndView page404() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "404");
		mv.addObject("userClickPage404", true);
		return mv;

	}

	@RequestMapping(value = "/pricing")
	public ModelAndView pricing() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Pricing Table");
		mv.addObject("userClickPricing", true);
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
	public String addemployee(@Valid @ModelAttribute("employee") Employee mEmployee, BindingResult results, Model model,
			HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickEmployee", true);
			model.addAttribute("title", "Employee");
			return "page";
		}
		System.out.println(mEmployee.getJoinDate());
		employeeDAO.add(mEmployee);
		return "redirect:/employee";
	}

	@RequestMapping(value = "/manifest", method = RequestMethod.GET)
	public ModelAndView manifest() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Manifest");
		mv.addObject("userClickManifest", true);
		Manifest nManifest = new Manifest();
		mv.addObject("manifest", nManifest);
		return mv;
	}

	@RequestMapping(value = "/manifest", method = RequestMethod.POST)
	public String addManifest(@Valid @ModelAttribute("manifest") Manifest mManifest, BindingResult results, Model model,
			HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickManifest", true);
			model.addAttribute("title", "Manifest");
			return "page";
		}
		manifestDAO.add(mManifest);
		return "redirect:/manifest";
	}
	@RequestMapping(value = "/manifest-detail", method = RequestMethod.GET)
	public ModelAndView manifestDetail() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Manifest Detail");
		mv.addObject("userClickManifestDetail", true);
		ManifestDetail nManifestDetail = new ManifestDetail();
		mv.addObject("manifestDetail", nManifestDetail);
		return mv;
	}

	@RequestMapping(value = "/manifest-detail", method = RequestMethod.POST)
	public String addManifestDetail(@Valid @ModelAttribute("manifestDetail") ManifestDetail mManifestDetail, BindingResult results, Model model,
			HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickManifestDetail", true);
			model.addAttribute("title", "Manifest Detail");
			return "page";
		}
		manifestDAO.addDetail(mManifestDetail);
		return "redirect:/manifest_detail";
	}
	@RequestMapping(value = "/delivery", method = RequestMethod.GET)
	public ModelAndView delivery() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Delivery");
		mv.addObject("userClickDelivery", true);
		Delivery nDelivery = new Delivery();
		mv.addObject("delivery", nDelivery);
		return mv;

	}

	@RequestMapping(value = "/delivery", method = RequestMethod.POST)
	public String addDelivery(@Valid @ModelAttribute("delivery") Delivery mDelivery, BindingResult results, Model model,
			HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickDelivery", true);
			model.addAttribute("title", "Delivery");
			return "page";
		}
		deliveryDAO.add(mDelivery);
		return "redirect:/delivery";
	}
	
	@RequestMapping(value = "/delivery-detail", method = RequestMethod.GET)
	public ModelAndView deliveryDetail() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Delivery Detail");
		mv.addObject("userClickDeliveryDetail", true);
		DeliveryDetail nDeliveryDetail = new DeliveryDetail();
		mv.addObject("deliveryDetail", nDeliveryDetail);
		return mv;

	}
	@RequestMapping(value = "/delivery-detail", method = RequestMethod.POST)
	public String addDeliveryDetail(@Valid @ModelAttribute("deliveryDetail") DeliveryDetail mDeliveryDetail, BindingResult results, Model model,
			HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickDeliveryDetail", true);
			model.addAttribute("title", "Delivery Detail");
			return "page";
		}
		deliveryDAO.addDetail(mDeliveryDetail);
		return "redirect:/delivery_detail";
	}
	
	@RequestMapping(value = "/book-info", method = RequestMethod.GET)
	public ModelAndView bookInfo() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Book Info");
		mv.addObject("userClickBookInfo", true);
		BookInfo nBookInfo = new BookInfo();
		mv.addObject("bookInfo", nBookInfo);
		return mv;

	}
	@RequestMapping(value = "/book-info", method = RequestMethod.POST)
	public String addBookInfo(@Valid @ModelAttribute("bookInfo") BookInfo mBookInfo, BindingResult results, Model model,
			HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickBookInfo", true);
			model.addAttribute("title", "Book Info");
			return "page";
		}
		bookInfoDAO.add(mBookInfo);
		return "redirect:/book-info";
	}
}
