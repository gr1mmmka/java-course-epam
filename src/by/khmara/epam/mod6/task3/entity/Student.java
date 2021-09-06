package by.khmara.epam.mod6.task3.entity;

public class Student {
	private int id;
	private String name;
	private int age;
	private String groupNumber;

	public Student() {

	}

	public Student(String name, int age, String groupNumber) {

		this.name = name;
		this.age = age;
		this.groupNumber = groupNumber;
	}

	public Student(int id, String name, int age, String groupNumber) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.groupNumber = groupNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}

	@Override
	public String toString() {
		return name + ", age=" + age + ", groupNumber=" + groupNumber;
	}

}
