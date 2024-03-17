package loops;

import java.util.Scanner;


/**
 * To read a number from the screen (console) and display the sum of all
 * numbers between 1 and the entered number(example: '7' )
 */
public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
    }
}
