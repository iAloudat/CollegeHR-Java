
import java.util.Objects;

abstract public class Person {
	
	protected String firstName;
	protected String lastName;
	protected int employeeId;
	protected int age;
	protected int phone;
	protected int departmentId;
	
	
	public Person() {
		this.firstName = "";
		this.lastName = "";
		this.employeeId = 0;
		this.age = 0;
		this.phone = 0;
		this.departmentId=0;
	}
	
	public Person(String firstName, String lastName, int employeeId, int age, int phone, int departmentId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.age = age;
		this.phone = phone;
		this.departmentId=departmentId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public int getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getPhone() {
		return phone;
	}



	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getDepartmentId() {
		return departmentId;
	}



	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, employeeId, firstName, lastName, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && employeeId == other.employeeId && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && phone == other.phone;
	}

	
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId + ", age="
				+ age + ", phone=" + phone + "]";
	}

	abstract public void EmployeeCategory();
}
