package loops;

import java.util.Scanner;


/**
 * Enter a number from the keyboard and determine if it is prime. Just
 * is a number that is divisible ONLY by 1 and itself.
 */
public class Task9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = sc.nextInt();

        boolean isPrime = true;


        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " isn't prime");
        }
    }
}
