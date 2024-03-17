package primitive.types;

import java.util.Scanner;

/**
 * Enter 3 numbers from the keyboard a1, a2 and a3. Swap their values so that
 * a1 should have the value of a2, a2 should have the value of a3, and a3 should have the old one
 * value of a1.
 */

public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a1: ");
        int a1 = scanner.nextInt();

        System.out.print("Enter a2: ");
        int a2 = scanner.nextInt();

        System.out.print("Enter a3: ");
        int a3 = scanner.nextInt();


        int temp = a1;
        a1 = a2;
        a2 = a3;
        a3 = temp;

        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);


    }
}
