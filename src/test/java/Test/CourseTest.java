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
public class CourseTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void ifStartDateIsAfterEndDateThenThrowException() {
        
        new Course("Test", new LocalDate(2019, 8, 8), new LocalDate(2018, 10, 10));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void ifEndDateIsBeforeStartDateThenThrowException() {
        
        new Course("Test", new LocalDate(2019, 8, 8), new LocalDate(2017, 10, 10));
    }
    
    @Test
    public void modulesAreAddedToModuleArrayList() {
        
        Course testCourse = new Course("Test", new LocalDate(2018, 10, 7), new LocalDate(2019, 6, 16));
        Modules testModule1 = new Modules("Test Module 1", "CT114");
        Modules testModule2 = new Modules("Test Module 2", "CT115");
        testCourse.addModulesToCourse(testModule1);
        testCourse.addModulesToCourse(testModule2);
        ArrayList<Modules> modules = new ArrayList<>();
        modules.add(testModule1);
        modules.add(testModule2);
        assertThat(testCourse.getModules(), is(modules));
    }
}
