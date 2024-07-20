
import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = { 99, 98, 100, 87 };
		Student s1 = new Student("Arun", marks);
		int number = s1.getNumberOfMarks();
		int sum = s1.getTotalSumOfMarks();
		int max = s1.getMaximumMarks();
		int min = s1.getMinimumMarks();
		BigDecimal avg = s1.getAverageMarks();

		System.out.println(number);
		System.out.println(sum);
		System.out.println(max);
		System.out.println(min);
		System.out.println(avg);

		System.out.println(s1);

		s1.addMark(35);
		s1.removeMarksAtIndex(3);

		System.out.println(s1);
	}

}
