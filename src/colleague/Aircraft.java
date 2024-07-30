package colleague;

import mediator.Mediator;

public abstract class Aircraft {
	
	Mediator mediator;
	String callsign, type;
	
	public Aircraft(Mediator mediator) {
		this.mediator = mediator;  
	}
	
	public void requestLanding(int eta) {
		mediator.requestLanding(this, eta);
	}
	
	public void requestTakeoff(int eta) {
		 mediator.requestTakeoff(this, eta);
	}
	
	public String getType() {
		return type;
	}
	
	public String getCallsign() {
		return callsign;
	}
	
	public String toString() {
		return type + " " + callsign;
	}
}



