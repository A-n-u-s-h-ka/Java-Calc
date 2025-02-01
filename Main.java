// Main.java
/* 
   Name: Anushka Chatterjee
   PRN: 23070126015
   Batch: AIML-A1
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        int choice;

        do {
            choice = userInput.getChoice();
            switch (choice) {
                case 1: {
                    double a = userInput.getNumber();
                    double b = userInput.getNumber();
                    System.out.println("Result: " + Calculator.add(a, b));
                    break;
                }
                case 2: {
                    double a = userInput.getNumber();
                    double b = userInput.getNumber();
                    System.out.println("Result: " + Calculator.subtract(a, b));
                    break;
                }
                case 3: {
                    double a = userInput.getNumber();
                    double b = userInput.getNumber();
                    System.out.println("Result: " + Calculator.multiply(a, b));
                    break;
                }
                case 4: {
                    double a = userInput.getNumber();
                    double b = userInput.getNumber();
                    System.out.println("Result: " + Calculator.divide(a, b));
                    break;
                }
                case 5: {
                    int n = userInput.getInteger();
                    System.out.println("Fibonacci(" + n + ") = " + Calculator.fibonacci(n));
                    break;
                }
                case 6: {
                    double[] arr = userInput.getArray();
                    System.out.println("Sum: " + Calculator.sumArray(arr));
                    break;
                }
                case 7: {
                    double[] arr = userInput.getArray();
                    System.out.println("Mean: " + Calculator.meanArray(arr));
                    break;
                }
                case 8: {
                    double[] arr = userInput.getArray();
                    System.out.println("Variance: " + Calculator.varianceArray(arr));
                    break;
                }
                case 9: {
                    double[] arr = userInput.getArray();
                    System.out.println("Standard Deviation: " + Calculator.stdDeviationArray(arr));
                    break;
                }
                case 10:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 10);

        userInput.closeScanner();
    }
}
