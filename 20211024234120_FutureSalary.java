/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuresalary;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Ariel
 */
public class FutureSalary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // by Ariel Wazana
        //Declaring imports
       Scanner myInput = new Scanner(System.in);
       Random rand = new Random();
       //Declaring variables + asking questions
       System.out.printf("Enter a salary:");
        int user_Salary = myInput.nextInt();
        System.out.printf("Enter a the numbers of years you've been working:");
        int user_Year = myInput.nextInt();
        //Code
        if (user_Year < 3){
        System.out.printf("In the next " + user_Year + " years, you will make this much extra money(per year): " + (user_Salary*0.03)*user_Year) ;
        }
        if (3 < user_Year&&user_Year < 10){
        System.out.printf("In the next " + user_Year + " years, you will make this much extra money(per year): " + (user_Salary*0.05)*user_Year) ;
        }
        if (user_Year >= 10){
        System.out.printf("In the next " + user_Year + " years, you will make this much extra money(per year): " + (user_Salary*0.08)*user_Year) ;
        }
        
    }
    
}
