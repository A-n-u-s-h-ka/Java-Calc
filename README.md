# Java Calculator Project  

## Description  
A simple calculator program in Java that supports:  
- **Basic operations:** Addition, Subtraction, Multiplication, Division  
- **Advanced operations:** Fibonacci sequence, Sum, Mean, Variance, Standard Deviation of an array 

## Files  
- **Main.java** → Controls the flow of the program.  
- **UserInput.java** → Handles user input.  
- **Calculator.java** → Performs all calculations.

### ** 1. Calculator.java (Performs Calculations)**  
 **Method Name**                          **Description**

 `int add(int a, int b)`               : Returns the sum of two numbers.
 `int subtract(int a, int b)`          : Returns the difference of two numbers. 
 `int multiply(int a, int b)`          : Returns the product of two numbers. 
 `double divide(int a, int b)`         : Returns the quotient of two numbers. Handles division by zero.
 `int fibonacci(int n)`                : Returns the nth Fibonacci number using recursion. 
 `int sumArray(int[] arr)`             : Returns the sum of all elements in an array. 
 `double meanArray(int[] arr)`         : Returns the mean (average) of an array. 
 `double varianceArray(int[] arr)`     : Returns the variance of an array. 
 `double stdDeviationArray(int[] arr)` : Returns the standard deviation of an array. 

 ### ** 2. UserInput.java (Handles User Input)**
 **Method Name**                 **Description**

 `int getNumber()`           : Takes an integer input from the user. 
 `int[] getArray()`          : Takes an array input from the user. 

 ### ** 3. Main.java (Controls Program Execution)**  
- Calls `UserInput` methods to take inputs.  
- Uses `Calculator` methods to perform operations.  
- Displays the results on the console.  


## How to Run  
1. Compile all Java files:
   javac Main.java UserInput.java Calculator.java
2. Run the program:  
   java Main
