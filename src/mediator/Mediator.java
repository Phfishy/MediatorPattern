package mediator;

import colleague.Aircraft;

public interface Mediator {
	 public void aircraftDetected(Aircraft aircraft);
	 public void requestLanding(Aircraft aircraft, int eta);
	 public void requestTakeoff(Aircraft aircraft, int eta);
	 public void getTrackedAircraft();
}



