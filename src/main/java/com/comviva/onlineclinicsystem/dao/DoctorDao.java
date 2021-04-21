package com.comviva.onlineclinicsystem.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.comviva.onlineclinicsystem.bean.DoctorBean;

@Repository
public class DoctorDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public int addDoctor(DoctorBean d) {
		if(d!=null) {
			Session s=sessionFactory.openSession();
			Transaction t=s.beginTransaction();
			s.save(d);
			t.commit();
			s.close();
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public DoctorBean getOne(int id) {
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		DoctorBean d=(DoctorBean)s.get(DoctorBean.class, id);
		t.commit();
		s.close();
		return d;
	}
	
	public List<DoctorBean> getAll(){
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		Query query=s.createQuery("from DoctorBean");
		List<DoctorBean> result=query.getResultList();
		t.commit();
		s.close();
		return result;
	}
}
