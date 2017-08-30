package com.poojajain0804.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.poojajain0804.domain.QuoteDomain;
import com.poojajain0804.model.Quote;

@Repository
public class QuoteManagerDAOImpl extends HibernateDaoSupport implements QuoteManagerDAO{

	
	public QuoteManagerDAOImpl() {
	}

	@Autowired
	public QuoteManagerDAOImpl(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	
	public void save(QuoteDomain newQuote) {
		Session objSession= getSessionFactory().openSession();
		objSession.beginTransaction();
		objSession.saveOrUpdate(newQuote);
		objSession.getTransaction().commit();
		objSession.close();
	}

	public void updateQuote(Quote quote) {
		
	}

	public int deleteQuote(int Id) {
		return 0;
	}

}
