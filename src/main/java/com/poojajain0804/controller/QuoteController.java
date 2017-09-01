package com.poojajain0804.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poojajain0804.model.Quote;
import com.poojajain0804.service.QuoteManagerServices;
@Controller
public class QuoteController {

	@Autowired
	QuoteManagerServices objQuoteManagerServices;

	public QuoteManagerServices getObjQuoteManagerServices() {
		return objQuoteManagerServices;
	}

	public void setObjQuoteManagerServices(QuoteManagerServices objQuoteManagerServices) {
		this.objQuoteManagerServices = objQuoteManagerServices;
	}

	@RequestMapping({"/","login"})
	public String home(){
		return "loginPage";
	}
	
	@RequestMapping(value="/home", method= {RequestMethod.POST, RequestMethod.GET})
	public String quotationHome(){
		System.out.println("quotationHome controller");
		return "quotationHome";
	}
	
	@RequestMapping(value="/addition")
	public String addition(Model objModel){
		Quote objQuote= new Quote();
		objModel.addAttribute("quotationToAdd",objQuote);
		return "addNewQuote";
	}
	
	@RequestMapping(value="/saveQuote", method=RequestMethod.POST)
	public String saveQuote(@ModelAttribute("quotationToAdd") Quote newQuote){
		System.out.println(newQuote.toString());
		objQuoteManagerServices.save(newQuote);
		return "redirect:home";
	}
	
	@RequestMapping(value="/listing")
	public String showAllQuote(Model model){
		System.out.println("show all quote controller");
		List<Quote> allQuote = objQuoteManagerServices.getAllQuote();
		model.addAttribute("allQuotes",allQuote);
		return "listAllQuote";
	}
	
	@RequestMapping(value="/deletion/{uid}", method=RequestMethod.GET)
	public String deleteQuote(@PathVariable("uid") int id, Model model){
		System.out.println("id"+id);
		objQuoteManagerServices.deleteQuote(id);
		return "redirect:/home";
	}

	@RequestMapping(value="/updateQuote/{uid}", method=RequestMethod.GET)
	public String editQuote(@PathVariable("uid")int id, Model model){
		Quote quote=objQuoteManagerServices.getQuote(id);
		model.addAttribute("quotationToAdd",quote);
		return "addNewQuote";
	}
}