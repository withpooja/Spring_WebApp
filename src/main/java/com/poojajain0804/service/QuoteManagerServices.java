package com.poojajain0804.service;

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
		objQuoteDomain.setAuthor(newQuote.getAuthor());
		objQuoteDomain.setCategory(newQuote.getCategory());
		objQuoteDomain.setQuotation(newQuote.getQuotation());
		
		objQuoteManagerDAO.save(objQuoteDomain);
	}

}
