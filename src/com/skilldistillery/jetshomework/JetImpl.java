package com.skilldistillery.jetshomework;

public class JetImpl extends Jets												{

	public JetImpl(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public String toString() {
		return "JetImpl [model=" + getModel() + ", speed=" + getSpeed() + ", range=" + getRange() + ", price=" + getPrice()
				+ "]";
	}
	

}
