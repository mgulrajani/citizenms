package com.training.microservices.citizenservice.controller;

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

import com.training.microservices.citizenservice.entities.Citizen;
import com.training.microservices.citizenservice.service.CitizenService;

@RestController
@RequestMapping("/citizens")
public class CitizenController {
	
	@Autowired
	private CitizenService service;
	
	@GetMapping("/vaccinationCenterId/{id}")
	public ResponseEntity<List<Citizen>> getCitizenByVaccinationCenterId(@PathVariable Integer id){
		List<Citizen> list= service.getCitizenListByVaccinationCenterId(id);
		return new ResponseEntity<>(list,HttpStatus.OK);
			
	}
	
	@PostMapping
	public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen citizen){
		Citizen citizen2 =service.addCitizen(citizen);
		return new ResponseEntity<Citizen>(citizen2,HttpStatus.CREATED);
		
		
		
	}


}
