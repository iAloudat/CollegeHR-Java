import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hansika
 */
public class TeacherTest {

    public TeacherTest() {
    }

    /**
     * Test of category method, of class Teacher.
     */
    @Test
    public void testCategory() {
        System.out.println("category");
        Teacher instance = new Teacher("Nia", "Smith", "Female", 18, 04, "Science", "Master", 2, false);
        String expResult = "Nia Smith is a teacher.";
        String result = instance.category();
        assertEquals(expResult, result);
    }

    /**
     * Test of ComputePayRoll method, of class Teacher.
     */
    @Test
    public void testComputePayRoll() {
        System.out.println("ComputePayRoll");
        Teacher instance = new Teacher("Nia", "Smith", "Female", 18, 04, "Science", "Master", 2, false);
        double expResult = 4460.8;
        double result = instance.ComputePayRoll();
        assertEquals(expResult, result, 0.0);
    }

}