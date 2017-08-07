
public class Babysitter {

	public int hoursWorked(int startTime, int bedtime, int endTime) {

		int workedBeforeBedtime = bedtime - startTime;
		int beforeBedtimeRate = 12;
		int paidBeforeBedtime = workedBeforeBedtime * beforeBedtimeRate;
		
		return paidBeforeBedtime;
	}

}
