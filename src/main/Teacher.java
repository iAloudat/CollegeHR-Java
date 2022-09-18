

public class Teacher extends Person implements Payroll {

    private String specialty;
    protected String degree;
    private boolean dean;

    public Teacher(String firstName, String lastName, String gender, int age, int employeeID, String specialty, String degree, boolean dean) {
        super(firstName, lastName, gender, age, employeeID);
        this.specialty = specialty;
        this.degree = degree;
        this.dean = dean;
    }

    public boolean equals(Teacher teacher) {
        if (!super.equals(teacher)) {
            return false;
        } else if (this.dean != teacher.dean) {
            return false;
        } else if (!this.specialty.equals(teacher.specialty)) {
            return false;
        } else if (!this.degree.equals(teacher.degree)) {
            return false;
        }
        return true;
    }

    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String category() {
        String category = String.format("%s %s is a teacher.", super.getfirstName(), super.getlastName());
        return category;
    }
    
    @Override
    public String toString() {
        String str = "";
        str += super.toString();
        str += String.format("Specialty: %s\n", specialty);
        str += String.format("Degree: %s\n", degree);
        return str;
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
        
//		switch (degree) {
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
//      }
        double salary = (32 * degreeRate * 2) * 0.85;
        return salary;
    }

}
