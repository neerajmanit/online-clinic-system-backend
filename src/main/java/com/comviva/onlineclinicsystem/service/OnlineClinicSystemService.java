package com.comviva.onlineclinicsystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comviva.onlineclinicsystem.bean.CredentialsBean;
import com.comviva.onlineclinicsystem.bean.ProfileBean;
import com.comviva.onlineclinicsystem.dao.OnlineClinicSystemDao;

@Service
public class OnlineClinicSystemService {
	
	@Autowired
	private OnlineClinicSystemDao ocsd;
	
	@Transactional
	public int addPatient(ProfileBean p, CredentialsBean c) {
		return ocsd.addPatient(p,c);
	}
	
	@Transactional
	public ProfileBean getOne(int id) {
		return ocsd.getOne(id);
	}
	
	@Transactional
	public List<ProfileBean> getAll(){
		return ocsd.getAll();
	}
}
