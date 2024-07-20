
public class SwitchExerciseRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(determineNameOfDay(12));
		System.out.println(determineNameOfMonth(12));
		System.out.println(isWeekDay(12));

	}

	private static String isWeekDay(int WeekDay) {
		// TODO Auto-generated method stub
		switch (WeekDay) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return "True"; // fall through for week days
		case 6:

		case 7:
			return "False"; // fall through for nonWeek days
		}
		return null;
	}

	public static String determineNameOfDay(int DayNumber) {
		String result = "";
		switch (DayNumber) {
		case 1:
			result = "Monday";
		case 2:
			result = "Tuesday";
		case 3:
			result = "Wednesday";
		case 4:
			result = "Thursday";
		case 5:
			result = "Friday";
		case 6:
			result = "Saturday";
		case 7:
			result = "Sunday";
		default:
			result = "Undetermined";
		}
		return result;
	}

	public static String determineNameOfMonth(int MonthNumber) {
		switch (MonthNumber) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";

		default:
			return "Invalid Input";
		}
	}

}
