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
public class biodata {
    String name = "   MUHAMMAD FAKHRUDDIN BIN ABU ZARIM";
    int age = 25;
    String address = "No 19. LORONG TENGGIRI 27, "
            + "\n         BANDAR SEBERANG JAYA, "
            + "\n         13700 SEBERANG PERAI, "
            + "\n         PULAU PINANG.";
    String phone = "0142210989";
    
public void printName(){
    System.out.println("Name: "+ name);
}

public void printAge(){
    System.out.println("Age:     "+ age);
}

public void printAddress(){
    System.out.println("Address: "+ address);
}

public void printPhone(){
    System.out.println("Phone No: "+ phone);
}
}
