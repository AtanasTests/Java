package primitive.types;

import java.util.Scanner;

/**
 * Enter 3 different numbers from the console and print them in descending order.
 */

public class Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();

        System.out.println("Enter c:");
        int c = sc.nextInt();


        if (a > b && a > c) {
            System.out.print(a + ", ");
            if (b  >  c) {
                System.out.println(b + " " + b);
            } else {
                System.out.println(c + " " + b);
            }
        } else if (b > a && b > c) {
            System.out.print(b + " ");
            if (a > c) {
                System.out.println(a + " " + c);
            } else {
                System.out.println(c + " " + a);
            }
        } else {
            System.out.print(c + " ");
            if (a > b) {
                System.out.println(a + " " + b);
            } else {
                System.out.println(a + " " + a);
            }
        }
    }
}
