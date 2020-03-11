package com.motors.gm.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.motors.gm.model.VehicleModel;

@Repository
@EnableMongoRepositories
public class VehicleModelDeleteRepositoryImpl implements VehicleModelDeleteRepository {

	@Autowired
	private MongoTemplate mongoTemplate;

	public String deleteVehicle(String regNumber) {
		// Query deleteQuery = new Query();
		// deleteQuery.addCriteria(Criteria.where("regNumber").is(regNumber));
		// mongoTemplate.remove(deleteQuery, VehicleModel.class);
		return deleteVehicleApacheKafka(regNumber);
		// return "Vehicle Deleted successfully from DB";

	}

	public String deleteVehicleApacheKafka(String regNumber) {
		Query deleteQuery = new Query();
		deleteQuery.addCriteria(Criteria.where("regNumber").is(regNumber));
		mongoTemplate.remove(deleteQuery, VehicleModel.class);
		return "Vehicle Deleted successfully from DB";

	}
}
