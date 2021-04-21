package com.comviva.onlineclinicsystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comviva.onlineclinicsystem.bean.DoctorBean;
import com.comviva.onlineclinicsystem.dao.DoctorDao;

@Service
public class DoctorService {
	@Autowired
	private DoctorDao dd;
	
	@Transactional
	public int addDoctor(DoctorBean d) {
		return dd.addDoctor(d);
	}
	
	@Transactional
	public DoctorBean getOne(int id) {
		return dd.getOne(id);
	}
	
	@Transactional
	public List<DoctorBean> getAll(){
		return dd.getAll();
	}
}
