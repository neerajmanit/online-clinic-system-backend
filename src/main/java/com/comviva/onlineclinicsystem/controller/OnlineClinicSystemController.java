package com.comviva.onlineclinicsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.comviva.onlineclinicsystem.bean.Address;
import com.comviva.onlineclinicsystem.bean.CredentialsBean;
import com.comviva.onlineclinicsystem.bean.ProfileBean;
import com.comviva.onlineclinicsystem.bean.UserType;
import com.comviva.onlineclinicsystem.service.OnlineClinicSystemService;

@RestController
public class OnlineClinicSystemController {
	@Autowired
	private OnlineClinicSystemService ocss;

	@RequestMapping("/")
	public String meht1() {
		return ("Welcome to home page");
	}

	
	@PostMapping("/users")
	public ResponseEntity<String> add(@RequestBody ProfileBean p) {
		CredentialsBean c=new CredentialsBean();
		c.setUserType(UserType.PATIENT);
		int result = ocss.addPatient(p,c);
		if(result==1) {
			String id=String.valueOf(p.getUserID());
			return new ResponseEntity<String>(id, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("error", HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<ProfileBean> getOneProfile(@PathVariable(value="id") int id){
		ProfileBean p=ocss.getOne(id);
		if(p!=null) {
			return new ResponseEntity<ProfileBean>(p,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<ProfileBean>(p,HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/users")
	public List<ProfileBean> getAllProfile(){
		List<ProfileBean> result=ocss.getAll();
		return result;
	}

}
