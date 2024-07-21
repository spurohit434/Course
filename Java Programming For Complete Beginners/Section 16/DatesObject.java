import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatesObject {
	public static void main(String[] args) {
		// LocalDate, LocalTime, LocalDateTime
		// import java.time.LocalDate;
		// LocalDate, LocalTime, LocalDateTime are immutable

		LocalDate date = LocalDate.of(2010, 1, 21);
		// LocalDate date2 = new LocalDate(2018, 2, 28); // this syntax is incorrect, it
		// doesn't works and gives error

		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);

		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);

		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);

		// currentDate.getYear() currentDate.getMonth() currentDate.getMonthValue()
		// currentDate.getDayOfWeek() currentDate.getDayOfMonth()
		// currentDate.getDayOfYear()
		// currentDate.isLeapYear()
		// currentDate.lengthOfYear() currentDate.lengthOfMonth()
		// currentDate.plusDays(noOfDays) currentDate.plusMonth(noOfMonth)
		// currentDate.plusYears(noOfYears // currentDate is unchanged
		// similiarly, currentDate.minusDays(noOfDays) etc // currentDate is unchanged
		// LocalTime has some other function
		// LocalDateTime has function of both LocalDate and LocalTime
		// .isBefore() .isAfter()
	}
}