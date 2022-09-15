import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alston
 */
public class StaffTest {

    public StaffTest() {
    }

    /**
     * Test of getDuty method, of class Staff.
     */
    @Test
    public void testGetDuty() {
        System.out.println("getDuty");
        Staff instance = new Staff("Lloyd", "Garm", "Male", 17, 01, "janitor", 32);
        String expResult = "janitor";
        String result = instance.getDuty();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDuty method, of class Staff.
     */
    @Test
    public void testSetDuty() {
        System.out.println("setDuty");
        String duty = "gymTeacher";
        Staff instance = new Staff("Lloyd", "Garm", "Male", 17, 01, "janitor", 32);
        instance.setDuty(duty);
    }

    /**
     * Test of getWorkload method, of class Staff.
     */
    @Test
    public void testGetWorkload() {
        System.out.println("getWorkload");
        Staff instance = new Staff("Lloyd", "Garm", "Male", 17, 01, "janitor", 32);
        int expResult = 32;
        int result = instance.getWorkload();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWorkload method, of class Staff.
     */
    @Test
    public void testSetWorkload() {
        System.out.println("setWorkload");
        int workload = 27;
        Staff instance = new Staff("Lloyd", "Garm", "Male", 17, 01, "janitor", 32);
        instance.setWorkload(workload);
    }

    /**
     * Test of category method, of class Staff.
     */
    @Test
    public void testCategory() {
        System.out.println("category");
        Staff instance = new Staff("Lloyd", "Garm", "Male", 17, 01, "janitor", 32);
        String expResult = "Lloyd Garm is a staff member.";
        String result = instance.category();
        assertEquals(expResult, result);
    }

    /**
     * Test of ComputePayRoll method, of class Staff.
     */
    @Test
    public void testComputePayRoll() {
        System.out.println("ComputePayRoll");
        Staff instance = new Staff("Lloyd", "Garm", "Male", 17, 01, "janitor", 32);
        double expResult = 1536.0;
        double result = instance.ComputePayRoll();
        assertEquals(expResult, result, 0.0);
    }

}
