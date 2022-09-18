package com.prog2.main;

import static org.junit.Assert.assertEquals;

import java.com.prog2.main.Teacher;

import org.junit.Test;

public class TeacherTest {

    public TeacherTest() {
    }

    /**
     * Test of category method, of class Teacher.
     */
    @Test
    public void testCategory() {
        System.out.println("category");
        Teacher instance = new Teacher("Nia", "Smith", "Female", 18, 04, "Science", "Master", false);
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
        Teacher instance = new Teacher("Nia", "Smith", "Female", 18, 04, "Science", "Master", false);
        double expResult = 4460.8;
        double result = instance.computePayRoll();
        assertEquals(expResult, result, 0.0);
    }

}
