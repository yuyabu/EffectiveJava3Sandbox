package item85;
public class Person implements java.io.Serializable{
	
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String toString() {
		return "[Person: firstName=" + firstName + 
	            " lastName=" + lastName +
	            " age=" + age +
	            " spouse=" + spouse.getFirstName() +
	            "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public Person getSpouse() {
		return spouse;
	}

	public void setFirstName(String value) {
		firstName = value;
	}

	public void setLastName(String value) {
		lastName = value;
	}

	public void setAge(int value) {
		age = value;
	}

	public void setSpouse(Person value) {
		spouse = value;
	}
	private String firstName;
	private String lastName;
	private int age;
	private Person spouse;
}