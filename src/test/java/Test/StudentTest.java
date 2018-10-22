/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import com.codebind.se3assignment1.*;
import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.is;
import org.joda.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jack
 */
public class StudentTest {
    
    @Test
    public void getUsernameTest() {
        
        Course testCourse = new Course("Test", new LocalDate(2018, 10, 7), new LocalDate(2019, 6, 16));
        Student testStudent = new Student("Test", "Student", "21", new LocalDate(1999, 4, 23), "15478258", testCourse);
        assertEquals(testStudent.getUsername(), "TestStudent21");
    }
    
    @Test
    public void getCourseNameTest() {
        
        Course testCourse = new Course("Test", new LocalDate(2018, 10, 7), new LocalDate(2019, 6, 16));
        Student testStudent = new Student("Test", "Student", "21", new LocalDate(1999, 4, 23), "15478258", testCourse);
        assertEquals(testCourse.getCourseName(), testStudent.courseRegisteredFor());
    }
}
