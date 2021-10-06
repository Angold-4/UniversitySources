import java.io.*;

public class Person implements Serializable {

	private String name;
	private int age;
	private String gender;

	Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String toString() {
		return "(" + name + "," + age + "," + gender + ")";
	}
}