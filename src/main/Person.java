

public abstract class Person {

    protected String firstName;
    protected String lastName;
    protected String gender;
    protected int employeeId;
    protected int age;
    protected int departmentId;

    //abstract method
    public abstract void category(); // Teacher, Staff

    public Person() {
    	this.firstName = "";
    	this.lastName = "";
    	this.gender = "";
    	this.employeeId = 0;
    	this.age = 0;
    	this.departmentId = 0;
    }

    public Person(String firstName, String lastName, String gender, int employeeId, int age, int departmentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.employeeId = employeeId;
        this.age = age;
        this.departmentId = departmentId;
    }

    public String getfirstName() {
        return firstName;
    }
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getlastName() {
        return lastName;
    }
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getemployeeId() {
        return employeeId;
    }
    public void setemployeeId(int employeeId) {
        this.employeeId = employeeId;
    }    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }    
    public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	@Override
    public String toString() {

    	return ("\nFirst Name:" + firstName + "\n"
    			+ "Last Name: " +  lastName + "\n"
    			+ "Gender: " +  gender + "\n"
    			+ "Age: " +  age + "\n"
    			+ "Employee ID" +  employeeId + "\n"
    			+ "Department ID" +  departmentId + "\n");
    }
    
	@Override
    public boolean equals(Person otherPerson) {
    	if (this.firstName.equals(otherPerson.firstName)) {
    		return true;
    	} else if (this.lastName.equals(otherPerson.lastName)) {
    		return true;
    	} else if (this.gender.equals(otherPerson.gender)) {
    		return true;
    	} else if (this.employeeId == otherPerson.employeeId) {
            return true;
        } else if (this.age == otherPerson.age) {
        	return true;
        } if (this.departmentId == otherPerson.departmentId) {
        	return true;
        }
        return false;
    }
}
