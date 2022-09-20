

public class Staff extends Person implements Payroll {

    private String duty;
    private int workload;

    public Staff() {
        super();
    }

    public Staff(String firstName, String lastName, String gender, int age, int employeeID, String duty, int workload) {
        super(firstName, lastName, gender, age, employeeID);
        this.duty = duty;
        if (workload > 40 || workload < 0) {
            throw new InvalidWorkload("Invalid Workload" + workload);
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
            throw new InvalidWorkload("Invalid Workload" + workload);
        } else {
            this.workload = workload;
        }
    }

    @Override
    public String category() {
        String category = String.format("%s %s is a staff member.", super.getfirstName(), super.getlastName());

        return category;
    }

    @Override
    public double ComputePayRoll() {

        double salary = (workload * 32 * 2) * 0.75;

        return salary;
    }

    @Override
    public String toString() {
        String str = "";

        str += super.toString();
        str += String.format("Duty: %s\n", duty);
        str += String.format("Workload: %d\n", workload);

        return str;
    }
    
    public boolean equals(Staff staff) {
        if (!super.equals(staff)) {
            return false;
        } else if (!this.duty.equals(staff.duty)) {
            return false;
        } else if (this.workload != staff.workload) {
            return false;
        }
        return true;
    }
    
}
