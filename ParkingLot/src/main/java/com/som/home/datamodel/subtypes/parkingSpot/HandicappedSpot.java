package com.som.home.datamodel.subtypes.parkingSpot;

import com.som.home.Constants.ParkingSpotType;
import com.som.home.datamodel.ParkingSpot;

public class HandicappedSpot extends ParkingSpot{

	public HandicappedSpot(ParkingSpotType type) {
		super(type.HANDICAPPED);
	}
}
