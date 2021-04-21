package com.comviva.onlineclinicsystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comviva.onlineclinicsystem.bean.AppointmentBean;
import com.comviva.onlineclinicsystem.dao.AppointmentDao;

@Service
public class AppointmentService {
	@Autowired
	private AppointmentDao ad;
	
	@Transactional
	public int addAppointment(AppointmentBean a) {
		return ad.addAppointment(a);
	}
	
	@Transactional
	public AppointmentBean getOne(int id) {
		return ad.getOne(id);
	}
	
	@Transactional
	public List<AppointmentBean> getAll(){
		return ad.getAll();
	}
}
