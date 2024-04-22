import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Read the number inputted by the user
        Scanner read = new Scanner(System.in);
        String exit;
        do {
            System.out.print("Please insert a number: ");
            int number = read.nextInt();

// Checks if the number is divisible for 5 and 3
            if(number % 5 == 0 && number % 3 == 0) {
                System.out.print("FizzBuzz\n");
            }
// If previous condition is false checks if the number is divisible for 3
            else if(number % 3 == 0) {
                System.out.print("Buzz\n");
            }
// If previous condition is false checks if the number is divisible for 5
            else if(number % 5 == 0) {
                System.out.print("Fizz\n");
            }
// If all the previous condition are false prints the number inputted
            else {
                System.out.print(number + "\n");
            }
// Checks if the user wants to stop
            System.out.print("Would you like to stop? ");
            exit = read.next().toLowerCase();
        } while(!exit.equals("yes"));
    }
}