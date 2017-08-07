import static org.junit.Assert.*;
import org.junit.*;

public class BabysitterTest {

	Babysitter babysitter;
	 
    @Before
    public void setUp() {
        babysitter = new Babysitter();
    }
 
    @Test
    public void whenHoursWorkedIsPassedAStartTimeAndEndTimeItReturnsTheDifferenceOfTheStartFromTheEnd() {
        assertEquals(7, babysitter.hoursWorked(5,12));
    }
}
