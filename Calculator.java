// Calculator.java
import java.util.*;
public class Calculator {

    // Basic Operations
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
        return a / b;
    }

    // Fibonacci Sequence
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Array Operations
    public static double sumArray(double[] arr) {
        double sum = 0;
        for (double num : arr) sum += num;
        return sum;
    }

    public static double meanArray(double[] arr) {
        return sumArray(arr) / arr.length;
    }

    public static double varianceArray(double[] arr) {
        double mean = meanArray(arr);
        double sumSqDiff = 0;
        for (double num : arr) sumSqDiff += Math.pow(num - mean, 2);
        return sumSqDiff / arr.length;
    }

    public static double stdDeviationArray(double[] arr) {
        return Math.sqrt(varianceArray(arr));
    }
}
