/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codebind.se3assignment1;

import java.util.ArrayList;


/**
 *
 * @author Jack
 */
public class Modules {
    
    String moduleName;
    String moduleID;
    ArrayList<Student> listOfStudentsInModule = new ArrayList<>();
    
    public Modules(String name, String id) {
        
        this.moduleName = name;
        this.moduleID = id;
    }
    
    public void addStudentsToModule(Student student) {
        
        if(listOfStudentsInModule.contains(student) == false) {
            
            this.listOfStudentsInModule.add(student);
        }
    }
    
    public ArrayList<Student> getStudents() {
        
        return listOfStudentsInModule;
    }
    
    @Override
    public String toString() {
        
        return "Module Name:\t" + moduleName + "\n" + "Module ID:\t" + moduleID + "\n\n";
    }
}