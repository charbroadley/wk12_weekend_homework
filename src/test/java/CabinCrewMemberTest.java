import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember cabinCrewMember1;

    @Before
    public void before() {
        cabinCrewMember1 = new CabinCrewMember("James", Rank.CABIN_CREW_MEMBER);
    }

    @Test
    public void canGetName() {
        assertEquals("James", cabinCrewMember1.getName());
    }

    @Test
    public void canGetRank() {
        assertEquals(Rank.CABIN_CREW_MEMBER, cabinCrewMember1.getRank());
    }

    @Test
    public void canRelayMessagesToPassengers() {
        assertEquals("Fasten your seatbelts", cabinCrewMember1.relayMessagesToPassengers());
    }
}
