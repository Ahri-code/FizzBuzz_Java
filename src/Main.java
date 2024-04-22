import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Read the number inputted by the user
        Scanner read = new Scanner(System.in);
        System.out.print("Please insert a number: ");
        int number = read.nextInt();

// Checks if the number is divisible for 5 and 3
        if(number % 5 == 0 && number % 3 == 0) {
            System.out.print("FizzBuzz");
        }
// If previous condition is false checks if the number is divisible for 3
        else if(number % 3 == 0) {
            System.out.print("Buzz");
        }
// If previous condition is false checks if the number is divisible for 5
        else if(number % 5 == 0) {
            System.out.print("Fizz");
        }
// If all the previous condition are false print the number inputted
        else {
            System.out.print(number);
        }
    }
}