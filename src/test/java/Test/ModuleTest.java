/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import com.codebind.se3assignment1.*;
import com.codebind.se3assignment1.Module;
import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.is;
import org.joda.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jack
 */
public class ModuleTest {
    
    @Test
    public void studentsAreAddedToStudentsArrayList() {
        
        Course testCourse = new Course("Test", new LocalDate(2018, 10, 7), new LocalDate(2019, 6, 16));
        Module testModule = new Module("Test Module", "CT114");
        Student testStudent1 = new Student("Test", "Student 1", "21", new LocalDate(1999, 4, 23), "15478258", testCourse);
        Student testStudent2 = new Student("Test", "Test Student 2", "19", new LocalDate(1997, 3, 27), "123456789", testCourse);
        testModule.addStudentsToModule(testStudent1);
        testModule.addStudentsToModule(testStudent2);
        ArrayList<Student> students = new ArrayList<>();
        students.add(testStudent1);
        students.add(testStudent2);
        assertThat(testModule.getStudents(), is(students));
    }
}
