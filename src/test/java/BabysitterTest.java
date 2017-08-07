import static org.junit.Assert.*;
import org.junit.*;

public class BabysitterTest {

	Babysitter babysitter;
	 
    @Before
    public void setUp() {
        babysitter = new Babysitter();
    }
 
    @Test
    public void whenHoursWorkedIsPassedAStartTimeAndBedtimeAndEndTimeItReturnsTheTimeWorkedBetweenMidnightAndEndTime() {
        assertEquals(0, babysitter.hoursWorked(5,8,12));
        assertEquals(2, babysitter.hoursWorked(5,9,2));
    }
}
