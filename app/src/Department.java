import java.util.ArrayList;

public class Department {

    private String deptName;
    private int deptNo;
    private ArrayList<Teacher> teachers;
    private ArrayList<Staff> staffs;

    public Department() {
    }

    public Department(String deptName, int deptNo, ArrayList<Teacher> teachers,
            ArrayList<Staff> staffs) {
        this.deptName = deptName;
        this.deptNo = deptNo;
        this.teachers = teachers;
        this.staffs = staffs;
    }

    public boolean equals(Department department) {

        if (!this.deptName.equals(department.deptName)) {
            return false;
        }

        if (this.deptNo != department.deptNo) {
            return false;
        }

        if (!this.teachers.equals(department.teachers)) {
            return false;
        }

        if (!this.staffs.equals(department.staffs)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        String str = "";

        str += String.format("Department Name: %s\n", deptName);
        str += String.format("\n");
        str += String.format("Department Number: %d\n", deptNo);
        str += String.format("\n");
        str += String.format("List of Department Staffs: \n");
        for (Staff staff : staffs) {
            str += String.format("" + staff);
            str += String.format("\n");
        }
        str += String.format("\n");
        str += String.format("List of Department Teachers: \n");
        for (Teacher teacher : teachers) {
            str += String.format("" + teacher);
            str += String.format("\n");
        }
        return str;
    }

    /**
     * This method adds a Teacher in the teachers array list in a department
     *
     * @param teacher
     */
    public void addTeacher(Teacher teacher) {
        for (Teacher t : teachers) {
            if (t == teacher) {
// this "if" statement checks if the teacher you want to add is already in that department
                throw new InvalidEmpID("Employee is already in the department");
            }
        }
        teachers.add(teacher);
    }

    /**
     * This method removes a Teacher from the teachers array list in a
     * department
     *
     * @param teacher
     */
    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    /**
     * This method adds a Staff in the staffs array list in a department
     *
     * @param staff
     */
    public void addStaff(Staff staff) {
        for (Staff s : staffs) {
            if (s == staff) {
// this "if" statement checks if the staff you want to add is already in that department
                throw new InvalidEmpID("Employee is already in the department");
            }
        }
        staffs.add(staff);
    }

    /**
     * This method removes a Staff from the staffs array list in a department
     *
     * @param staff
     */
    public void removeStaff(Staff staff) {
        staffs.remove(staff);
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(ArrayList<Staff> staffs) {
        this.staffs = staffs;
    }

}
