
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * @author adinashby
 *
 */

public class Main {

	/**
	 * Write your test code below in the main.
	 *
	 */
	public static void main(String[] args) {
		
		// employee_id list is to check unique employee_ids 
		ArrayList<Integer> employee_ids = new ArrayList<Integer>();
		
		//department_ids list is to check Existing department_ids
		ArrayList<Integer> department_ids = new ArrayList<Integer>();		
		
		
		//creating Department Dictionary
		Department Dep_phys= new Department("physics", 1);
		Department Dep_math= new Department("math", 2);
		Department Dep_eng= new Department("eng", 3);
		Department Dep_mng= new Department("mng", 4);
		Department Dep_sc= new Department("sc", 5);
		Hashtable<Integer, Department> department_dict = new Hashtable<Integer, Department>();
		department_dict.put(1, Dep_phys);
		department_dict.put(2, Dep_math);
		department_dict.put(3, Dep_eng);
		department_dict.put(4, Dep_mng);
		department_dict.put(5, Dep_sc);
		
		//creating department_ids list
		Enumeration enu = department_dict.keys();
        while (enu.hasMoreElements()) {
        	int idd = (Integer) enu.nextElement();
        	department_ids.add(idd);
        }
		
       
////////////////////////////////////////////////////////////////////////
		try {	
			//reading the text file line by line --> creating line_1_split array based on "," for each line
		      File myObj = new File("Text1.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        addPerson(data, department_ids, employee_ids, department_dict);
		      }
		      
		      myReader.close();
		    } 
		
		catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
////////////////////////////////////////////////////////////////////////		
		
		
		// printing the information of each department based on keys in dictionary
		Enumeration enu_1 = department_dict.keys();
        while (enu_1.hasMoreElements()) {
        	int idd = (Integer) enu_1.nextElement();
        	System.out.print(idd);		
        	System.out.print(": ");	
        	System.out.println(department_dict.get(idd).getName());	
        	System.out.println(department_dict.get(idd).getTeachersList());		
    		System.out.println(department_dict.get(idd).getStaffList());
        }
        
        
    	
////////////////////////////////////////////////////////////////////////       
       
		String line_1 = "staff,Soroosh,Rahimi,20,23,4387654,hammal,20,5";		
		addPerson(line_1,department_ids, employee_ids, department_dict);
		
		
		  try { 
			  FileWriter writer = new FileWriter("updated_file.txt", false);
			  Enumeration enu_3 = department_dict.keys();
		        while (enu_3.hasMoreElements()) {
		        	int idd = (Integer) enu_3.nextElement();
		        	System.out.println(idd);
		        	Department dep = department_dict.get(idd);	
		        	ArrayList<Teacher> teachers = dep.getTeachersList();		
		        	ArrayList<Staff> staffs = dep.getStaffList();

                    for (Staff staff : staffs) {//goes through all the staff in the array list
                        //all pw.write codes write data of each staff in the new file
                    	String line_w= "staff" + "," + staff.getFirstName() + "," + staff.getLastName() + 
                    			","  + staff.getEmployeeId() + "," + staff.getAge() + "," + staff.getPhone() + 
                    			"," + staff.getDuty() + "," + staff.getWorkLoad() + "," + staff.getDepartmentId();
	                    writer.write(line_w); 
	                    writer.write("\n"); // write new line
	          			
                    }
                    //writer.close(); 
                    
                    for (Teacher teacher : teachers) {//goes through all the teacher in the array list
                        //all pw.write codes write data of each teacher in the new file
                    	
                    	if(teacher.teacher_status().equals("partTime")) {
                    		String line_w= "partTime" + "," + teacher.getFirstName() + "," + teacher.getLastName() + 
                        			","  + teacher.getEmployeeId() + "," + teacher.getAge() + "," + teacher.getPhone() + 
                        			"," + teacher.getSpecialty() + "," + teacher.getDegree() + "," + ((PartTime)teacher).getHoursWorked() +
                        			"," + teacher.getDepartmentId();
    	                    writer.write(line_w); 
    	                    writer.write("\n"); // write new line
    	                     
                    		
                    	}
                    	
                    	else if(teacher.teacher_status().equals("fullTime")) {
                    		String line_w= "fullTime" + "," + teacher.getFirstName() + "," + teacher.getLastName() + 
                        			","  + teacher.getEmployeeId() + "," + teacher.getAge() + "," + teacher.getPhone() + 
                        			"," + teacher.getSpecialty() + "," + teacher.getDegree() + "," + teacher.getDepartmentId();
    	                    writer.write(line_w); 
    	                    writer.write("\n"); // write new line
    	                    
                    		
                    	}
                    	
                    	
                    	//writer.close(); 
                    }
	
                    //writer.close(); 
			  } 
		      writer.close();   
		  }      
		  catch (IOException e) {e.printStackTrace(); }
		  
		  
	
		 
		        

////////////////////////////////////////////////////////////////////////
		
		
		// printing the information of each department based on keys in dictionary
		Enumeration enu_2 = department_dict.keys();
		while (enu_2.hasMoreElements()) {
		int idd = (Integer) enu_2.nextElement();
		System.out.print(idd);		
		System.out.print(": ");	
		System.out.println(department_dict.get(idd).getName());	
		System.out.println(department_dict.get(idd).getTeachersList());		
		System.out.println(department_dict.get(idd).getStaffList());
}



////////////////////////////////////////////////////////////////////////
		
		
	}	
        
        
        
        
        ////////////////////////////////////////////////////////////////////////
    	
        
        
