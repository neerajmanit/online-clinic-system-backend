package com.comviva.onlineclinicsystem.dao;


import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.comviva.onlineclinicsystem.bean.AppointmentBean;

@Repository
public class AppointmentDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public int addAppointment(AppointmentBean a) {
		if(a!=null) {
			Session s=sessionFactory.openSession();
			Transaction t=s.beginTransaction();
			s.save(a);
			t.commit();
			s.close();
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public AppointmentBean getOne(int id) {
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		AppointmentBean a=(AppointmentBean)s.get(AppointmentBean.class, id);
		t.commit();
		s.close();
		return a;
	}
	
	public List<AppointmentBean> getAll(){
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		Query query=s.createQuery("from AppointmentBean");
		List<AppointmentBean> result=query.getResultList();
		t.commit();
		s.close();
		return result;
	}
}
