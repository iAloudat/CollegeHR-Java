

public class FullTime extends Teacher {

    private int workload;

    public FullTime(int workload, String firstName, String lastName, String gender, int age, int employeeID, String specialty, String degree, boolean dean) {
        super(firstName, lastName, gender, age, employeeID, specialty, degree, dean);
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

