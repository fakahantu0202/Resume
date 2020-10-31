/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew;

/**
 *
 * @author Muhammad Fakhruddin
 */
public class cgpa {double cgpa1 = 3.43;
    double gpa[] ={3.7,3.8,3.5};
    double sum=0;
    double finalcgpa=0;
    
    public void printgpa(){
         System.out.println(" Semester GPA  ");
         System.out.println("Sem 1: " +gpa[0]);
         System.out.println("Sem 2: " +gpa[1]);
         System.out.println("Sem 3: " +gpa[2]);
       
    }
    public double calCGPA(){
        
        for (int i=0; i<gpa.length; i++){
            sum+=gpa[i];
    }
       
        finalcgpa = sum/gpa.length;
        return finalcgpa;
    }
}