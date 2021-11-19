/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daycalculator;
import java.util.Scanner;
/**
 *
 * @author Ariel
 */
public class DayCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // by Ariel Wazana
        //Declaring variables
        String month = ("INVALID NUMBER OF MONTH IGNORE THE FOLLOWING MESSAGE!");
        int numberOfMonth;
        int daysInMonth = 0;
        Scanner myInput = new Scanner(System.in);
         //Declaring questions
        System.out.printf("Enter the number of the month:");
        int user_numberOfMonth = myInput.nextInt();
        System.out.printf("Enter the year:");
        int user_year = myInput.nextInt();
        //Doing the calculations with a switch loop
        switch(user_numberOfMonth){
        
        case 1:
            month = "January";
            daysInMonth = 31;
        break;
        case 2:
            month = "February";
            if(user_year%4==0){
            daysInMonth = 29;
            }
            else {
            daysInMonth = 31;
            }    
        break;
        case 3:
            month = "March";
            daysInMonth = 31;
        break;
        case 4:
            month = "April";
            daysInMonth = 30;
        break;
        case 5:
            month = "May";
            daysInMonth = 31;
        break;
        case 6:
            month = "June";
            daysInMonth = 30;
        break;
        case 7:
            month = "July";
            daysInMonth = 31;
        break;
        case 8:
            month = "August";
            daysInMonth = 31;
        break;
        case 9:
            month = "September";
            daysInMonth = 30;
        break;
        case 10:
            month = "October";
            daysInMonth = 31;
        break;
        case 11:
            month = "November";
            daysInMonth = 30;
        break;
        case 12:
            month = "December";
            daysInMonth = 31;
        break;
        default :
            System.out.printf(month);
        }
        //Outputting
        System.out.println( "------------------------------------------------------");
        System.out.printf("The month of " + month + " in the year " + user_year + " has " + daysInMonth + " days.");
        System.out.println( "\n------------------------------------------------------");
        }
    }
    
