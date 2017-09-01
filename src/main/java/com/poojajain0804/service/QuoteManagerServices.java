package com.poojajain0804.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poojajain0804.dao.QuoteManagerDAO;
import com.poojajain0804.domain.QuoteDomain;
import com.poojajain0804.model.Quote;

@Service
public class QuoteManagerServices {

	@Autowired
	QuoteManagerDAO objQuoteManagerDAO;
	
	
	public QuoteManagerDAO getObjQuoteManagerDAO() {
		return objQuoteManagerDAO;
	}


	public void setObjQuoteManagerDAO(QuoteManagerDAO objQuoteManagerDAO) {
		this.objQuoteManagerDAO = objQuoteManagerDAO;
	}


	public void save(Quote newQuote) {
		
		QuoteDomain objQuoteDomain= new QuoteDomain();
		if (newQuote.getUid()!=0)
			objQuoteDomain.setId(newQuote.getUid());
		objQuoteDomain.setAuthor(newQuote.getAuthor());
		objQuoteDomain.setCategory(newQuote.getCategory());
		objQuoteDomain.setQuotation(newQuote.getQuotation());
		
		objQuoteManagerDAO.save(objQuoteDomain);
	}


	public List<Quote> getAllQuote() {
		List<Quote>objQuotes= new ArrayList<Quote>();
		List<QuoteDomain> objAllQuoteDomain=objQuoteManagerDAO.getAllQuotationDAO();
		for (QuoteDomain obj:objAllQuoteDomain)
		{
			Quote quote= new Quote();
			quote.setUid(obj.getId());
			quote.setAuthor(obj.getAuthor());
			quote.setCategory(obj.getCategory());
			quote.setQuotation(obj.getQuotation());
			objQuotes.add(quote);
		}
		return 	objQuotes;
	}


	public void deleteQuote(int id) {
		objQuoteManagerDAO.deleteQuote(id);
		System.out.println("done");
	}


	public Quote getQuote(int id) {
		QuoteDomain quoteDomain =objQuoteManagerDAO.getQuote(id);
		return new Quote(quoteDomain.getQuotation(),quoteDomain.getCategory(),quoteDomain.getAuthor(),quoteDomain.getId());
	}

}
