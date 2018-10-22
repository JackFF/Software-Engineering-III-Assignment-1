/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codebind.se3assignment1;

import org.joda.time.*;


/**
 *
 * @author Jack
 */
public class Student {
    
    String studentFName;
    String studentLName;
    String studentAge;
    //String studentDOB;
    LocalDate studentDOB;
    String studentID;
    String studentUsername;
    String courseRegisteredFor;
    //String[] modulesRegisteredFor;
    Course course;
    
    public Student(String fName, String lName, String age, LocalDate dob, String id, Course course) {
        
        this.studentFName = fName;
        this.studentLName = lName;
        this.studentAge = age;
        this.studentDOB = dob;
        this.studentID = id;
        this.course = course;
    }
    
    public String getUsername() {
       
        studentUsername = studentFName + studentLName + studentAge;
        return studentUsername;
    }
    
    @Override
    public String toString() {
        
        return "Student Name:\t" + studentFName + " " + studentLName + "\nStudent Age:\t" + studentAge 
                + "\nStudent DOB:\t" + studentDOB + "\nStudent ID:\t" + studentID + "\nCourse:\t" + 
                course.courseName + "\n" + "Assigned Modules:\t" + course.listOfModulesInCourse + "\n";
    }
    
    public String courseRegisteredFor() {
        
        this.courseRegisteredFor = course.courseName;
        return this.courseRegisteredFor;
    }
    
    public String listOfModules() {
        
        return "" + course.listOfModulesInCourse;
    }
}