        public static void addPerson(String line_1, ArrayList<Integer> department_ids, ArrayList<Integer> employee_ids, Hashtable<Integer, Department> department_dict) {
	        String[] line_1_split = line_1.split(",");
	        
	        int emp_id = Integer. parseInt(line_1_split[3]);
	        int dep_id_1 = Integer. parseInt(line_1_split[(line_1_split.length)-1]);
	        
	        //comparing dep_id_1 with elements of department_ids list.
	        Boolean dep_check = false;
	        for (Integer t : department_ids) {
	            if (t == dep_id_1) {
	            	//System.out.println("Departme does not exist.");
	            	dep_check = true;
					break;
	                // new InvalidEmpID("Employee is already in the department");
	            }
	        }
	        
	        if (!dep_check) {
	        	System.out.println("Departme does not exist.");
	        	//System.out.println(dep_id_1);
	        	return;
	        }
	        
	        //comparing emp_id with elements of previous emp_ids to prevent duplicate emp_id.
	        Boolean id_check = false;
	        for (Integer t : employee_ids) {
	            if (t == emp_id) {
	            	System.out.println("Employee already exists.");
	            	id_check = true;
	            	// break;
					return;
	                // new InvalidEmpID("Employee is already in the department");
	            }
	        }
	        if (!id_check) {
	        	employee_ids.add(emp_id);
	        }
	        	
        	if (line_1_split[0].equals("partTime")){
				PartTime parTime_obj= new PartTime(line_1_split[1], line_1_split[2], Integer. parseInt(line_1_split[3]), Integer. parseInt(line_1_split[4]), Integer. parseInt(line_1_split[5]), Integer. parseInt(line_1_split[9]), line_1_split[6], line_1_split[7], Integer. parseInt(line_1_split[8]));		
				int dep_id = Integer. parseInt(line_1_split[9]);
				department_dict.get(dep_id).aad_to_teacherList(parTime_obj);


			}
			else if (line_1_split[0].equals("fullTime")){
				FullTime fullTime_obj= new FullTime(line_1_split[1], line_1_split[2], Integer. parseInt(line_1_split[3]), Integer. parseInt(line_1_split[4]), Integer. parseInt(line_1_split[5]), Integer. parseInt(line_1_split[8]), line_1_split[6], line_1_split[7]);		
				int dep_id = Integer. parseInt(line_1_split[8]);
				department_dict.get(dep_id).aad_to_teacherList(fullTime_obj);

				
			}
			else if (line_1_split[0].equals("staff")){
				Staff staff_obj= new Staff(line_1_split[1], line_1_split[2], Integer. parseInt(line_1_split[3]), Integer. parseInt(line_1_split[4]), Integer. parseInt(line_1_split[5]), Integer. parseInt(line_1_split[8]), line_1_split[6], Integer. parseInt(line_1_split[7]));		
				int dep_id = Integer. parseInt(line_1_split[8]);
				department_dict.get(dep_id).aad_to_staffList(staff_obj);

			}
			else {
				System.out.println("NonExistent employee category.");
			}
        	
        	return;					        
        }
      
        
        
	
}
