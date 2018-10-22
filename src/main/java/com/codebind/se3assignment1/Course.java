/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codebind.se3assignment1;

import java.util.ArrayList;
import org.joda.time.*;

/**
 *
 * @author Jack
 */
public class Course {
    
    String courseName;
    LocalDate academicStartDate;
    LocalDate academicEndDate;
    ArrayList<Module> listOfModulesInCourse = new ArrayList<>();
    
    public Course(String name, LocalDate academicStart, LocalDate academicEnd) {
        
        this.courseName = name;
        
        if(academicEnd.isBefore(academicStart)) {
            
            throw new IllegalArgumentException("The academic end date is before the academic start date");
        }
        
        if(academicStart.isEqual(academicEnd)) {
            
            throw new IllegalArgumentException("The academic start date and the acdemic end date are equal");
        }
        
        this.academicStartDate = academicStart;
        this.academicEndDate = academicEnd;
    }
    
    public void addModulesToCourse(Module module) {
        
        if(listOfModulesInCourse.contains(module) == false) {
            
            this.listOfModulesInCourse.add(module);
        }
    }
    
    public ArrayList<Module> getModules() {
        
        return listOfModulesInCourse;
    }
    
    public String getCourseName() {
        
        return courseName;
    }
    
    @Override
    public String toString() {
        
        return "Course Name:\t\t" + courseName + "\n" + "Academic Start Date:\t" + academicStartDate + 
                "\n" + "Academic End Date:\t" + academicEndDate + "\n" + "List of modules in course:\n" 
                + listOfModulesInCourse;
    }
}