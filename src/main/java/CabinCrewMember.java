public class CabinCrewMember extends CrewMember{

    public CabinCrewMember (String name, Rank rank) {
        super(name, rank);
    }

    public String relayMessagesToPassengers() {
        return "Fasten your seatbelts";
    }
}
