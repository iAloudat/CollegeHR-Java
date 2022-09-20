
import java.util.ArrayList;

public class Department {

    private String departmentName;
    private int departmentNo;
    private ArrayList<Teacher> teachers;
    private ArrayList<Staff> staffs;

    public Department() {
    }

    public Department(String departmentName, int departmentNo, ArrayList<Teacher> teachers, ArrayList<Staff> staffs) {
        this.departmentName = departmentName;
        this.departmentNo = departmentNo;
        this.teachers = teachers;
        this.staffs = staffs;
    }

    public String getdepartmentName() {
        return departmentName;
    }

    public void setdepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getdepartmentNo() {
        return departmentNo;
    }

    public void setdepartmentNo(int departmentNo) {
        this.departmentNo = departmentNo;
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
    
    
    // add teacher, remove teacher / add staff remove staff
    public void addTeacher(Teacher teacher) {
        for (Teacher t : teachers) {
            if (t == teacher) {
                throw new InvalidEmployeeID("Employee is already in the department");
            }
        }
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }
    public void addStaff(Staff staff) {
        for (Staff s : staffs) {
            if (s == staff) {
                throw new InvalidEmployeeID("Employee is already in the department");
            }
        }
        staffs.add(staff);
    }

    public void removeStaff(Staff staff) {
        staffs.remove(staff);
    }
    
    
    @Override
    public String toString() {
        String str = "";

        str += String.format("Department Name: %s\n", departmentName);
        str += String.format("\n");
        str += String.format("Department Number: %d\n", departmentNo);
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

    public boolean equals(Department department) {

        if (!this.departmentName.equals(department.departmentName)) {
            return false;
        }

        if (this.departmentNo != department.departmentNo) {
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
}
