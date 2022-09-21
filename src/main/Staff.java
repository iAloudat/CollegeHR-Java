
import java.util.Objects;

public class Staff extends Person implements PayRoll {
	private String duty;
	private int workLoad;
	
	
	
	public Staff() {
		super();
		this.duty = "";
		this.workLoad = 0;
	}
	
	
	public Staff(String firstName, String lastName, int employeeId, int age, int phone, int departmentId, String duty, int workLoad) {
		super(firstName, lastName, employeeId, age, phone, departmentId);
		this.duty = duty;
		this.workLoad = workLoad;
	}





	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public int getWorkLoad() {
		return workLoad;
	}

	public void setWorkLoad(int workLoad) {
		this.workLoad = workLoad;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(duty, workLoad);
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
		Staff other = (Staff) obj;
		return Objects.equals(duty, other.duty) && workLoad == other.workLoad;
	}

	
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId + ", age="
				+ age + ", phone=" + phone + ", Staff [duty=" + duty + ", workLoad=" + workLoad + "]]";
	}

	public void EmployeeCategory() {
		System.out.print("Staff");
	}	
	
	@Override
	public double ComputePayRoll() {
		return (workLoad * 32 * 2) * 0.75;
	}

	
}
