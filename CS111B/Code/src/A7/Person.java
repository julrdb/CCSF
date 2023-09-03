package A7;

public class Person {
	private String name;
	public Person() {
		name="None";
	}
	public Person(String n) {
		name=n;
	}
	public Person(Person other) {
		name=other.name;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}

	public String toString() {
		return("Buyer= " + name);
	}

	public boolean equals(Person other) {
		return (name.equals(other.name));
	}
}