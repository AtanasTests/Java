package primitive.types;

import java.util.Scanner;

/**
 * To display messages to the user and read 2 numbers from
 * keyboard A and B (may be floating point - double). Then read it
 * 3rd number C and check if it is m/u A and B. Deduce appropriately
 * message about whether C is between A and B.
 */

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        double a = sc.nextDouble();

        System.out.println("Enter B:");
        double b = sc.nextDouble();

        System.out.println("Enter C:");
        double c = sc.nextDouble();

        if ((a < c && c < b) || (b < c && c < a)) {
            System.out.println("C is between A and B!");
        } else {
            System.out.println("C is not between A and B!");
        }
    }
}
