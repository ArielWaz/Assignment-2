/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letterscore;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Ariel
 */
public class LetterScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // by Ariel Wazana
        //Declaring variables
        double n100 = 100;
        double n90 = 90;
        double n80 = 80;
        double n70 = 70; 
        double n60 = 60;
        double n0 = 0;
        Scanner myInput = new Scanner(System.in);
        Random rand = new Random();
        //Code
        System.out.printf("Enter your score from 0 to 100:");
       double digitScore = myInput.nextDouble();
        
        if (n90 <= digitScore&&digitScore <= n100) {
            
        double A = digitScore;
        System.out.printf("Excellent!");
        
        }else
        if (n80 <= digitScore&&digitScore < n90) {
            
        double B = digitScore;
        System.out.printf("Well Done!");
        
        } else
        if (n70 <= digitScore&&digitScore < n80) {
            
        double C = digitScore;
        System.out.printf("Well Done!");
        
        } else
        if (n60 <= digitScore&&digitScore < n70) {
            
        double D = digitScore;
        System.out.printf("Passed.");
        
        } else
        if (n60 <= digitScore&&digitScore <= n0) {
            
        double F = digitScore;
        System.out.printf("Better Try Again!");
        
        }
                
        /*finding random score
        int score = rand.nextInt(100);
        n += 1;*/
        
           
        
    }
    
}
