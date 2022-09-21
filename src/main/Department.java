
import java.util.ArrayList;
import java.util.Objects;

public class Department {
	private String name;
	private int departmentId;
	//private ArrayList<Teacher> teachersList = new ArrayList<Teacher>( );
	private ArrayList<Teacher> teachersList = new ArrayList<Teacher>( );
	private ArrayList<Staff> staffList = new ArrayList<Staff>( );
	private Teacher dean;
	
	public Department() {
		this.name = "";
		this.departmentId = 0;
		//this.employees = ;
		//this.dean = ;	
	}
	
	public Department(String name, int departmentId) {
		this.name = name;
		this.departmentId = departmentId;
	}

	public Department(String name, int departmentId, ArrayList<Teacher> teachersList, ArrayList<Staff> staffList,
			Teacher dean) {
		this.name = name;
		this.departmentId = departmentId;
		this.teachersList = teachersList;
		this.staffList = staffList;
		this.dean = dean;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public ArrayList<Teacher> getTeachersList() {
		return teachersList;
	}

	public void setTeachersList(ArrayList<Teacher> teachersList) {
		this.teachersList = teachersList;
	}

	public ArrayList<Staff> getStaffList() {
		return staffList;
	}

	public void setStaffList(ArrayList<Staff> staffList) {
		this.staffList = staffList;
	}

	public Teacher getDean() {
		return dean;
	}

	public void setDean(Teacher dean) {
		this.dean = dean;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dean, departmentId, name, staffList, teachersList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(dean, other.dean) && departmentId == other.departmentId
				&& Objects.equals(name, other.name) && Objects.equals(staffList, other.staffList)
				&& Objects.equals(teachersList, other.teachersList);
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", departmentId=" + departmentId + ", teachersList=" + teachersList
				+ ", staffList=" + staffList + ", dean=" + dean + "]";
	}
	
	public void aad_to_teacherList(Teacher teacher_object) {
		int teacherId=teacher_object.employeeId;
		
		if(teachersList.isEmpty()) {
			teachersList.add(teacher_object);
		}
		
		else {
			Boolean id_check = false;
			for(int i=0;i<teachersList.size();i++) {
				if(teachersList.get(i).getEmployeeId()==teacherId) {
					id_check = true;
					break;
				}
			}
			if (!id_check) {
				teachersList.add(teacher_object);
			}
			
			else { 
				System.out.println("teacherId already exists"); 
			}
		}
		
	}
	
	public void aad_to_staffList(Staff staff_object) {
		int staffId=staff_object.employeeId;
		
		if(staffList.isEmpty()) {
			staffList.add(staff_object);
		}
		
		else {
			Boolean id_check = false;
			for(int i=0;i<staffList.size();i++) {
				if(staffList.get(i).getEmployeeId()==staffId) {
					id_check = true;
					break;
				}
			}
			if (!id_check) {
				staffList.add(staff_object);
			}
			
			else { 
				System.out.println("staffId already exists"); 
			}
		}
		
	}
	
}
