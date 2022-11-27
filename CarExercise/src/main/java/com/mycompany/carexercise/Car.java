/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carexercise;

/**
 *
 * @author Ihesinachi Nwankwo
 * 
 * For car to inherit all the methods and variables from vehicle, the car class must used the keyword 'extends'. 
 */
public class Car extends Vehicle { // 'extends' keyword used to allow car to inherit public methods and variables from vehicle class.

    
       public void typeOfFuel(){
            System.out.println("Petrol");  // added additional method specific to the car class. 
        }
    }
    
