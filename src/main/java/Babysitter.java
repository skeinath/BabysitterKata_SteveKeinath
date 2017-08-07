
public class Babysitter {

	public int hoursWorked(int startTime, int bedtime, int endTime) {

		int workedBeforeBedtime = bedtime - startTime;
		int beforeBedtimeRate = 12;
		int paidBeforeBedtime = workedBeforeBedtime * beforeBedtimeRate;
		
		int workedBetweenBedtimeAndMidnight = 0;
		int betweenBedtimeAndMidnightRate = 8;
		
		int workedBetweenMidnightAndEndTime = 0;
		
		
		if(endTime < 5) {
			workedBetweenBedtimeAndMidnight = (12 - bedtime) * betweenBedtimeAndMidnightRate;
			workedBetweenMidnightAndEndTime = endTime;
		} else {
			workedBetweenBedtimeAndMidnight = (endTime - bedtime) * betweenBedtimeAndMidnightRate;
		}
		return workedBetweenMidnightAndEndTime;
	}

}
