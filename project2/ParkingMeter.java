
//CS141
//Project 2 ParkingTicketSimulator
//2/7/2015

public class ParkingMeter {
    private int minutesPurchased;

    public ParkingMeter(int m) {
        minutesPurchased = m;
    }
    
    public void setMinutes(int m) {
    	minutesPurchased = m;
    }

    public int getMinutesPurchased() {
        return minutesPurchased;
    }
    
    
}
