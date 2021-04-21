package com.comviva.onlineclinicsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comviva.onlineclinicsystem.bean.AppointmentBean;
import com.comviva.onlineclinicsystem.service.AppointmentService;

@RestController
public class AppointmentController {
	@Autowired
	private AppointmentService as;
	
	@GetMapping("/appointments")
	public List<AppointmentBean> getAll() {
		List<AppointmentBean> result=as.getAll();
		return result;
	}
	
	@PostMapping("/appointments")
	public String addAppointments(@RequestBody AppointmentBean a) {
		int result=as.addAppointment(a);
		if(result==1) {
			return("Your appointment id is "+a.getAppointmentID());
		}
		else {
			return ("error");
		}
	}
	
	@GetMapping("/appointments/{id}")
	public ResponseEntity<AppointmentBean> getOneAppointments(@PathVariable(value="id") int id) {
		AppointmentBean result=as.getOne(id);
		if(result!=null) {
			return new ResponseEntity<AppointmentBean>(result,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<AppointmentBean>(result,HttpStatus.OK);
		}
	}
}
