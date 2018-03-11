package com.skilldistillery.jetshomework;

public class PassangerPlane extends Jets {

	public PassangerPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public String toString() {
		return "PassangerPlane [model=" + getModel() + ", speed=" + getSpeed() + ", range=" + getRange() + ", price="
				+ getPrice() + "]";
	}

}
