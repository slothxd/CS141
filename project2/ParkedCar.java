
//CS141
//Project 2 ParkingTicketSimulator
//2/7/2015

public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesParked;

    public ParkedCar(String mk, String mod, String col, String lic, int min) {
        this.make = mk;
        this.model = mod;
        this.color = col;
        this.licenseNumber = lic;
        this.minutesParked = min;
    }

    public ParkedCar(ParkedCar car2) {
        this.make = car2.make;
        this.model = car2.model;
        this.color = car2.color;
        this.licenseNumber = car2.licenseNumber;
        this.minutesParked = car2.minutesParked;
    }

    public int getMinutesParked() {
        return minutesParked;
    }
    
    public String toString() {
    	String str = "Car Data:" + "\n" +
        	   "Make: " + make + "\n" +
               "Model: " + model + "\n" +
               "Color: " + color + "\n" +
               "License Number: " + licenseNumber + "\n" +
               "Minutes Parked: " + minutesParked;
    	return str;
    }
    
}
