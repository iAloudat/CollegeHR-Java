

public abstract class Person {

    protected String firstName;
    private String lastName;
    private String gender;
    private int employeeID;
    private int age;
    private int departmentId;

    //abstract method
    public abstract void category();

    public Person() {
    	this.firstName = "";
    	this.lastName = "";
    	this.gender = "";
    	this.employeeID = 0;
    	this.age = 0;
    	this.departmentId = 0;
    }

    public Person(String firstName, String lastName, String gender, int employeeID, int age, int departmentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.employeeID = employeeID;
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

    public int getemployeeID() {
        return employeeID;
    }

    public void setemployeeID(int employeeID) {
        this.employeeID = employeeID;
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
    			+ "Employee ID" +  departmentId + "\n"
    			+ "Department ID" +  employeeID + "\n");
    }
    
	@Override
    public boolean equals(Person otherPerson) {
    	if (this.firstName.equals(otherPerson.firstName)) {
    		return true;
    	}
    	if (this.lastName.equals(otherPerson.lastName)) {
    		return true;
    	}
    	if (this.gender.equals(otherPerson.gender)) {
    		return true;
    	}
        if (this.employeeID == otherPerson.employeeID) {
            return true;
        }
        if (this.age == otherPerson.age) {
        	return true;
        }        
        if (this.departmentId == otherPerson.departmentId) {
        	return true;
        }
        
        return false;
    }
}
