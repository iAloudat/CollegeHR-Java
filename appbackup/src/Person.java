public abstract class Person {

    private String fname;
    private String lname;
    private String gender;
    private int age;
    private int empID;

    public Person() {
    }

    public Person(String fname, String lname, String gender, int age, int empID) {
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.age = age;
        this.empID = empID;
    }

    public abstract String category();

    public boolean equals(Person person) {
        if (this.empID != person.empID) {
            return false;
        }
        if (this.age != person.age) {
            return false;
        }
        if (!this.fname.equals(person.fname)) {
            return false;
        }
        if (!this.lname.equals(person.lname)) {
            return false;
        }
        if (!this.gender.equals(person.gender)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String str = "";

        str += String.format("First Name: %s\n", fname);
        str += String.format("Last Name: %s\n", lname);
        str += String.format("Gender: %s\n", gender);
        str += String.format("Age: %d\n", age);
        str += String.format("Employee ID: %d\n", empID);

        return str;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
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

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

}
