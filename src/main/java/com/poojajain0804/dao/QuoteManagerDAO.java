package com.poojajain0804.dao;

import com.poojajain0804.model.Quote;

public interface QuoteManagerDAO {

	void save(Quote newQuote);
	public void updateQuote(Quote quote);
	public int deleteQuote(int Id);

}
