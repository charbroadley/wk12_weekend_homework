import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot1;

    @Before
    public void before() {
        pilot1 = new Pilot("Sarah", Rank.PILOT, "FLY2468");
    }

    @Test
    public void canGetName() {
        assertEquals("Sarah", pilot1.getName());
    }

    @Test
    public void canGetRank() {
        assertEquals(Rank.PILOT, pilot1.getRank());
    }

    @Test
    public void canGetPilotLicenceNumber() {
        assertEquals("FLY2468", pilot1.getPilotLicenceNumber());
    }

    @Test
    public void canFlyPlane() {
        assertEquals("Woah I'm flying a plane!", pilot1.flyPlane());
    }
}
