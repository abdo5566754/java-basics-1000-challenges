

// 1. Print the sum of two numbers entered by the user.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Read a data from keyboard
        Scanner in = new Scanner(System.in);

        // Declare three double variable
        double firstNumber, secondNumber, summation;


        // Hint for user
        System.out.print("Enter first number : ");

        // Reads any double number and assignment to firstNumber
        firstNumber = in.nextDouble();

        // Hint for user
        System.out.print("Enter second number : ");

        // Reads any double number and assignment to secondNumber
        secondNumber = in.nextDouble();


        // assignment summation two variable firstNumber and secondNumber to summation variable
        summation = firstNumber + secondNumber;

        // print the result
        System.out.println("Result is : " + summation);


        // Close scanner to free resources
        in.close();
    }
}