
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int[] marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	int getNumberOfMarks() {
		return marks.size(); // in arrayList we use ,size() whereas in array we use .length
	}

	int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	int getMaximumMarks() {
//		int sum = 0;
//		for (int mark : marks) {
//			if (sum < mark) {
//				sum = mark;
//			}
//		}
//		return sum;
		return Collections.max(marks);
	}

	int getMinimumMarks() {
//		int sum = Integer.MAX_VALUE;
//		for (int mark : marks) {
//			if (sum > mark) {
//				sum = mark;
//			}
//		}
//		return sum;
		return Collections.min(marks);
	}

	BigDecimal getAverageMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		sum = sum / marks.size();
		BigDecimal bg = new BigDecimal(sum);
		return bg;
	}

	public void addMark(int mark) {
		marks.add(mark);
	}

	public void removeMarksAtIndex(int index) {
		marks.remove(index);
	}

	@Override
	public String toString() { // used to return the name of the student and marks array
		return name + marks;
	}

}
