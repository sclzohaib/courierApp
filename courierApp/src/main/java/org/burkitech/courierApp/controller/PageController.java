package org.burkitech.courierApp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.burkitech.courierApp.dao.BookInfoDAO;
import org.burkitech.courierApp.dao.CityDAO;
import org.burkitech.courierApp.dao.CreditCardDAO;
import org.burkitech.courierApp.dao.CustomerDAO;
import org.burkitech.courierApp.dao.CustomerTarrifDAO;
import org.burkitech.courierApp.dao.DeliveryDAO;
import org.burkitech.courierApp.dao.EmployeeDAO;
import org.burkitech.courierApp.dao.HandInstrDAO;
import org.burkitech.courierApp.dao.IntSectorDAO;
import org.burkitech.courierApp.dao.ItemDAO;
import org.burkitech.courierApp.dao.ManifestDAO;
import org.burkitech.courierApp.dao.PaymentModeDAO;
import org.burkitech.courierApp.dao.ProductDAO;
import org.burkitech.courierApp.dao.SectorDAO;
import org.burkitech.courierApp.dao.ServiceDAO;
import org.burkitech.courierApp.dto.BookInfo;
import org.burkitech.courierApp.dto.City;
import org.burkitech.courierApp.dto.CreditCard;
import org.burkitech.courierApp.dto.Customer;
import org.burkitech.courierApp.dto.CustomerTarrif;
import org.burkitech.courierApp.dto.Delivery;
import org.burkitech.courierApp.dto.DeliveryDetail;
import org.burkitech.courierApp.dto.Employee;
import org.burkitech.courierApp.dto.HandInstr;
import org.burkitech.courierApp.dto.IntSector;
import org.burkitech.courierApp.dto.Item;
import org.burkitech.courierApp.dto.Items;
import org.burkitech.courierApp.dto.Manifest;
import org.burkitech.courierApp.dto.ManifestDetail;
import org.burkitech.courierApp.dto.PaymentMode;
import org.burkitech.courierApp.dto.Product;
import org.burkitech.courierApp.dto.Sector;
import org.burkitech.courierApp.dto.Service;
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

	@Autowired
	private CityDAO cityDAO;

	@Autowired
	private CreditCardDAO creditCardDAO;

	@Autowired
	private CustomerDAO customerDAO;

	@Autowired
	private CustomerTarrifDAO customerTarrifDAO;

	@Autowired
	private HandInstrDAO handInstrDAO;

	@Autowired
	private IntSectorDAO intSectorDAO;

	@Autowired
	private ItemDAO itemDAO;

	@Autowired
	private PaymentModeDAO paymentModeDAO;

	@Autowired
	private ProductDAO productDAO;

	@Autowired
	private SectorDAO sectorDAO;

	@Autowired
	private ServiceDAO serviceDAO;

	// ------------------------------------------------------------
	// Pages
	// ------------------------------------------------------------
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

	// ------------------------------------------------------------
	// Employee from
	// ------------------------------------------------------------
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

	// ------------------------------------------------------------
	// menifest form
	// ------------------------------------------------------------
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

	// ------------------------------------------------------------
	// menifest detail form
	// ------------------------------------------------------------
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
	public String addManifestDetail(@Valid @ModelAttribute("manifestDetail") ManifestDetail mManifestDetail,
			BindingResult results, Model model, HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickManifestDetail", true);
			model.addAttribute("title", "Manifest Detail");
			return "page";
		}
		manifestDAO.addDetail(mManifestDetail);
		return "redirect:/manifest_detail";
	}

	// ------------------------------------------------------------
	// delivery form
	// ------------------------------------------------------------
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
			model.addAttribute("userClickDeliveryDetail", true);
			model.addAttribute("title", "Delivery Detail");
			return "page";
		}
		// deliveryDAO.add(mDelivery);
		return "redirect:/delivery-detail";
	}

	// ------------------------------------------------------------
	// delivery detail form
	// ------------------------------------------------------------
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
	public String addDeliveryDetail(@Valid @ModelAttribute("deliveryDetail") DeliveryDetail mDeliveryDetail,
			BindingResult results, Model model, HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickDeliveryDetail", true);
			model.addAttribute("title", "Delivery Detail");
			return "page";
		}
		deliveryDAO.addDetail(mDeliveryDetail);
		return "redirect:/delivery-detail";
	}

	// ------------------------------------------------------------
	// book info form
	// ------------------------------------------------------------
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

	// ------------------------------------------------------------
	// City from
	// ------------------------------------------------------------
	@RequestMapping(value = "/city", method = RequestMethod.GET)
	public ModelAndView city() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "City");
		mv.addObject("userClickCity", true);
		City nCity = new City();
		mv.addObject("city", nCity);
		return mv;
	}

	@RequestMapping(value = "/city", method = RequestMethod.POST)
	public String addcity(@Valid @ModelAttribute("city") City nCity, BindingResult results, Model model,
			HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickCity", true);
			model.addAttribute("title", "City");
			return "page";
		}

		cityDAO.add(nCity);
		return "redirect:/city";
	}

	// ------------------------------------------------------------
	// Creditcard form
	// ------------------------------------------------------------
	@RequestMapping(value = "/creditcard", method = RequestMethod.GET)
	public ModelAndView creditcard() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Credit Card");
		mv.addObject("userClickCreditCard", true);
		CreditCard nCreditCard = new CreditCard();
		mv.addObject("creditcard", nCreditCard);
		return mv;
	}

	@RequestMapping(value = "/creditcard", method = RequestMethod.POST)
	public String addcreditcard(@Valid @ModelAttribute("creditcard") CreditCard nCreditCard, BindingResult results,
			Model model, HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickCreditCard", true);
			model.addAttribute("title", "Credit Card");
			return "page";
		}

		creditCardDAO.add(nCreditCard);
		return "redirect:/creditcard";
	}

	// ------------------------------------------------------------
	// Customer form
	// ------------------------------------------------------------
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public ModelAndView customer() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Customer");
		mv.addObject("userClickCustomer", true);
		Customer nCustomer = new Customer();
		mv.addObject("customer", nCustomer);
		return mv;
	}

	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public String addcustomer(@Valid @ModelAttribute("customer") Customer nCustomer, BindingResult results, Model model,
			HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickCustomer", true);
			model.addAttribute("title", "Customer");
			return "page";
		}

		customerDAO.add(nCustomer);
		return "redirect:/customer";
	}

	// ------------------------------------------------------------
	// Customer Tarrif form
	// ------------------------------------------------------------
	@RequestMapping(value = "/customer-tarrif", method = RequestMethod.GET)
	public ModelAndView customerTarrif() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Customer Tarrif");
		mv.addObject("userClickCustomerTarrif", true);
		CustomerTarrif nCustomerTarrif = new CustomerTarrif();
		mv.addObject("customerTarrif", nCustomerTarrif);
		return mv;
	}

	@RequestMapping(value = "/customer-tarrif", method = RequestMethod.POST)
	public String addcustomerTarrif(@Valid @ModelAttribute("customerTarrif") CustomerTarrif nCustomerTarrif,
			BindingResult results, Model model, HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickCustomerTarrif", true);
			model.addAttribute("title", "Customer Tarrif");
			return "page";
		}

		customerTarrifDAO.add(nCustomerTarrif);
		return "redirect:/customer-tarrif";
	}

	// ------------------------------------------------------------
	// Hand Instr form
	// ------------------------------------------------------------
	@RequestMapping(value = "/hand-instr", method = RequestMethod.GET)
	public ModelAndView handInstr() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Hand Instr");
		mv.addObject("userClickHandInstr", true);
		HandInstr nHandInstr = new HandInstr();
		mv.addObject("handInstr", nHandInstr);
		return mv;
	}

	@RequestMapping(value = "/hand-instr", method = RequestMethod.POST)
	public String addhandInstr(@Valid @ModelAttribute("handInstr") HandInstr nHandInstr, BindingResult results,
			Model model, HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickHandInstr", true);
			model.addAttribute("title", "Hand Instr");
			return "page";
		}

		handInstrDAO.add(nHandInstr);
		return "redirect:/hand-instr";
	}

	// ------------------------------------------------------------
	// Int Sector form
	// ------------------------------------------------------------
	@RequestMapping(value = "/int-sector", method = RequestMethod.GET)
	public ModelAndView intSector() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Int Sector");
		mv.addObject("userClickIntSector", true);
		IntSector nIntSector = new IntSector();
		mv.addObject("intSector", nIntSector);
		return mv;
	}

	@RequestMapping(value = "/int-sector", method = RequestMethod.POST)
	public String addintSector(@Valid @ModelAttribute("intSector") IntSector nIntSector, BindingResult results,
			Model model, HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickIntSector", true);
			model.addAttribute("title", "Int Sector");
			return "page";
		}

		intSectorDAO.add(nIntSector);
		return "redirect:/int-sector";
	}

	// ------------------------------------------------------------
	// Item form
	// ------------------------------------------------------------
	@RequestMapping(value = "/item", method = RequestMethod.GET)
	public ModelAndView item() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Item");
		mv.addObject("userClickItem", true);
		Item nItem = new Item();
		mv.addObject("item", nItem);
		return mv;
	}

	@RequestMapping(value = "/item", method = RequestMethod.POST)
	public String addItem(@Valid @ModelAttribute("item") Item nItem, BindingResult results, Model model,
			HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickItem", true);
			model.addAttribute("title", "Item");
			return "page";
		}

		itemDAO.add(nItem);
		return "redirect:/item";
	}

	// ------------------------------------------------------------
	// Items form
	// ------------------------------------------------------------
	@RequestMapping(value = "/items", method = RequestMethod.GET)
	public ModelAndView items() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Items");
		mv.addObject("userClickItems", true);
		Items nItems = new Items();
		mv.addObject("items", nItems);
		return mv;
	}

	@RequestMapping(value = "/items", method = RequestMethod.POST)
	public String addItems(@Valid @ModelAttribute("items") Items nItems, BindingResult results, Model model,
			HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickItems", true);
			model.addAttribute("title", "Items");
			return "page";
		}

		itemDAO.addItems(nItems);
		return "redirect:/items";
	}

	// ------------------------------------------------------------
	// Payment Mode form
	// ------------------------------------------------------------
	@RequestMapping(value = "/payment-mode", method = RequestMethod.GET)
	public ModelAndView paymentMode() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Payment Mode");
		mv.addObject("userClickPaymentMode", true);
		PaymentMode nPaymentMode = new PaymentMode();
		mv.addObject("paymentMode", nPaymentMode);
		return mv;
	}

	@RequestMapping(value = "/payment-mode", method = RequestMethod.POST)
	public String addpaymentMode(@Valid @ModelAttribute("paymentMode") PaymentMode nPaymentMode, BindingResult results,
			Model model, HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickPaymentMode", true);
			model.addAttribute("title", "Payment Mode");
			return "page";
		}

		paymentModeDAO.add(nPaymentMode);
		return "redirect:/payment-mode";
	}

	// ------------------------------------------------------------
	// Product form
	// ------------------------------------------------------------
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public ModelAndView product() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Product");
		mv.addObject("userClickProduct", true);
		Product nProduct = new Product();
		mv.addObject("product", nProduct);
		return mv;
	}

	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public String addproduct(@Valid @ModelAttribute("product") Product nProduct, BindingResult results, Model model,
			HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickProduct", true);
			model.addAttribute("title", "Product");
			return "page";
		}

		productDAO.add(nProduct);
		return "redirect:/product";
	}

	// ------------------------------------------------------------
	// Sector form
	// ------------------------------------------------------------
	@RequestMapping(value = "/sector", method = RequestMethod.GET)
	public ModelAndView sector() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Sector");
		mv.addObject("userClickSector", true);
		Sector nSector = new Sector();
		mv.addObject("sector", nSector);
		return mv;
	}

	@RequestMapping(value = "/sector", method = RequestMethod.POST)
	public String addsector(@Valid @ModelAttribute("sector") Sector mSector, BindingResult results, Model model,
			HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickSector", true);
			model.addAttribute("title", "Sector");
			return "page";
		}

		sectorDAO.add(mSector);
		return "redirect:/sector";
	}

	// ------------------------------------------------------------
	// Service form
	// ------------------------------------------------------------
	@RequestMapping(value = "/service", method = RequestMethod.GET)
	public ModelAndView service() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Service");
		mv.addObject("userClickService", true);
		Service nService = new Service();
		mv.addObject("service", nService);
		return mv;
	}

	@RequestMapping(value = "/service", method = RequestMethod.POST)
	public String addservice(@Valid @ModelAttribute("service") Service mService, BindingResult results, Model model,
			HttpServletRequest request) {
		if (results.hasErrors()) {
			model.addAttribute("userClickService", true);
			model.addAttribute("title", "Service");
			return "page";
		}

		serviceDAO.add(mService);
		return "redirect:/service";
	}

}
