

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StaffTest {

    public StaffTest() {
    }

    @Test
    public void testGetDuty() {
        System.out.println("getDuty");
        Staff instance = new Staff("Lloyd", "Garm", 1, 17, 999999999, 1,"janitor", 32);
        String expResult = "janitor";
        String result = instance.getDuty();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDuty() {
        System.out.println("setDuty");
        Staff instance = new Staff("Lloyd", "Garm", 1, 17, 999999999, 1,"janitor", 32);
        String duty = "janitor";
        instance.setDuty(duty);
    }

    @Test
    public void testGetWorkload() {
        System.out.println("getWorkload");
        Staff instance = new Staff("Lloyd", "Garm", 1, 17, 999999999, 1,"janitor", 32);
        int expResult = 32;
        int result = instance.getWorkLoad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetWorkload() {
        System.out.println("setWorkload");
        int workload = 27;
        Staff instance = new Staff("Lloyd", "Garm", 1, 17, 999999999, 1,"janitor", 32);
        instance.setWorkLoad(workload);
    }

    @Test
    public void testCategory() {
        System.out.println("category");
        Staff instance = new Staff("Lloyd", "Garm", 1, 17, 999999999, 1,"janitor", 32);
        String expResult = "Staff";
        String result = instance.EmployeeCategory();
        assertEquals(expResult, result);
    }

    @Test
    public void testComputePayRoll() {
        System.out.println("ComputePayRoll");
        Staff instance = new Staff("Lloyd", "Garm", 1, 17, 999999999, 1,"janitor", 32);
        double expResult = 1536.0;
        double result = instance.ComputePayRoll();
        assertEquals(expResult, result, 0.0);
    }

}

