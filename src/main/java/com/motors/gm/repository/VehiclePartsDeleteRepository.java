package com.motors.gm.repository;

import com.motors.gm.model.VehicleParts;

public interface VehiclePartsDeleteRepository {

	String saveVehicleParts(VehicleParts vehicleParts);
	public VehicleParts updateVehicleParts(VehicleParts vehicleParts, String regNumber);
	public String deleteVehicle(String regNumber);

}