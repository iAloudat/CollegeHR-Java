

public class PartTime extends Teacher implements Payroll {

    private int workload;

    public PartTime(int workload, String firstName, String lastName, String gender, int age, int employeeID, String specialty, String degree, boolean dean) {
        super(firstName, lastName, gender, age, employeeID, specialty, degree, dean);
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
    public double computePayRoll() {

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
    
        
//        switch (getDegree()) {
//
//            case "PhD":
//                degreeRate = 112;
//                break;
//
//            case "Master":
//                degreeRate = 82;
//                break;
//
//            case "Bachelor":
//                degreeRate = 42;
//                break;
//
//            default:
//                return 0;
//
//        }

        double salary = (workload * degreeRate * 2) * 0.76;

        return salary;
    }

}
