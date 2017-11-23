
public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	private String Firstname;
	private String getlastname;
	private String name;

	public Employee(int id, String firstnName, String lastname, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastname;
		this.salary = salary;
	}

	public int getID() {
		return id;
	}

	public String getFirstName() {

		return Firstname;
	}

	public String getlastName() {
		return getlastname;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {

	}

	public int getAnnualSalary() {
		return salary * 12;
	}

	public int raiseSalary (int percent) {
		salary = salary * percent;
		return salary;
	}

}
