/**
 * To implement methods into the code.
 *
 * @author (Rienzi Fernandez)
 * @version (1.0)
 */

import java.util.Scanner;

public class FillingAnArray
{
    static void clearScreen() {
        System.out.print('\u000C');
    }
    static void replcementCode()
    {
        System.out.print("Type true if you'd like to replace one or more elements in the array.  ");
    }
    static void elementValues(int number, String[] myStringArray) 
    {
        for (int i = 0; i < number; i++) {
                int numberPlusOne = i + 1;
                System.out.println("The string in position " + numberPlusOne + " is " + myStringArray[i] + ".");
            }
    }
    static void valueChange(int elementNumber, Scanner myScanner, String[] myStringArray) 
    {
        
                int printNumber = elementNumber + 1; // Adds one to the index.
                
                System.out.print("Enter a new value for element " + elementNumber + ":  ");
                myStringArray[elementNumber - 1] = myScanner.next();
    }
    static void promptAndReturn(int number, String[] myStringArray, Scanner myScanner)
    {
        for (int i = 0; i < number; i++) {
                int count = i + 1;
                System.out.print("Give the value for the string in position " + count + ":  ");
                myStringArray[i] = myScanner.next();
            }
            
            // Uses for loop to print out the elements in the array.
            System.out.println("Here are the values in the array.");
            
            elementValues(number, myStringArray);
    }
    public static void main(String[] args) {
        // Initialize Booleans to allow repetition of tasks.
        boolean playAgain = true;
        boolean fillAnElement = true;
        
        // Initialize an array of length 5.
        int number = 5;
        String[] myStringArray = {"0", "1", "2", "3", "4"};
        
        // Create a variable for the user to choose a particular element.
        int elementNumber;
        
        // Initialize scanner.
        Scanner myScanner = new Scanner(System.in);
        
        // The tasks of the program that the user can repeat through the boolean playAgain.
        do {
            clearScreen();

            System.out.println("There is an array with a place for five strings.");
            
            // Prompts user to input strings for the array.
            promptAndReturn(number, myStringArray, myScanner);
            
            // Prompts user for choice of changing the value of an element in the array.
            replcementCode();
            fillAnElement = myScanner.nextBoolean();
            
            // Gives the user a chance to change an element value by prompting the element number placement and the string value.
            while (fillAnElement) {
                System.out.print("Which element number would you like to replace?  Type 1 - 5.");
                elementNumber = myScanner.nextInt();
                valueChange(elementNumber, myScanner, myStringArray);
                
                replcementCode();
                fillAnElement = myScanner.nextBoolean();
            }
            
            // Prints the values in the array.
            System.out.println("Here are the values in the array.");
            
            elementValues(number, myStringArray);
            
            System.out.print("Would you like to start this process again!?  Type true or false:  ");
            playAgain = myScanner.nextBoolean();
        } while (playAgain);  // Program loops while user enters true, ends when user enters false.
    }
}
