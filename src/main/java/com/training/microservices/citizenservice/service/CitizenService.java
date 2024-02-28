package com.training.microservices.citizenservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.microservices.citizenservice.entities.Citizen;
import com.training.microservices.citizenservice.repo.CitizenRepo;

@Service
public class CitizenService implements ICitizenService{
 
	@Autowired
	private CitizenRepo repo;
	
	@Override
	public List<Citizen> getCitizenListByVaccinationCenterId(int id) {
		// TODO Auto-generated method stub
		return repo.findByVaccinationCenterId(id);
	}

	@Override
	public Citizen addCitizen(Citizen citizen) {
		// TODO Auto-generated method stub
		return repo.save(citizen);
		
	}

}
