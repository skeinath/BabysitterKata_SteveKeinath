import static org.junit.Assert.*;
import org.junit.*;

public class BabysitterTest {

	Babysitter babysitter;
	 
    @Before
    public void setUp() {
        babysitter = new Babysitter();
    }
 
    @Test
    public void whenHoursWorkedIsPassedAStartTimeAndBedtimeAndEndTimeItReturnsPayForTimeWorkedForAllNight() {
        assertEquals(68, babysitter.hoursWorked(5,8,12));
        assertEquals(104, babysitter.hoursWorked(5,9,2));
    }
}
