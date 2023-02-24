public class Pilot extends CrewMember {

    private String pilotLicenceNumber;
    public Pilot (String name, Rank rank, String pilotLicenceNumber) {
        super(name, rank);
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String getPilotLicenceNumber() {
        return this.pilotLicenceNumber;
    }

    public String flyPlane() {
        return "Woah I'm flying a plane!";
    }

}
