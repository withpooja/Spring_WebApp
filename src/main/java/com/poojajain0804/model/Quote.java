package com.poojajain0804.model;

import org.springframework.stereotype.Component;

@Component
public class Quote {

	
	private String quotation;
	private String category;
	private String author;
	
	
	public Quote() {
		super();
	}
	
	public Quote(String quotation, String category, String author) {
		super();
		this.quotation = quotation;
		this.category = category;
		this.author = author;
	}

	public String getQuotation() {
		return quotation;
	}
	public void setQuotation(String quotation) {
		this.quotation = quotation;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Quote [quotation=" + quotation + ", category=" + category + ", author=" + author + "]";
	}
	
	
}
