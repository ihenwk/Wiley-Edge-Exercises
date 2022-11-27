/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.carexercise;

/**
 *
 * @author Ihesinachi Nwankwo
 */
public class Vehicle {

 // created variables for general properties that describe any vehicle. 
 public String colour;
 public String numDoors;
 public String numWheels;
 public String model;

    public Vehicle() {
    }
 
// created getters and setters for all the variables I have declared. 
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(String numDoors) {
        this.numDoors = numDoors;
    }

    public String getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(String numWheels) {
        this.numWheels = numWheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Print statements using variables I have declared. Will be used when I create an object of car class. 
   public void vehicleDisplay(){
       System.out.println( "My car is awesome! ");
       System.out.println("My car is " + colour + ".");
       System.out.println("It has " + numDoors + " doors.");
       System.out.println("It has " + numWheels + " wheels obvi");
       System.out.println("My car model is " + model);
   }
   
    }
 
 
  
