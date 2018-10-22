/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codebind.se3assignment1;

import java.util.ArrayList;
import org.joda.time.LocalDate;

/**
 *
 * @author Jack
 */
public class main {
    
    public static void main(String[] args) {
        
        ArrayList<Course> course = new ArrayList<>();
        Course CSIT = new Course("CS&IT", new LocalDate("2018-09-07"), new LocalDate("2019-06-15"));
        Course ME = new Course("Mechanical Engineering", new LocalDate("2018-09-07"), new LocalDate("2019-06-15"));
        Course EE = new Course("Electrical Enginnering", new LocalDate("2018-09-07"), new LocalDate("2019-06-15"));
        course.add(CSIT);
        course.add(ME);
        course.add(EE);
        //System.out.print(course);
        
        ArrayList<Module> module = new ArrayList<>();
        Module Programming = new Module("Programming", "CT117");
        Module Fundamentals = new Module("Fundamentals", "CT118");
        Module Electricals = new Module("Electricals", "CT119");
        Module Materials = new Module("Materials", "CT120");
        Module ProfessionalSkills = new Module("Professional Skills", "CT121");
        Module mudderfuck = new Module("mudderfuck", "CT122");
        module.add(Programming);
        module.add(Fundamentals);
        module.add(Electricals);
        module.add(Materials);
        module.add(ProfessionalSkills);
        module.add(mudderfuck);
        //System.out.print(module);
        
        CSIT.addModulesToCourse(Programming);
        CSIT.addModulesToCourse(Fundamentals);
        CSIT.addModulesToCourse(Electricals);
        ME.addModulesToCourse(Fundamentals);
        ME.addModulesToCourse(Materials);
        ME.addModulesToCourse(mudderfuck);
        EE.addModulesToCourse(mudderfuck);
        EE.addModulesToCourse(Programming);
        EE.addModulesToCourse(Electricals);
        /*System.out.print(CSIT.listofModulesInCourse);
        System.out.print(ME.listofModulesInCourse);
        System.out.print(EE.listofModulesInCourse);*/
        
        ArrayList<Student> student = new ArrayList<>();
        Student jf = new Student("Jack", "Foley", "21", new LocalDate("1997-04-23"), "15478258", CSIT);
        Student mf = new Student("Maura", "Foley", "19", new LocalDate("1999-03-27"), "18123456", ME);
        Student ff = new Student("Francis", "Foley", "56", new LocalDate("1960-09-07"), "76476548", CSIT);
        Student ef = new Student("Elaine", "Foley", "50", new LocalDate("1966-08-07"), "82478958", EE);
        student.add(jf);
        student.add(mf);
        student.add(ff);
        student.add(ef);
        //System.out.print(student);
        
        Programming.addStudentsToModule(jf);
        Programming.addStudentsToModule(mf);
        Fundamentals.addStudentsToModule(jf);
        Electricals.addStudentsToModule(jf);
        //System.out.print(Programming.listOfStudentsInModule);
        //System.out.print(course);
    }
}
