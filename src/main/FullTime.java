
public class FullTime extends Teacher implements PayRoll{
	
	
	
	public FullTime() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FullTime(String firstName, String lastName, int employeeId, int age, int phone, int departmentId, String specialty,
			String degree) {
		super(firstName, lastName, employeeId, age, phone, departmentId, specialty, degree);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId + ", age="
				+ age + ", phone=" + phone + ", Teacher [specialty=" + specialty + ", degree=" + degree + ", FullTime []]]";
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
		return (32 * degreeRate * 2) * 0.85;
	}

	@Override
	public String teacher_status() {
		// TODO Auto-generated method stub
		return "fullTime";
	}
}
