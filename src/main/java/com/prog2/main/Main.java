package java.com.prog2.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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

        ArrayList<Staff> staffs = new ArrayList<>();
        staffs = readStaffData("src/data/ListOfStaffs.txt");

        Staff s2 = new Staff("Chloe", "Bourgeois", "female", 26, 06, "Cook", 15);

        System.out.printf("%s\n", staffs.get(0).category());

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers = readTeacherData("src/data/ListOfTeachers.txt");

        Teacher t2 = new Teacher("Mari", "Agreste", "Female", 25, 7, "Poetry", "Bachelor", false);

        teachers.add(t2);

        writeTeacherFile("src/data/ListOfTeachers.txt", teachers);

        System.out.println("");
        System.out.printf("%s's payroll is %.2f\n", teachers.get(0).getfirstName(),teachers.get(1).computePayRoll());
   
        Department d = new Department("Science", 11, teachers, staffs);
        System.out.println("");
        System.out.println(d);

        try {

            d.addStaff(staffs.get(2));
        } catch (InvalidEmployeeID e) {
            System.out.println(e.getMessage());
        }
        System.out.println("");
        d.removeTeacher(teachers.get(0));
        System.out.println(d.getTeachers());
    }

    public static void writeStaffFile(String path, ArrayList<Staff> staffs) {
        File listOfStaffs = new File(path);

        try ( Scanner input = new Scanner(listOfStaffs)) {
            File newListOfStaffs = new File("src/data/NewListOfStaffs.txt");

            FileWriter fw = new FileWriter(newListOfStaffs);

            try ( PrintWriter pw = new PrintWriter(fw)) {
                for (Staff staff : staffs) {
                    pw.write(staff.getfirstName() + " ");
                    pw.write(staff.getlastName() + " ");
                    pw.write(staff.getGender() + " ");
                    pw.write(staff.getAge() + " ");
                    pw.write(staff.getemployeeID() + " ");
                    pw.write(staff.getDuty() + " ");
                    pw.write(staff.getWorkload() + " ");
                    pw.write("\n");
                }
                pw.close();
            }
        } catch (IOException e) {
            System.out.printf("Something went wrong with the input or output file.");
        }
    }

    public static void writeTeacherFile(String path, ArrayList<Teacher> teachers) {
        File listOfTeachers = new File(path);

        try ( Scanner input = new Scanner(listOfTeachers)) {
            File newListOfTeachers = new File("src/data/NewListOfTeachers.txt");

            FileWriter fw = new FileWriter(newListOfTeachers);

            try ( PrintWriter pw = new PrintWriter(fw)) {
                for (Teacher teacher : teachers) {
                    pw.write(teacher.getfirstName() + " ");
                    pw.write(teacher.getlastName() + " ");
                    pw.write(teacher.getGender() + " ");
                    pw.write(teacher.getAge() + " ");
                    pw.write(teacher.getemployeeID() + " ");
                    pw.write(teacher.getSpecialty() + " ");
                    pw.write(teacher.getDegree() + " ");
                    pw.write("\n");
                }
                pw.close();
            }
        } catch (IOException e) {
            System.out.printf("Something went wrong with the input or output file.");
        }
    }

    public static ArrayList<Staff> readStaffData(String path) {
        File ListOfStaffs = new File(path);

        ArrayList<Staff> staffs = new ArrayList<>();

        try ( Scanner input = new Scanner(ListOfStaffs)) {

            while (input.hasNext()) {
                String row = input.nextLine();

                String[] staffInfo = row.split(" ");

                String firstName = staffInfo[0];
                String lastName = staffInfo[1];
                String gender = staffInfo[2];
                int age;
                int employeeID;
                String duty = staffInfo[5];
                int workload;

                try {
                    age = Integer.parseInt(staffInfo[3]);
                } catch (NumberFormatException e) {
                    age = -1;
                }
                try {
                    employeeID = Integer.parseInt(staffInfo[4]);
                } catch (NumberFormatException e) {
                    employeeID = -1;
                }
                try {
                    workload = Integer.parseInt(staffInfo[6]);
                } catch (NumberFormatException e) {
                    workload = -1;
                }

                Staff s = new Staff(firstName, lastName, gender, age, employeeID, duty, workload);
                staffs.add(s);
            }
        } catch (IOException e) {
            System.out.printf("Something went wrong with the input or output file.");
        }

        return staffs;
    }

    public static ArrayList<Teacher> readTeacherData(String path) {
        File ListOfTeachers = new File(path);

        ArrayList<Teacher> teachers = new ArrayList<>();

        try ( Scanner input = new Scanner(ListOfTeachers)) {
            while (input.hasNext()) {
                String row = input.nextLine();

                String[] teacherInfo = row.split(" ");
                String firstName = teacherInfo[0];
                String lastName = teacherInfo[1];
                String gender = teacherInfo[2];
                int age;
                int employeeID;
                String specialty = teacherInfo[5];
                String degree = teacherInfo[6];
                boolean dean = Boolean.parseBoolean(teacherInfo[6]);
                try {
                    age = Integer.parseInt(teacherInfo[3]);
                } catch (NumberFormatException e) {
                    age = -1;
                }
                try {
                    employeeID = Integer.parseInt(teacherInfo[4]);
                } catch (NumberFormatException e) {
                    employeeID = -1;
                }

                Teacher teacher = new Teacher(firstName, lastName, gender, age, employeeID, specialty, degree, dean);
                teachers.add(teacher);

                }

            }catch (IOException e) {
            System.out.println(e);
        }

            return teachers;
        }

}