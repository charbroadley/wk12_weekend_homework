import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight1;
    private Pilot pilot1;
    private CabinCrewMember cabinCrewMember1;
    private CabinCrewMember cabinCrewMember2;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Passenger businessMan1;
    private Passenger businessMan2;
    private Passenger holidayMaker1;
    private Passenger holidayMaker2;
    private Passenger digitalNomad1;

    @Before
    public void before() {
        pilot1 = new Pilot("Sarah", Rank.PILOT, "FLY2468");
        cabinCrewMember1 = new CabinCrewMember("James", Rank.CABIN_CREW_MEMBER);
        cabinCrewMember2 = new CabinCrewMember("Anna", Rank.CABIN_CREW_MEMBER);
        cabinCrewMembers = new ArrayList<CabinCrewMember>(Arrays.asList(cabinCrewMember1, cabinCrewMember2));
        passengers = new ArrayList<>();
        flight1 = new Flight(pilot1, cabinCrewMembers, passengers, 12345, "Milan", "Edinburgh", 06.00, 1000, 4);
        businessMan1 = new Passenger("Terry", 1);
        businessMan2 = new Passenger("Frank", 2);
        holidayMaker1 = new Passenger("Char", 1);
        holidayMaker2 = new Passenger("Amy", 3);
        digitalNomad1 = new Passenger("Meg", 2);

        // flight1.addPassengerToFlight(businessMan);
        // flight1.addPassengerToFlight(holidayMaker);
    }

    @Test
    public void canGetPilot() {
        assertEquals("Sarah", pilot1.getName());
    }

    @Test
    public void canGetCabinCrewMembers() {
        assertEquals(2, cabinCrewMembers.size());
    }

    @Test
    public void canAddPassengerToFlight() {
        flight1.addPassengerToFlight(businessMan1);
        flight1.addPassengerToFlight(holidayMaker1);
        assertEquals(2, passengers.size());
    }

    @Test
    public void canGetFlightNumber() {
        assertEquals(12345, flight1.getFlightNumber());
    }

    @Test
    public void canGetDestination() {
        assertEquals("Milan", flight1.getDestination());
    }

    @Test
    public void canGetDepartureAirport() {
        assertEquals("Edinburgh", flight1.getDepartureAirport());
    }

    @Test
    public void canGetDepartureTime() {
        assertEquals(06.00, flight1.getDepartureTime(), 0.0);
    }

    @Test
    public void canGetTotalWeightAllowance() {
        assertEquals(1000, flight1.getTotalWeightAllowance());
    }

    @Test
    public void canReturnNumberOfAvailableSeats() {
        assertEquals(4, flight1.returnNumberOfAvailableSeats());
    }

    @Test
    public void canBookPassengerOnToFlight_AvailableSeats() {
        flight1.bookPassengersOnToFlight(holidayMaker1);
        assertEquals(1, passengers.size());
        assertEquals(3, flight1.returnNumberOfAvailableSeats());
    }

    @Test
    public void canBookPassengerOnToFlight_NoAvailableSeats() {
        flight1.bookPassengersOnToFlight(holidayMaker1);
        flight1.bookPassengersOnToFlight(holidayMaker2);
        flight1.bookPassengersOnToFlight(businessMan1);
        flight1.bookPassengersOnToFlight(businessMan2);
        flight1.bookPassengersOnToFlight(digitalNomad1);
        assertEquals(4, passengers.size());
        assertEquals(0, flight1.returnNumberOfAvailableSeats());
    }
}
