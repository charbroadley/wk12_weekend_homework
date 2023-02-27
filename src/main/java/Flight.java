import java.util.ArrayList;

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

// Date/time: use Instant class (private Instant departureTime)
// In the constructor we're passing in a string it then is parsed by Instant which we import in (this.departureTime = Instant.parse(departureTime);
// In the getDepartureTime method -> return this.departureTime.toString();
// This was chosen as it matches JS as closely as possible (this means the format of the data stored is as similar as possible to the JS date/time) - useful if you have a JS front end because you're input would be in JS date/time so good for things to match up
