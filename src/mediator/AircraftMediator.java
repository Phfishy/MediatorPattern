package mediator;
import java.util.ArrayList;
import colleague.Aircraft;
public class AircraftMediator implements Mediator{
	
	final int HANGAR_CAPACITY = 10;
	private ArrayList<Aircraft> landed = new ArrayList<Aircraft>();
	private ArrayList<Aircraft> standby = new ArrayList<Aircraft>();
	
	public void aircraftDetected(Aircraft aircraft) {
		System.out.println(aircraft.getType() + " " + aircraft.getCallsign() + " detected in airspace.");
		standby.add(aircraft);
	}
	public void requestLanding(Aircraft aircraft, int eta) {
		System.out.println(aircraft.getType() + " " + aircraft.getCallsign() + " requesting landing in " + eta + " minutes.");
		
		if(landed.size() >= HANGAR_CAPACITY) {
			System.out.println("Request Denied.");
		}
		else {
			System.out.println("Request Granted.");
			standby.remove(aircraft);
			landed.add(aircraft);
		}
	}
	public void requestTakeoff(Aircraft aircraft, int eta) {
		System.out.println(aircraft.getType() + " " + aircraft.getCallsign() + " requesting takeoff in " + eta + " minutes.");
		System.out.println("Request Granted.");
		landed.remove(aircraft);
		standby.add(aircraft);
	}
	public void getTrackedAircraft() {
		System.out.println("Aircraft in Hangar:");
		for(Aircraft aircraft : landed) {
			System.out.println(aircraft.getType() + " " + aircraft.getCallsign() + " inside hangar.");
		}
		System.out.println();
		System.out.println("Aircraft in Airspace:");
		for(Aircraft aircraft : standby) { 
			System.out.println(aircraft.getType() + " " + aircraft.getCallsign() + " on standby.");
		}
	}
}
