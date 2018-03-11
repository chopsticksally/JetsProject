package com.skilldistillery.jetshomework;

public class FighterJet extends Jets implements CombatReady {
	
	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);

	}

	@Override
	public void fight() {
		System.out.println("pew pew");

	}

	@Override
	public String toString() {
		return "FighterJet [model=" + getModel() + ", speed=" + getSpeed() + ", range=" + getRange() + ", price="
				+ getPrice() + "]";
	}

}
