package com.motors.gm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.motors.gm.model.VehicleModel;
import com.motors.gm.repository.VehicleModelDeleteRepository;
import com.motors.gm.service.VehicleModelDeleteService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping(path = "/deleteAsset")
public class VehicleModelDeleteController {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Autowired
	VehicleModelDeleteService vehicleModelDeleteService;
	
	private static final Logger LOGGER = LogManager.getLogger(VehicleModelDeleteController.class.getName());

	// delete method will call service delete method to delete the existing
	// vehicle in DB
	// TO-DO need to create new project for Delete
	@DeleteMapping(path = "/deleteVehicle/{regNumber}", produces = "application/json")
	public String deleteVehicle(@PathVariable String regNumber) {
		
		for(int i=0; i<=80000; i++){
			LOGGER.debug("Inside the Debug logger in Vehicle Controller class"+i);
		}
		LOGGER.debug("Inside the Debug logger in Vehicle Controller class");
		return vehicleModelDeleteService.deleteVehicle(regNumber);
	}

}
