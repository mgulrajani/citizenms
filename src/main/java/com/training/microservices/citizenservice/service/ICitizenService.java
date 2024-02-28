package com.training.microservices.citizenservice.service;

import java.util.List;

import com.training.microservices.citizenservice.entities.Citizen;

public interface ICitizenService {

		public List<Citizen> getCitizenListByVaccinationCenterId(int id);
		
		public Citizen addCitizen(Citizen citizen);
		
}
