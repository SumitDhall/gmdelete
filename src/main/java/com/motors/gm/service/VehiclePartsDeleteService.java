package com.motors.gm.service;

import com.motors.gm.model.VehicleModel;
import com.motors.gm.model.VehicleParts;

public interface VehiclePartsDeleteService {

	void saveVehicleParts(VehicleParts vehicleParts);

	public void updateVehicleParts(VehicleParts vehicleParts, String regNumber);
	
	public String deleteVehicleParts(String regNumber);
}