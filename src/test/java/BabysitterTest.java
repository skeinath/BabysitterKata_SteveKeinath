import static org.junit.Assert.*;
import org.junit.*;

public class BabysitterTest {

	Babysitter babysitter;
	 
    @Before
    public void setUp() {
        babysitter = new Babysitter();
    }
 
    @Test
    public void whenHoursWorkedIsPassedAStartTimeAndBedtimeAndEndTimeItReturnsTheTimeWorkedBeforeBedtime() {
        assertEquals(3, babysitter.hoursWorked(5,8,12));
        assertEquals(4, babysitter.hoursWorked(5,9,2));
    }
}
