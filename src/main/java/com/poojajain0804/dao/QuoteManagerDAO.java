package com.poojajain0804.dao;

import java.util.List;

import com.poojajain0804.domain.QuoteDomain;
import com.poojajain0804.model.Quote;

public interface QuoteManagerDAO {

	void save(QuoteDomain newQuote);
	public void updateQuote(QuoteDomain quote);
	public int deleteQuote(int Id);
	List<QuoteDomain> getAllQuotationDAO();
	QuoteDomain getQuote(int id);

}
