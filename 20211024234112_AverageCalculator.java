/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averagecalculator;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Ariel
 */
public class AverageCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // by Ariel Wazana
        //Declaring imports
       Scanner myInput = new Scanner(System.in);
       Random rand = new Random();
        //Declaring variables
       double avg = 0.0;
        //Asking question and getting user response
       System.out.printf("Enter a positive number to indicate how many random scores will be generated: ");
       int user_num = myInput.nextInt();
       //Finding random numbers 
       
       //Doing Calculations
       for (int calc = 0; calc < user_num; calc++) {
        avg += rand.nextInt(100) + 1;
       Double finalResult = avg / user_num;
        //avg /= user_num;
        //if statement and final outputs
        if (avg > 40){
        avg *=0;
        System.out.printf("Your average is under 40%, cannot go any further.");
        }
        else 
        System.out.print("The average is " + finalResult + ".");
}           
        
      
    }
    
}
