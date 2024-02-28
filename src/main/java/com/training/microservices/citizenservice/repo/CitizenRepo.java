package com.training.microservices.citizenservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.microservices.citizenservice.entities.Citizen;

public interface CitizenRepo extends JpaRepository<Citizen,Integer>{
  public List<Citizen> findByVaccinationCenterId(Integer id);
  
}
