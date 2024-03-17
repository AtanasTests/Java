package primitive.types;

import java.util.Scanner;

/**
 * Enter 2 different numbers from the console and swap their value. Print out
 * the new values
 */

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();

        int temp = b;
        b = a;
        a = temp;
        System.out.println("A is " + a);
        System.out.println("B is " + b);
    }
}
