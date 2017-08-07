
public class Babysitter {

	public int hoursWorked(int startTime, int bedtime, int endTime) {

		int workedBeforeBedtime = bedtime - startTime;
		
		return workedBeforeBedtime;
	}

}
