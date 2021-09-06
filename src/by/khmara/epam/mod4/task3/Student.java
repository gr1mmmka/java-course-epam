package by.khmara.epam.mod4.task3;

public class Student {

	private String surnameAndInitials;
	private int groupNumber;
	private int[] marks;

	public Student() {

	}

	public Student(String surnameAndInitials, int groupNumber, int[] marks) {
		super();
		this.surnameAndInitials = surnameAndInitials;
		this.groupNumber = groupNumber;
		this.marks = marks;

	}

	public int[] getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student [surnameAndInitials=" + surnameAndInitials + ", groupNumber=" + groupNumber + "]";
	}

}
