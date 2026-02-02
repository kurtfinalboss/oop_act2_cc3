/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus.bus;

/**
 *
 * @author paulh
 */
public class Driver {

    int yearExperience;

    Driver(int yearExperience){
        this.yearExperience = yearExperience;
    }

    String drive(){
        return " I take passengers to their destinations.";
    }

    String identity(){
        return "I am the bus driver. I have " + yearExperience + " years of experience." + drive() ;
    }
}