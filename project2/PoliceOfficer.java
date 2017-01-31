
//CS141
//Project 2 ParkingTicketSimulator
//2/7/2015
public class PoliceOfficer {
    private String name;
    private String badgeNumber;

    public PoliceOfficer(String n, String bn) {
        this.name = n;
        this.badgeNumber = bn;
    }

    public PoliceOfficer(PoliceOfficer officer2) {
        this.name = officer2.name;
        this.badgeNumber = officer2.badgeNumber;
    }
    
    public ParkingTicket patrol(ParkedCar car, ParkingMeter meter) {
        if (car.getMinutesParked() > meter.getMinutesPurchased()) {
            return new ParkingTicket(this, car, meter);
        }
        return null;
    }

    public String toString() {
    	String str = "Name: " + name + "\n" +
               "Badge Number: " + badgeNumber;
    	return str;
    }
}
