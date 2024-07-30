package colleague;

import mediator.Mediator;

public class PassengerPlane extends Aircraft {
	
	public PassengerPlane(Mediator mediator, String callsign) {
		super(mediator);
		this.callsign = callsign;
		this.type = "passenger plane";  
		this.toString();
		mediator.aircraftDetected(this);
	}
}


