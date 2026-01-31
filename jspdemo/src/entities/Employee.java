package entities;

public class Employee {
	
	private String firstName;
	private int age;
	private String lastName;
	private String employeeId;
	private double salary;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String firstName, int age, String lastName, String employeeId, double salary) {
		super();
		this.firstName = firstName;
		this.age = age;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
}
