
import java.util.Objects;

public abstract class Teacher extends Person{
	
	protected String specialty;
	protected String degree;
	
	
	public Teacher() {
		super();
		this.specialty = "";
		this.degree = "";
	}

	
	public Teacher(String firstName, String lastName, int employeeId, int age, int phone, int departmentId, String specialty, String degree) {
		super(firstName, lastName, employeeId, age, phone, departmentId);
		this.specialty = specialty;
		this.degree = degree;
	}

	

	public String getSpecialty() {
		return specialty;
	}


	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(degree, specialty);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(degree, other.degree) && Objects.equals(specialty, other.specialty);
	}

	
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId + ", age="
				+ age + ", phone=" + phone + ", Teacher [specialty=" + specialty + ", degree=" + degree + "]]";
	}

	
	public void EmployeeCategory() {
			System.out.print("Teacher");
		}
	
	abstract public String teacher_status();

	
}

