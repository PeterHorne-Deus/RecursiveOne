/*
 * Peter Horne-Deus
 * This program calculates the value of all the digits of a positive integer
 * RecursiveOne.java
 * April 15, 2020
 */

package recursiveone;

import javax.swing.*;

/**
 *
 * @author Peter
 */
public class RecursiveOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a non negative integer"));
        int sum = 0;
        
        //Ensuring Validity of inputed value
        if(num < 1){
            System.out.println("Number cannot be inputed");
        }
        else if(num <= 9){
            System.out.println("The sum of the digits of your number are:"
                    + num);
        }
        else if(num == 0){
            System.out.println("The sum of the digits of your number are:" 
                    + num);
        }
        else{
            //Sending into the recurssion
            sum(num,sum);
        }
    }
    
    /**
     * This method adds all the digits of the inputed value
     * @param original
     * @param currentSum 
     */
    public static void sum(int original,int currentSum){
        
        //This is the basecase
        if(original <= 9){
            
            currentSum = currentSum + original;
            
            System.out.println("The sum of the digits of your number are:"
                    + currentSum);
        }
        else{
            //Takes the last digit of the number and adds it to the sum
            currentSum = currentSum + (original % 10); 
            //Removes the final digit that has just been added
            original = original / 10;
            
            //Sending the updated values back into the method
            sum(original,currentSum);
        }
    }
}
