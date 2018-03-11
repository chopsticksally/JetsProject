package com.skilldistillery.jetshomework;

public class CargoPlane extends Jets implements CargoCarrier {
	
	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void loadCargo() {
		System.out.println("Loading cargo into plane.");
	
	}

	@Override
	public String toString() {
		return "CargoPlane [model=" + getModel() + ", speed=" + getSpeed() + ", range=" + getRange() + ", price=" + getPrice()
				+ "]";
	}
	

}
