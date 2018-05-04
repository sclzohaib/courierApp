package org.burkitech.courierApp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.burkitech.courierApp.dao.BookInfoDAO;
import org.burkitech.courierApp.dao.CityDAO;
import org.burkitech.courierApp.dao.DeliveryDAO;
import org.burkitech.courierApp.dao.EmployeeDAO;
import org.burkitech.courierApp.dao.HandInstrDAO;
import org.burkitech.courierApp.dao.PaymentModeDAO;
import org.burkitech.courierApp.dao.ProductDAO;
import org.burkitech.courierApp.dao.RouteDAO;
import org.burkitech.courierApp.dao.ServiceDAO;
import org.burkitech.courierApp.dto.City;
import org.burkitech.courierApp.dto.Delivery;
import org.burkitech.courierApp.dto.HandInstr;
import org.burkitech.courierApp.dto.NewBookInfo;
import org.burkitech.courierApp.dto.NewDelivery;
import org.burkitech.courierApp.dto.PaymentMode;
import org.burkitech.courierApp.dto.Product;
import org.burkitech.courierApp.dto.Route;
import org.burkitech.courierApp.dto.Service;
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
	@Autowired
	private CityDAO cityDAO;
	@Autowired
	private ServiceDAO serviceDAO;
	@Autowired
	private PaymentModeDAO paymentModeDAO;
	@Autowired
	private HandInstrDAO handInstrDAO;
	@Autowired
	private DeliveryDAO deliveryDAO;
	@Autowired
	private RouteDAO routeDAO;
	@Autowired
	private EmployeeDAO employeeDAO;
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
	public String addBookInfo(@Valid @ModelAttribute("bookInfo") NewBookInfo mBookInfo, BindingResult results,
			Model model, HttpServletRequest request) {
		if (results.hasErrors()) {
			System.out.println(results.toString());
			model.addAttribute("userClickBookInfo", true);
			model.addAttribute("title", "Book Info");
			return "page";
		}
		bookInfoDAO.add(mBookInfo);
		return "redirect:/book-info";
	}

	// ------------------------------------------------------------
	// delivery form
	// ------------------------------------------------------------
	@RequestMapping(value = "/delivery", method = RequestMethod.GET)
	public ModelAndView delivery() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Delivery");
		mv.addObject("userClickDelivery", true);
		NewDelivery nDelivery = new NewDelivery();
		mv.addObject("delivery", nDelivery);
		return mv;

	}

	@RequestMapping(value = "/delivery", method = RequestMethod.POST)
	public String addDelivery(@Valid @ModelAttribute("delivery") NewDelivery mDelivery, BindingResult results, Model model,
			HttpServletRequest request) {
		if (results.hasErrors()) {
			System.out.println(results.toString());
			model.addAttribute("userClickDelivery", true);
			model.addAttribute("title", "Delivery");
			return "page";
		}
		 deliveryDAO.add(mDelivery);
		return "redirect:/delivery";
	}

	// ---------------------------------------------------------------------------------
	// returning categories for all request mapping
	@ModelAttribute("products")
	public List<Product> getProducts() {
		return productDAO.productList();
	}

	// ---------------------------------------------------------------------------------
	// returning cities for all request mapping
	@ModelAttribute("cities")
	public List<City> getCity() {
		return cityDAO.cityList();
	}

	// ---------------------------------------------------------------------------------
	// returning service types for all request mapping
	@ModelAttribute("services")
	public List<Service> getService() {
		return serviceDAO.serviceList();
	}

	// ---------------------------------------------------------------------------------
	// returning payment modes for all request mapping
	@ModelAttribute("paymentModes")
	public List<PaymentMode> getPaymentMode() {
		return paymentModeDAO.paymentModeList();
	}

	// ---------------------------------------------------------------------------------
	// returning payment modes for all request mapping
	@ModelAttribute("handlInstr")
	public List<HandInstr> getHandlInstr() {
		return handInstrDAO.handlInstrList();
	}
	// ---------------------------------------------------------------------------------
		// returning routes modes for all request mapping
		@ModelAttribute("routes")
		public List<Route> getRoute() {
			return routeDAO.routeList();
		}
		// ---------------------------------------------------------------------------------
				// returning employees modes for all request mapping
				@ModelAttribute("employees")
				public List<Route> getEmployee() {
					return employeeDAO.employeeList();
				}
}
