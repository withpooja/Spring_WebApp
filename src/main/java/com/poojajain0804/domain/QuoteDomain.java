package com.poojajain0804.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name="quotes_details")
public class QuoteDomain {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="quote_seq")
	@SequenceGenerator(name="quote_seq", sequenceName="Quote_Id" )
	private int id;
	private String quotation;
	private String category;
	private String author;
	
	
	public QuoteDomain() {
		this.setAuthor("Pooja");
		this.setCategory("Love & Grief");
		this.setQuotation("");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
	

}
