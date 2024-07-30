package colleague;

import mediator.Mediator;

public class FighterJet extends Aircraft {
	
	public FighterJet(Mediator mediator, String callsign) {
		super(mediator);
		this.callsign = callsign;
		this.type = "fighter jet";
		this.toString();
		mediator.aircraftDetected(this);
	}
}



