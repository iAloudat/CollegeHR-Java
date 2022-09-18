package java.com.prog2.main;

public abstract class Person {

    private String firstName;
    private String lastName;
    private String gender;
    private int employeeID;
    private int age;

    public Person() {
    }

    public Person(String firstName, String lastName, String gender, int employeeID, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.employeeID = employeeID;
        this.age = age;
    }

    public abstract String category();

    public boolean equals(Person person) {
    	if (!this.firstName.equals(person.firstName)) {
    		return false;
    	}
    	if (!this.lastName.equals(person.lastName)) {
    		return false;
    	}
    	if (!this.gender.equals(person.gender)) {
    		return false;
    	}
        if (this.employeeID != person.employeeID) {
            return false;
        }
        if (this.age != person.age) {
        	return false;
        }
        return true;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getemployeeID() {
        return employeeID;
    }

    public void setemployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {

    	return ("\nFirst Name:" + firstName + "\n"
    			+ "Last Name: " +  lastName + "\n"
    			+ "Gender: " +  gender + "\n"
    			+ "Age: " +  age + "\n"
    			+ "Employee ID" +  employeeID + "\n");
    	
//        String str = "";
//
//        str += String.format("First Name: %s\n", firstName);
//        str += String.format("Last Name: %s\n", lastName);
//        str += String.format("Gender: %s\n", gender);
//        str += String.format("Age: %d\n", age);
//        str += String.format("Employee ID: %d\n", employeeID);
//
//        return str;
    	
    }
}
