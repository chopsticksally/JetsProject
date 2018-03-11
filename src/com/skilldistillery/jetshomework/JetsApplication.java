package com.skilldistillery.jetshomework;

import java.util.Scanner;

public class JetsApplication {

	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		Jets jets[] = new Jets[20];
		Airfield airfield = new Airfield();
		jets = airfield.createAirfield();
		while (true) {
			System.out.println("1. List fleet");
			System.out.println("2. Fly all jets");
			System.out.println("3. View fast jet");
			System.out.println("4. View jet with longest range");
			System.out.println("5. Load all cargo jets");
			System.out.println("6. Dogfight!");
			System.out.println("7. Add a jet to flight");
			System.out.println("8. Quit");
			int ans = kb.nextInt();
			if (ans == 1) {
				listFleet(jets);
			}
			if (ans == 2) {
				fly(jets);
			}
			if (ans == 3) {
				fastestJet(jets);

			}
			if (ans == 4) {
				longestRangeJet(jets);
			}
			if (ans == 5) {
				loadCargo(jets);// the load cargo method just prints out
				// cargo being loaded
			}
			if (ans == 6) {
				fight(jets);
			}
			if (ans == 7) {
				airfield.addJet(addJet(jets), jets);// asks user for jet info and stores it in the array
			}
			if (ans == 8) {
				System.out.println("GOODBYE");
				break;
			}
		}
		//
		//
		//
		kb.close();
	}

	public static void listFleet(Jets[] jets) {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				System.out.println(jets[i].toString());
			}
		}
	}

	public static void fly(Jets[] jets) {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				jets[i].fly();
			}
		}
	}

	public static void fastestJet(Jets[] jets) {
		int fastestJet = 0;
		for (int i = 1; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getSpeed() > jets[fastestJet].getSpeed()) {
					fastestJet = i;
				}
			}
		}
		System.out.println("Fastest jet: " + jets[fastestJet].toString());
	}

	public static void longestRangeJet(Jets[] jets) {
		int longestRangeJet = 0;
		for (int i = 1; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getRange() > jets[longestRangeJet].getRange()) {
					longestRangeJet = i;
				}
			}
		}
		System.out.println("Jet with the longest range: " + jets[longestRangeJet].toString());
	}

	public static void loadCargo(Jets[] jets) {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getClass().getSimpleName().equals("CargoPlane")) {
					((CargoPlane) jets[i]).loadCargo();

				}
			}
		}
	}

	public static void fight(Jets[] jets) {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getClass().getSimpleName().equals("FighterJet")) {
					((FighterJet) jets[i]).fight();
				}
			}
		}
	}

	public static Jets addJet(Jets[] jets) {
		System.out.println("Enter the model name of your jet: ");
		String model = kb.next();
		System.out.println("Enter the speed, in mph, of your jet: ");
		double speed = kb.nextDouble();
		System.out.println("Enter the range of your jet: ");
		int range = kb.nextInt();
		System.out.println("Enter the price of your jet: ");
		long price = kb.nextLong();

		JetImpl newJet = new JetImpl(model, speed, range, price);
		return newJet;
	}
}
