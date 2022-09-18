public class FullTime extends Teacher {

    private int workload;

    public FullTime(int workload, String fname, String lname, String gender, int age,
            int empID, String specialty, String degree, int exp, boolean dean) {
        super(fname, lname, gender, age, empID, specialty, degree, exp, dean);
        this.workload = workload;
    }

    @Override
    public String toString() {
        super.toString();
        return "FullTime{" + "workload=" + workload + '}';
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

}
