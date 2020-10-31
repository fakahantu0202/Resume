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
public class NEW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("         <My Resume>  " );
        biodata a = new biodata();
        biodata b = new biodata();
        biodata c = new biodata();
        biodata d = new biodata();
        programming1 e = new programming1();
        cgpa f = new cgpa();
        skills g = new skills();
        workexperience h = new workexperience();
        a.printName();
        b.printAge();
        c.printAddress();
        d.printPhone();
        e.printProg();
        f.printgpa();
        System.out.println("Final CGPA : " + f.calCGPA());
        g.printskills();
        h.printworkexperience();
    }
    
}
