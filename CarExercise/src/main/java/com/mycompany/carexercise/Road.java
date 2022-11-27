/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carexercise;

/**
 *
 * @author Ihesinachi Nwankwo
 * subclass is car - subclass is the class that extends 
 * superclass is vehicle - superclass is the class that is extended. 
 * Because car extends vehicle it inherits all of the public class and methods for the superclass-vehicle. 
 * When an object of the sub-class i.e. peugeot is made, it can access all the public variables and methods in the superclass as well as its own class. 
 */
public class Road {
    public static void main(String[] args) {
        
        Car peugeot = new Car(); //created object from subclass 
        
        peugeot.colour= "Red";   //Assign vehicle class variables with values
        peugeot.model = "208";  // make sure value assigned matches data type of variable when it was declared e.g. model variable is string so value assigned must be a string too
        peugeot.numDoors = "5";
        peugeot.numWheels = "4";
        
        peugeot.typeOfFuel();  // can call method from car class. This method was not in the vehicle superclass.
        
        peugeot.vehicleDisplay(); 
        
        /*
        When program runs all the values assigned will be printed when vehicleDisplay() method is called. 
        
        My car is awesome!
        My car is red. 
        It has 5 doors.
        It has 4 wheels obvi.
        
        The typeOfFuel() method is also called. Petrol is printed to the console. 
        */
        
    }
    
}
