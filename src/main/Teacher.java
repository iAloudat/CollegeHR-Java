

public class Teacher extends Person {

    private String specialty;
    protected String degree;


    public Teacher(String firstName, String lastName, String gender, int age, int employeeID, String specialty, String degree) {
        super(firstName, lastName, gender, age, employeeID);
        this.specialty = specialty;
        this.degree = degree;
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
    
    // override to the abstract class to define the category
    @Override
    public String category() {
        String category = String.format("%s %s is a teacher." + super.getfirstName(), super.getlastName());
        return category;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Specialty: " + specialty + "\n"
        		+ "Degree: " + degree + "\n";
    }   

    public boolean equals(Teacher teacher) {
        if (!super.equals(teacher)) {
            return false;
        } else if (!this.specialty.equals(teacher.specialty)) {
            return false;
        } else if (!this.degree.equals(teacher.degree)) {
            return false;
        }
        return true;
    }

}
