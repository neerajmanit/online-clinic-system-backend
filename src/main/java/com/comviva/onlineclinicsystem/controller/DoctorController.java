package com.comviva.onlineclinicsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.comviva.onlineclinicsystem.bean.DoctorBean;
import com.comviva.onlineclinicsystem.service.DoctorService;

@RestController
public class DoctorController {
	@Autowired
	private DoctorService ds;
	
	@GetMapping("/doctors")
	public List<DoctorBean> getAllDoctors() {
		List<DoctorBean> result=ds.getAll();
		return result;
		
	}
	
	@GetMapping("/doctors/{id}")
	public ResponseEntity<DoctorBean> getOneDoctor(@PathVariable(value = "id") int id) {
		DoctorBean d=ds.getOne(id);
		if(d!=null) {
			return new ResponseEntity<DoctorBean>(d,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<DoctorBean>(d,HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/doctors")
	public String addDoctors(@RequestBody DoctorBean d) {
		int result=ds.addDoctor(d);
		if(result==1) {
			return("Doctor user id is "+d.getDoctorID());
		}
		else {
			return("error");
		}
	}
}
