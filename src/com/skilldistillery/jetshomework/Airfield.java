package com.skilldistillery.jetshomework;

public class Airfield {

	public Jets[] createAirfield() {
		Jets jets[] = new Jets[20];
		jets = buildAirfield(jets);
		return jets;
	}

	private Jets[] buildAirfield(Jets[] jets) {

		CargoPlane cp = new CargoPlane("Airbus A330 MRT", 550, 9_196, 75_000_000L);
		FighterJet fj = new FighterJet("F-16 Fighting Falcon", 1_500, 2_622, 19_000_000L);
		PassangerPlane pp = new PassangerPlane("Airbus A380", 575, 8_208, 230_000_000L);
		PassangerPlane pp1 = new PassangerPlane("Boeing 737", 583, 5_400, 70_000_000L);
		FighterJet fj1 = new FighterJet("F-14 Tomcat", 1_544, 755, 38_000_000L);

		jets[0] = cp;
		jets[1] = fj;
		jets[2] = pp;
		jets[3] = pp1;
		jets[4] = fj1;
		return jets;
	}

	public Jets[] addJet(Jets newJet, Jets[] existingJets) {
		for (int i = 0; i < existingJets.length; i++) {
			if (existingJets[i] == null) {
				existingJets[i] = newJet;
				break;

			}

		}

		return existingJets;
	}
}
