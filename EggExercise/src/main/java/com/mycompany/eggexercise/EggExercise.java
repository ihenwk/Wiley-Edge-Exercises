/*
Exercise : Consider user has N eggs. Then display the no of eggs in gross (144 eggs make one gross) and no of eggs in dozen (12 eggs make one dozen) 
and the no of eggs that is left out remaining.The total no of eggs can be got as input. The program should display how many gross, how many dozen, 
and how many left over eggs the user has.
*/

package com.mycompany.eggexercise;

/**
 *
 * @author ihe
 */
public class EggExercise {
    
    // Declared all the variables at the start. 

    int numEggs; // number of eggs input by user 
    int numDozen = 12; // 12 eggs in a dozen
    int numLeftAboveGrossEggs; // number of eggs left over after gross 
    int numGross = 144; // number of eggs in a gross 1 gross = 144 eggs 
    int numExtras; // number of eggs left over above the gross and dozens 
    int numDozenTotal; // The number of dozens of eggs calculated 
    int numGrossTotal; // The number of gross of eggs calculated

    public void setNumEggs(int numEggs) {
        this.numEggs = numEggs;             //Needed to edit the number of eggs that need to be calculated so used a setter for numEggs. 
    }                                       // Code will pass value I decide to put as the quantity of eggs and will update value of variable numEggs and can then use numEggs in my calc methods below

   
   private int calculateGross(){
       numGrossTotal = numEggs/numGross; //code to find the number of gross in the number of eggs chosen 
       return numGrossTotal; // use return statement so I can use value later on in code. 
   }
   
   private int calculateEggsLeftAfterGross(){
       calculateGross();        //called method to use return value which was numGrossTotal
       numLeftAboveGrossEggs = numEggs%numGross; // code to find remainder of eggs left after gross calculated. 
       return numLeftAboveGrossEggs;  // use return statement so I can use value later on in code. 
   }
   
   private int calculateDozen(){
       calculateEggsLeftAfterGross(); // called method to use return value which was numLeftABoveGrossEggs
       numDozenTotal = numLeftAboveGrossEggs/numDozen;  //code to find out the number of dozens. This is calculated from eggs leftover from gross calc. 
       return numDozenTotal; // use return statement so I can use value later on in code. 
       
   }  
   
    private int calculateEggsLeftAfterDozen(){
       calculateEggsLeftAfterGross(); // called method to use return value which was numLeftABoveGrossEggs
       numExtras = numLeftAboveGrossEggs%numDozen;  //code to find the num of eggs left over after dozen. This will calc number of eggs left over overall. 
       return numExtras; // use return statement so I can use value later on in code. 
   }
    
    //Created a display method to put all the calcs together. 
   
  public void Display(){   // not returning anything so used void. 
      calculateGross();   // needed to call all the methods I had created for the calcs to use the return values in my print statements. 
      calculateEggsLeftAfterGross(); // Display method is public as object will be using this method to access all the private methods by calling those methods in Display method. 
      calculateDozen();
      calculateEggsLeftAfterDozen();
      
      System.out.println("Number of eggs you want to calculate: " + numEggs); // numEggs scope allows for all methods in this class to access it therefore can print the number of eggs the user chose.
      System.out.println("Number of eggs in gross: " + numGrossTotal); // prints number of eggs in gross
      System.out.println("Number of eggs in dozen: " + numDozenTotal ); // prints number of eggs on dozen
      System.out.println("Number of eggs leftover: " + numExtras); // prints number of eggs leftover 
  }
    
}
