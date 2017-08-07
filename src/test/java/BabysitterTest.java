import static org.junit.Assert.*;
import org.junit.*;

public class BabysitterTest {

	Babysitter babysitter;
	 
    @Before
    public void setUp() {
        babysitter = new Babysitter();
    }
 
    @Test
    public void whenHoursWorkedIsPassedAStartTimeAndBedtimeAndEndTimeItReturnsPayForTheTimeWorkedBetweenMidnightAndEndTime() {
        assertEquals(0, babysitter.hoursWorked(5,8,12));
        assertEquals(32, babysitter.hoursWorked(5,9,2));
    }
}
