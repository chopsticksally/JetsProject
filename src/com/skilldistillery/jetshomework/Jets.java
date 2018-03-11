package com.skilldistillery.jetshomework;

abstract public class Jets {
	private String model;
	private double speed;
	private int range;
	private long price;

	public Jets(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public void fly() {
		String jetInfo;
		double flightTimeInMinutes = (range/speed)*60;
		int flightTimeInHours = (int) (flightTimeInMinutes/60);
		flightTimeInMinutes = flightTimeInMinutes-(flightTimeInHours*60);
		jetInfo = toString();
		System.out.println(jetInfo + " Flight time = " + flightTimeInHours + ":" + (int)(flightTimeInMinutes));
	}
	
	

	// public static Object getSpeedInMach;
	public double getSpeedInMach() {
		double mach = speed * 0.44704;
		return mach;

	}

	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jets [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}

}
// Quiz quiz = new Quiz();
// StressedCoders coder = new StressedCoders();
// CookieMonster cookieMonster = new CookieMonster();