
public class Staff extends Person implements Payroll {

    private String duty;
    private int workload;

    public Staff() {
        super();
        this.duty = "";
        this.workload = 0;
    }

    public Staff(String firstName, String lastName, String gender, int age, int employeeID, int departmentId, String duty, int workload) {
        super(firstName, lastName, gender, age, employeeID, departmentId);
        this.duty = duty;
        if (workload > 40 || workload < 0) {
            throw new InvalidWorkload("Exceeded Maximum Overload: " + workload);
        } else {
            this.workload = workload;
        }
    }
    
    public String getDuty() {
        return duty;
    }
    public void setDuty(String duty) {
        this.duty = duty;
    }
    public int getWorkload() {
        return workload;
    }
    public void setWorkload(int workload) {
        if (workload > 40 || workload < 0) {
            throw new InvalidWorkload("Exceeded Maximum Overload: " + workload);
        } else {
            this.workload = workload;
        }
    }

    @Override
    public void category() {
        System.out.println(firstName + lastName + ": is a Staff.");
    }
    @Override
    public double ComputePayRoll() {
        double salary = (workload * 32 * 2) * 0.75;
        return salary;
    }
    @Override
    public String toString() {
    	return (super.toString() 
              + "Specialty: " + duty + "\n"
           	  + "Degree: " + workload + "\n");
    }   
    @Override
    public boolean equals(Staff staff) {
        if (super.equals(staff)) {
            return true;
        } else if (this.duty.equals(staff.duty)) {
            return true;
        } else if (this.workload == staff.workload) {
            return true;
        }
        return false;
    }
}