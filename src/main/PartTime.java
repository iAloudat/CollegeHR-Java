
import java.util.Objects;

public class PartTime extends Teacher implements PayRoll {
	private int hoursWorked;
	
	public PartTime() {
		super();
		this.hoursWorked = 0;
	}

	public PartTime(String firstName, String lastName, int employeeId, int age, int phone, int departmentId, String specialty, String degree, int hoursWorked) {
		super(firstName, lastName, employeeId, age, phone, departmentId, specialty, degree);
		this.hoursWorked = hoursWorked;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(hoursWorked);
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
		PartTime other = (PartTime) obj;
		return hoursWorked == other.hoursWorked;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId + ", age="
				+ age + ", phone=" + phone + ", Teacher [specialty=" + specialty + ", degree=" + degree + ", PartTime [hoursWorked=" + hoursWorked + "]]]";
	}

	@Override
	public double ComputePayRoll() {
		int degreeRate = 0;
		if(degree.equals("Phd"))
			degreeRate=112;
		if(degree.equals("Master"))
			degreeRate=82;
		if(degree.equals("Bachelor"))
			degreeRate=42;
		return (hoursWorked * degreeRate * 2) * 0.76;
	}

	@Override
	public String teacher_status() {
		// TODO Auto-generated method stub
		return "partTime";
	}

}
