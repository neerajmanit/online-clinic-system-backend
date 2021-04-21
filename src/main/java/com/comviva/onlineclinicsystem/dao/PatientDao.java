package com.comviva.onlineclinicsystem.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.comviva.onlineclinicsystem.bean.PatientBean;

@Repository
public class PatientDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public int addPatient(PatientBean p) {
		if(p!=null) {
			Session s=sessionFactory.openSession();
			Transaction t=s.beginTransaction();
			s.save(p);
			t.commit();
			s.close();
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public PatientBean getOne(int id) {
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		PatientBean p=(PatientBean)s.get(PatientBean.class, id);
		t.commit();
		s.close();
		return p;
	}
	
	public List<PatientBean> getAll(){
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		Query query=s.createQuery("from PatientBean");
		List<PatientBean> result=query.getResultList();
		t.commit();
		s.close();
		return result;
	}
}
