package loops;

import java.util.Scanner;

/**
 * To be entered by the user 2 numbers. And bring them all to the screen
 * numbers from least to greatest(example: '12', '15')
 */

public class Task5 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        if (a > b) {
            int buf = a;
            a = b;
            b = buf;
        }

        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
    }
}
