// UserInput.java
import java.util.Scanner;

public class UserInput {
    
    private Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    public double getNumber() {
        System.out.print("Enter a number: ");
        return scanner.nextDouble();
    }

    public int getInteger() {
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }

    public double[] getArray() {
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        double[] arr = new double[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextDouble();
        }
        return arr;
    }

    public int getChoice() {
        System.out.println("\nSelect an operation:");
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        System.out.println("5. Fibonacci\n6. Sum of Array\n7. Mean of Array");
        System.out.println("8. Variance of Array\n9. Standard Deviation of Array");
        System.out.println("10. Exit");
        System.out.print("Enter choice: ");
        return scanner.nextInt();
    }

    public void closeScanner() {
        scanner.close();
    }
}
