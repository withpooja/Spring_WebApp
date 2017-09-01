package com.poojajain0804.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.poojajain0804.domain.QuoteDomain;

@Repository
public class QuoteManagerDAOImpl extends HibernateDaoSupport implements QuoteManagerDAO {

	public QuoteManagerDAOImpl() {
	}

	@Autowired
	public QuoteManagerDAOImpl(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	public void save(QuoteDomain newQuote) {
		Session objSession = getSessionFactory().openSession();
		objSession.beginTransaction();
		objSession.saveOrUpdate(newQuote);
		objSession.getTransaction().commit();
		objSession.close();
	}

	public int deleteQuote(int uid) {
		System.out.println(uid);
		Session session = getSessionFactory().openSession();
		Query q1=session.createQuery("delete QuoteDomain where id = :id");
		q1.setInteger("id", uid);
		System.out.println(q1);
		session.beginTransaction();
		int result = q1.executeUpdate();
		if (result<=1){
			session.getTransaction().commit();
		}else{
			session.getTransaction().rollback();
		}
		session.close();
		return result;
	}

	public void updateQuote(QuoteDomain quote) {

	}

	public List<QuoteDomain> getAllQuotationDAO() {
		Session session= getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("from QuoteDomain");
		List<QuoteDomain> objQuotesList=query.list();
		session.getTransaction().commit();	
		session.close();
		return objQuotesList;
	}

	public QuoteDomain getQuote(int id) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		QuoteDomain quoteDomain;
		quoteDomain= (QuoteDomain) session.get(QuoteDomain.class, id);
		session.getTransaction().commit();
		session.close();
		return quoteDomain;
	}

}
