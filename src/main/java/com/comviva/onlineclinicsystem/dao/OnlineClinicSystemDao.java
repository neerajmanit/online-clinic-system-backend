package com.comviva.onlineclinicsystem.dao;


import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.comviva.onlineclinicsystem.bean.CredentialsBean;
import com.comviva.onlineclinicsystem.bean.ProfileBean;


@Repository
public class OnlineClinicSystemDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public int addPatient(ProfileBean p, CredentialsBean c) {
		if(p!=null ) {
			Session s=sessionFactory.openSession();
			Transaction t=s.beginTransaction();
			s.save(p);
			t.commit();
			s.close();
			Session s2=sessionFactory.openSession();
			Transaction t2=s2.beginTransaction();
			c.setUserID(p.getUserID());
			c.setPassword(p.getPassword());
			s2.save(c);
			t2.commit();
			s2.close();
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public ProfileBean getOne(int id) {
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		ProfileBean p=(ProfileBean)s.get(ProfileBean.class, id);
		t.commit();
		s.close();
		return p;
	}
	
	public List<ProfileBean> getAll(){
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		Query query=s.createQuery("from ProfileBean");
		List<ProfileBean> result=query.getResultList();
		t.commit();
		s.close();
		return result;
	}
}
