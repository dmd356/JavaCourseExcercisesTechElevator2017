package com.techelevator;

public class Airplane {

	private String planeNumber;
    private int totalFirstClassSeats = 0;
    private int bookedFirstClassSeats = 0;
    private int totalCoachSeats = 0;
    private int bookedCoachSeats = 0;

    /**
     * Creates a new airplane 
     * @param totalFirstClassSeats Total number of first class seats that can be booked
     * @param totalCoachSeats Total number of coach seats that can be booked
     */
    public Airplane(int totalFirstClassSeats, int totalCoachSeats, String number) {
       if(totalFirstClassSeats > 0 && number.length() == 6 && totalCoachSeats > 0) {
    	this.totalFirstClassSeats += totalFirstClassSeats;
        this.totalCoachSeats += totalCoachSeats;  
        this.planeNumber += number;
       }
    }

    /**
     * 6-Character Plane Number 
     * @return planeNumber
     */
    public String getPlaneNumber() {
        return planeNumber;            
    }

    /**
     * Number of already booked first class seats 
     * @return bookedFirstClassSeats
     */
    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;            
    }

    /**
     * Available number of first class seats 
     * @return availableFirstClassSeats
     */
    public int getAvailableFirstClassSeats() {
        return totalFirstClassSeats;
    }

    /**
     * Total number of first class seats 
     * @return totalFirstClassSeats
     */
    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;        
    }

    /**
     * Number of already booked coach seats 
     * @return bookedCoachSeats
     */
    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    /**
     * Available number of coach seats 
     * @return availableCoachSeats
     */
    public int getAvailableCoachSeats() {
        return totalCoachSeats;
    }

    /**
     * Total number of coach seats 
     * @return totalCoachSeats
     */
    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    /**
     * Reserves a first class or coach seat. Algorithm checks for reservation possiblity before making reservation. 
     * @param firstClass True if the reservation is for first class, false for coach
     * @param totalNumberOfSeats Total number of seats to reserve
     * @return True if reservation was successful, false otherwise
     */
    public boolean Reserve(boolean firstClass, int totalNumberOfSeats) {       
        if (firstClass) {  
            if (totalNumberOfSeats <= totalFirstClassSeats && totalNumberOfSeats > 0) {
            	bookedFirstClassSeats += totalNumberOfSeats;
            	return true;
            }
        }
        else {
            if (totalNumberOfSeats <= totalCoachSeats && totalNumberOfSeats > 0) {
            	bookedCoachSeats += totalNumberOfSeats;
            	return true;
            }
            return false;
            
        }  return false;
    }
}
