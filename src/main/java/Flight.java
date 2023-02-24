import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private int flightNumber;
    private String destination;
    private String departureAirport;
    private double departureTime;
    private int totalWeightAllowance;
    private int availableSeats;

    public Flight (Pilot pilot, ArrayList<CabinCrewMember> cabinCrewMembers, ArrayList<Passenger> passengers, int flightNumber, String destination, String departureAirport, double departureTime, int totalWeightAllowance, int availableSeats) {
        this.pilot = pilot;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = passengers;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.totalWeightAllowance = totalWeightAllowance;
        this.availableSeats = availableSeats;
    }

    public void addPassengerToFlight(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public int getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public double getDepartureTime() {
        return this.departureTime;
    }

    public int getTotalWeightAllowance() {
        return this.totalWeightAllowance;
    }

    public int returnNumberOfAvailableSeats() {
        return this.availableSeats;
    }

    public void bookPassengersOnToFlight (Passenger passenger) {
        if(availableSeats >= 1) {
            this.passengers.add(passenger);
            availableSeats -= 1;
        }
    }
}
