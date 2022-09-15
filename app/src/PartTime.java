public class PartTime extends Teacher implements Payroll {

    private int workload;// its hoursWorked

    public PartTime(int workload, String fname, String lname, String gender, int age, int empID, String specialty, String degree, int exp, boolean dean) {
        super(fname, lname, gender, age, empID, specialty, degree, exp, dean);
        this.workload = workload;
    }

    @Override
    public String toString() {
        super.toString();
        return "PartTime{" + "workload=" + workload + '}';
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
        switch (getDegree()) {

            case "PhD":
                degreeRate = 112;
                break;

            case "Master":
                degreeRate = 82;
                break;

            case "Bachelor":
                degreeRate = 42;
                break;

            default:
                return 0;

        }

        double salary = (workload * degreeRate * 2) * 0.76;

        return salary;
    }

}
