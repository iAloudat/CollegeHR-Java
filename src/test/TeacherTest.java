
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TeacherTest {

    public TeacherTest() {
    }
    
    
    
    // Full Time
    @Test
    public void testFullTime() {
        System.out.println("FullTime");
        Teacher instance = new FullTime("Nia", "Smith", 2, 18, 999999999, 2,"Science", "Phd");
        String expResult = "FullTime";
        String result = instance.teacher_status();
        assertEquals(expResult, result);
    }

    @Test
    public void testComputePayRollFullTime() {
        System.out.println("ComputePayRoll FullTime");
        Teacher instance = new FullTime("Nia", "Smith", 2, 18, 999999999, 2,"Science", "Phd");
        double expResult = 6092.8;
        double result = ((FullTime) instance).ComputePayRoll();
        assertEquals(expResult, result, 0.0);
    }
    
    // PartTime
    @Test
    public void testPartTime() {
        System.out.println("PartTime");
        Teacher instance = new PartTime("Nia", "Smith", 2, 18, 999999999, 2,"Science", "Master", 20);
        String expResult = "PartTime";
        String result = instance.teacher_status();
        assertEquals(expResult, result);
    }

    @Test
    public void testComputePayRollPartTime() {
        System.out.println("ComputePayRoll PartTime");
        Teacher instance = new PartTime("Nia", "Smith", 2, 18, 999999999, 2,"Science", "Master", 20);
        double expResult = 2492.8;
        double result = ((PartTime) instance).ComputePayRoll();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testGetHoursWorked() {
        System.out.println("GetHoursWorked");
        Teacher instance = new PartTime("Nia", "Smith", 2, 18, 999999999, 2,"Science", "Master", 20);
        double expResult = 20;
        double result = ((PartTime) instance).getHoursWorked();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetDuty() {
        System.out.println("setDuty");
        Teacher instance = new PartTime("Nia", "Smith", 2, 18, 999999999, 2,"Science", "Master", 32);
        int HoursWorked = 32;
        ((PartTime) instance).setHoursWorked(HoursWorked);
    }

}
