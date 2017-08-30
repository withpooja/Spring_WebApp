package com.poojajain0804.dao;

import com.poojajain0804.domain.QuoteDomain;

public interface QuoteManagerDAO {

	void save(QuoteDomain newQuote);
	public void updateQuote(QuoteDomain quote);
	public int deleteQuote(int Id);

}
