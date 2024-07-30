package main;

import colleague.FighterJet;
import colleague.Helicopter;
import colleague.PassengerPlane;
import mediator.AircraftMediator;

public class Main {
	public static void main(String[] args) {
		
		AircraftMediator airTrafficController = new AircraftMediator();
		
		FighterJet fighter = new FighterJet(airTrafficController, "F18");
		Helicopter helicopter = new Helicopter(airTrafficController, "U1");
		PassengerPlane plane = new PassengerPlane(airTrafficController, "B737");
		
		System.out.println();
		
		fighter.requestLanding(5);
		helicopter.requestLanding(10);
		fighter.requestTakeoff(15);
		
		System.out.println();
		
		airTrafficController.getTrackedAircraft();
	}
}


