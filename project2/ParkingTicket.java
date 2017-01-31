
//CS141
//Project 2 ParkingTicketSimulator
//2/7/2015

import java.text.DecimalFormat;

public class ParkingTicket {
	private ParkedCar car;
    private PoliceOfficer officer;  
    private double fine;
    private int minutes;
    final private double BASE_FINE = 25.0;
    final private double HOURLY_FINE = 10.0;
    
    public ParkingTicket(ParkedCar aCar, PoliceOfficer anOfficer , int min){
    	car = aCar;
    	officer = anOfficer;
    	minutes = min;
    }
    
    public ParkingTicket(ParkingTicket Ticket2){
    	this.car = Ticket2.car;
    	this.officer = Ticket2.officer;
    	this.minutes = Ticket2.minutes;
    }
    
    public ParkingTicket(PoliceOfficer officer, ParkedCar car, ParkingMeter meter) {
        this.officer = officer;
        this.car = car;
        minutes = ((car.getMinutesParked() - meter.getMinutesPurchased()));
        fine = ((BASE_FINE + HOURLY_FINE) + ((int)HOURLY_FINE * minutes)/60);
    }

    
    public String toString() {
        DecimalFormat decFormat = new DecimalFormat("$##.00");
        String str = car + "\n" + "Officer Data: \n" + officer + "\nMinutes Illegally Parked: " 
               + minutes + "\nFine: " + decFormat.format(fine);
        return str;
    }
}
