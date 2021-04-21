package com.comviva.onlineclinicsystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comviva.onlineclinicsystem.bean.PatientBean;
import com.comviva.onlineclinicsystem.dao.PatientDao;

@Service
public class PatientService {
	@Autowired
	private PatientDao pd;
	
	@Transactional
	public int addPatient(PatientBean p) {
		return pd.addPatient(p);
	}
	
	@Transactional
	public PatientBean getOne(int id) {
		return pd.getOne(id);
	}
	
	@Transactional
	public List<PatientBean> getAll(){
		return pd.getAll();
	}
}
