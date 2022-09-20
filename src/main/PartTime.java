

public class PartTime extends Teacher implements Payroll {

    private int workload;

    public PartTime(int workload, String firstName, String lastName, String gender, int age, int employeeID, String specialty, String degree, boolean dean) {
        super(firstName, lastName, gender, age, employeeID, specialty, degree);
        this.workload = workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public double ComputePayRoll() {
        double degreeRate = 0;
        
        if (degree == "PHD") {
        	degreeRate = 112;
        } else if (degree == "Master") {
        	degreeRate = 82;
        } else if (degree == "Bachelor") {
        	degreeRate = 42;
        } else {
        	return 0;
        }

        double salary = (workload * degreeRate * 2) * 0.76;
        return salary;
    }   

    @Override
    public String toString() {
        super.toString();
        return "PartTime{" + "workload=" + workload + '}';
    }

}
