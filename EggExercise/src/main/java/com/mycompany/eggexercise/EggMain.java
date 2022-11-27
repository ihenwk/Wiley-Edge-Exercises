/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eggexercise;

import java.util.Scanner;

/**
 *
 * @author Ihesinachi Nwankwo
 */
public class EggMain {
    
    public static void main(String[] args) {
        
        System.out.println("Pick a number: "); // asks user to pick a number of eggs they want to calc. 
        Scanner sc = new Scanner(System.in); //create scanner object to take input from user 
        int userInput = Integer.parseInt(sc.nextLine()); // convert inout from user into int value that can be used in EggExercise Class when passed through setNumEggs method. 
        
        
        EggExercise doMyCalc = new EggExercise();   // created object called doMyCalc of the EggExercise class to access methods in that class. 
         
        doMyCalc.setNumEggs(userInput); // Use this line of code to set the user's choice of eggs. User inout passed through setNumEggs method in EggExercise class. 
        doMyCalc.Display(); // calls display function to print out the total number of gross, dozen and left over eggs. 
    }
    
}
