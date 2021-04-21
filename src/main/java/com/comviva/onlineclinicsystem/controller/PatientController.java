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

import com.comviva.onlineclinicsystem.bean.PatientBean;
import com.comviva.onlineclinicsystem.service.PatientService;

@RestController
public class PatientController {
	@Autowired
	private PatientService ps;
	
	@PostMapping("/patients")
	public String addPatient(@RequestBody PatientBean p) {
		int result=ps.addPatient(p);
		if(result==1) {
			return ("Your patient id is "+ p.getPatientID());
		}
		else {
			return ("Error");
		}
	}
	
	@GetMapping("/patients/{id}")
	public ResponseEntity<PatientBean> getOnePatient(@PathVariable(value="id") int id) {
		PatientBean p=ps.getOne(id);
		if(p!=null) {
			return new ResponseEntity<PatientBean>(p,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<PatientBean>(p,HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/patients")
	public List<PatientBean> getAllPatient(){
		List<PatientBean> result=ps.getAll();
		return result;
	}
}
