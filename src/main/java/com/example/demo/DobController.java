package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DobController {
	
	@Autowired
	private birthdatesRepository birthdatesrepo;
	
	@GetMapping ("/dob")
	@ResponseBody
	public List<DobData> dobdata() {
		
		return birthdatesrepo.findAll()  ;
	}
	
	@PostMapping ("/dob")
	@ResponseStatus(value = HttpStatus.CREATED)
	public DobData posting(@RequestBody DobData dobdata){
		return birthdatesrepo.save(dobdata);
	}

}
