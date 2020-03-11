package com.motors.gm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.motors.gm.model.VehicleModel;
import com.motors.gm.repository.VehicleModelDeleteRepository;

@Service
public class VehicleModelDeleteServiceImpl implements VehicleModelDeleteService {

	@Autowired
	VehicleModelDeleteRepository vehicleModelDeleteRepository;

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public String deleteVehicle(String regNumber) {
		System.out.println("Vehicle Repository to delete vehicle called");
		return vehicleModelDeleteRepository.deleteVehicle(regNumber);
	}


}
