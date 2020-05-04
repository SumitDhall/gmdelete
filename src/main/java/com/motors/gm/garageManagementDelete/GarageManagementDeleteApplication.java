package com.motors.gm.garageManagementDelete;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.motors.gm.controller.VehicleModelDeleteController;

@SpringBootApplication
@ComponentScan({"com.motors.gm"})
@EntityScan("com.motors.gm")
@EnableMongoRepositories("com.motors.gm")
public class GarageManagementDeleteApplication extends SpringBootServletInitializer{

	private static final Logger LOGGER = LogManager.getLogger(GarageManagementDeleteApplication.class.getName());
	
	public static void main(String[] args) {
		SpringApplication.run(GarageManagementDeleteApplication.class, args);
		LOGGER.debug("Inside the Debug logger Garage Management Add Update Delete Rest API");
		LOGGER.info("Inside the info logger Garage Management Add Update Delete Rest API");
		LOGGER.error("Inside the error logger Garage Management Add Update Delete Rest API");
		
		//logger test
		/*for(int i=0; i<=2000; i++){
			LOGGER.debug("Inside the Debug logger Garage Management LOOP"+i);
		}*/
		
		//System.out.println("Garage Management Add Update Delete Rest API");
		
		/*TestModel testModel = new TestModel();
		testModel.setfName("Sum");
		testModel.setlName("Dhall");
		
		//VehicleAUDServiceImpl vehicleAUDServiceImpl = new VehicleAUDServiceImpl();
		@Autowired
		VehicleAUDRepository vehicleAUDRepository;// = new VehicleAUDRepositoryImpl();
		vehicleAUDRepository.saveVehicle(testModel);*/
	}

}
