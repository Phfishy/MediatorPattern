package colleague;

import mediator.Mediator;

public class Helicopter extends Aircraft {
	
	public Helicopter(Mediator mediator, String callsign) {
		super(mediator);
		this.callsign = callsign;
		this.type = "helicopter";
		this.toString();
		mediator.aircraftDetected(this);
	}
}


